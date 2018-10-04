package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ResponseUtil Login(User user){
        ResponseUtil responseUtil = new ResponseUtil();
        List<User> list = getUsersByUserName(user.getPhotomeUserUsername());
        String resultMsg="密码错误";
        int resultCode = 0;
        if (list == null){
            resultCode = -1;
            resultMsg = "用户不存在";
        }
        else if (list != null ){
            if (user.getPhotomeUserUserpassword().equals(list.get(0).getPhotomeUserUserpassword()) ){
                resultCode = 1;
                resultMsg = "登录成功";
            }
        }
        responseUtil.setResultCode(resultCode);
        responseUtil.setResultMsg(resultMsg);
        responseUtil.setResultObject(list);
        return  responseUtil;
    }

    public int addUser(User user){
        return userMapper.insert(user);
    }
    public int deleteUser(User user){
        return userMapper.deleteByPrimaryKey(user.getPhotomeUserId());
    }
    public int updateUser(User user){
        return userMapper.updateByPrimaryKey(user);
    }
    public User getUser(User user){
        return userMapper.selectByPrimaryKey(user.getPhotomeUserId());
    }
    public List<User> getUsersByUserName(String UserName) {
        return userMapper.selectUsersByUserName(UserName);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectALLUsers();
        PageInfo result = new PageInfo(userList);
        return result;
    }



}