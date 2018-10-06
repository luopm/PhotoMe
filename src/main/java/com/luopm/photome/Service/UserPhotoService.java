package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserPhotoMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userPhotoService")
public class UserPhotoService {

    @Autowired
    private UserPhotoMapper userPhotoMapper;

    public ResponseUtil addPhoto(UserPhoto userPhoto){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userPhotoMapper.insert(userPhoto) >= 1){
                responseUtil.setResponseUtil(1, "新增Photo成功",
                        userPhoto,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil deleteByPhotoCode(UserPhoto userPhoto){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userPhotoMapper.deleteByPhotoCode(userPhoto) >= 1){
                responseUtil.setResponseUtil(1, "删除Photo成功",
                        userPhoto,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateByPhotoCode(UserPhoto userPhoto){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userPhotoMapper.updateByPhotoCode(userPhoto) >= 1){
                responseUtil.setResponseUtil(1, "修改Photo成功",
                        userPhotoMapper.selectPhotoByPhotoCode(userPhoto),null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getPhotoByPhotoCode(UserPhoto userPhoto){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            userPhoto = userPhotoMapper.selectPhotoByPhotoCode(userPhoto);
            if (userPhoto != null){
                responseUtil.setResponseUtil(1, "获取Photo成功",
                        userPhoto,null);
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
    public ResponseUtil getAllUserPhoto(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserPhoto> userPhotoList = userPhotoMapper.selectALLPhoto();
            PageInfo result = new PageInfo(userPhotoList);
            responseUtil.setResponseUtil(1, "获取Photo成功",
                    result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }
}