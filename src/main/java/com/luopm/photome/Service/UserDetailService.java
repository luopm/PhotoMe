package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserDetailMapper;
import com.luopm.photome.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailService")
public class UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    public int addUserDetail(UserDetail userDetail){
        return userDetailMapper.insert(userDetail);
    }

    public int deleteUserDetail(UserDetail userDetail){
        return userDetailMapper.deleteByPrimaryKey(userDetail.getPhotomeUserdetailId());
    }

    public int updateUserDetail(UserDetail userDetail){

        return userDetailMapper.updateByPrimaryKey(userDetail);
    }
    public UserDetail getUserDetail(UserDetail userDetail){
        return userDetailMapper.selectByPrimaryKey(userDetail.getPhotomeUserdetailId());
    }

    public List<UserDetail> getDetailByUserName(String userName) {
        return userDetailMapper.selectDetailByUserName(userName);
    }
    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<UserDetail> findAllUserDetail(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDetail> userDetailList = userDetailMapper.selectALLDetail();
        PageInfo result = new PageInfo(userDetailList);
        return result;
    }

}