package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserDetailMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailService")
public class UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    public ResponseUtil addUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.insert(userDetail) == 1){
                responseUtil.setResultObject(userDetail);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("新增用户详情成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil deleteUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.deleteByUserName(userDetail) == 1){
                responseUtil.setResultObject(userDetail);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("删除用户详情成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil updateUserDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userDetailMapper.updateByUserName(userDetail) == 1){
                responseUtil.setResultObject(userDetailMapper.selectDetailByUserName(userDetail));
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("更新用户详情成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil getDetail(UserDetail userDetail){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            responseUtil.setResultObject(userDetailMapper.selectDetailByUserName(userDetail));
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取用户详情成功");
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
    public ResponseUtil getAllUserDetail(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserDetail> userDetailList = userDetailMapper.selectALLDetail();
            PageInfo result = new PageInfo(userDetailList);
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