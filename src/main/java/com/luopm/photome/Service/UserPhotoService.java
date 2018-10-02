package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.dao.UserPhotoMapper;
import com.luopm.photome.model.UserMusic;
import com.luopm.photome.model.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userPhotoService")
public class UserPhotoService {

    @Autowired
    private UserPhotoMapper userPhotoMapper;

    public int addUserPhoto(UserPhoto userPhoto){
        return userPhotoMapper.insert(userPhoto);
    }

    public int deleteUserPhoto(UserPhoto userPhoto){
        return userPhotoMapper.deleteByPrimaryKey(userPhoto.getPhotomeUserphotoId());
    }

    public int updateUserPhoto(UserPhoto userPhoto){

        return userPhotoMapper.updateByPrimaryKey(userPhoto);
    }
    public UserPhoto getUserPhoto(UserPhoto userPhoto){
        return userPhotoMapper.selectByPrimaryKey(userPhoto.getPhotomeUserphotoId());
    }

    public Object getPhotoByPhotoCode(String PhotoCode){
        return userPhotoMapper.selectPhotoByPhotoCode(PhotoCode);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<UserPhoto> findAllUserPhoto(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserPhoto> userPhotoList = userPhotoMapper.selectALLPhoto();
        PageInfo result = new PageInfo(userPhotoList);
        return result;
    }

}