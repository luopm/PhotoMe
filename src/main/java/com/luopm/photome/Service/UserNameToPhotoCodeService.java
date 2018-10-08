package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserNameToPhotoCodeMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserNameToPhotoCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userNameToPhotoCodeService")
public class UserNameToPhotoCodeService {

    @Autowired
    private UserNameToPhotoCodeMapper userNameToPhotoCodeMapper;

    public ResponseUtil addUTC(UserNameToPhotoCode userNameToPhotoCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userNameToPhotoCodeMapper.insert(userNameToPhotoCode) >= 1){
                responseUtil.setResponseUtil(1,"注册UNTPC成功",
                       userNameToPhotoCode,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil deleteByUTC(UserNameToPhotoCode userNameToPhotoCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            int deleteNum = userNameToPhotoCodeMapper.deleteByUTC(userNameToPhotoCode);
            if ( deleteNum >= 1){
                responseUtil.setResponseUtil(1,"删除记录数："+ deleteNum,
                        deleteNum,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateByUTC(UserNameToPhotoCode userNameToPhotoCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userNameToPhotoCodeMapper.updateByUTC(userNameToPhotoCode) >= 1){
                responseUtil.setResponseUtil(1,"Update UMTPC Success",
                        userNameToPhotoCode,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getByUTC(UserNameToPhotoCode userNameToPhotoCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            List<UserNameToPhotoCode> list = userNameToPhotoCodeMapper.selectByUTC(userNameToPhotoCode);
            if (list.size() >= 1){
                responseUtil.setResponseUtil(1,"Get UMTPC Success",list,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public ResponseUtil getAllUser(int pageNum, int pageSize, UserNameToPhotoCode userNameToPhotoCode) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserNameToPhotoCode> list = userNameToPhotoCodeMapper.selectByUTC(userNameToPhotoCode);
            PageInfo result = new PageInfo(list);
            responseUtil.setResponseUtil(1,"Get All UNTPC Success",
                    result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }
}