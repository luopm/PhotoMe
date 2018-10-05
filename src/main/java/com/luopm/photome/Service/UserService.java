package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ResponseUtil Login(User user){
        ResponseUtil responseUtil = new ResponseUtil(1,"登录成功",null);
        try {
            User Ruser = userMapper.selectUsersByUserName(user);
            if (Ruser == null){
                responseUtil.setResultCode(-1);
                responseUtil.setResultMsg("用户不存在");
            }
            else if (!Ruser.getPhotomeUserUserpassword().equals(user.getPhotomeUserUserpassword())){
                responseUtil.setResultCode(0);
                responseUtil.setResultMsg("密码错误");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil addUser(User user){
        user.setPhotomeUserUsercreatdate(new Date());
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMapper.insert(user) == 1){
                responseUtil.setResultObject(user);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("新增用户成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil deleteUser(User user){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMapper.deleteByUserName(user) == 1){
                responseUtil.setResultObject(user);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("删除用户成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil updateUser(User user){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMapper.updateUser(user) == 1){
                responseUtil.setResultObject(userMapper.selectUsersByUserName(user));
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("更新用户成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil getUser(User user){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            responseUtil.setResultObject(userMapper.selectUsersByUserName(user));
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取用户成功");
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public ResponseUtil getAllUser(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<User> userList = userMapper.selectALLUsers();
            PageInfo result = new PageInfo(userList);
            responseUtil.setResultObject(result);
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取用户成功");
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }
}