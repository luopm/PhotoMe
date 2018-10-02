package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMapper;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.model.User;
import com.luopm.photome.model.UserMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userMusicService")
public class UserMusicService {

    @Autowired
    private UserMusicMapper userMusicMapper;

    public int addUserMusic(UserMusic userMusic){
        return userMusicMapper.insert(userMusic);
    }

    public int deleteUserMusic(UserMusic userMusic){
        return userMusicMapper.deleteByPrimaryKey(userMusic.getPhotomeUsermusicId());
    }

    public int updateUserMusic(UserMusic userMusic){

        return userMusicMapper.updateByPrimaryKey(userMusic);
    }
    public UserMusic getUserMusic(UserMusic userMusic){
        return userMusicMapper.selectByPrimaryKey(userMusic.getPhotomeUsermusicId());
    }

    public Object getUserMusicByUserName(String userName){
        return userMusicMapper.selectMusicByUserName(userName);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<UserMusic> findAllUserMusic(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserMusic> userMusicList = userMusicMapper.selectALLMusic();
        PageInfo result = new PageInfo(userMusicList);
        return result;
    }

}