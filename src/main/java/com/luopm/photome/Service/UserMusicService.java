package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMapper;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.User;
import com.luopm.photome.model.UserMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userMusicService")
public class UserMusicService {

    @Autowired
    private UserMusicMapper userMusicMapper;

    public ResponseUtil addMusic(UserMusic userMusic){
        userMusic.setPhotomeUsermusicMusiccreatdate(new Date());
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMusicMapper.insert(userMusic) == 1){
                responseUtil.setResultObject(userMusic);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("新增音乐成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil deleteMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMusicMapper.deleteMusicByMusicCode(userMusic) == 1){
                responseUtil.setResultObject(userMusic);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("删除音乐成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil updateMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMusicMapper.updateByMusicCode(userMusic) == 1){
                responseUtil.setResultObject(userMusicMapper.selectByMusicCode(userMusic));
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("更新音乐成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil getMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            responseUtil.setResultObject(userMusicMapper.selectByMusicCode(userMusic));
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取音乐成功");
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
    public ResponseUtil getAllUserMusic(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserMusic> userMusicList = userMusicMapper.selectALLMusic();
            PageInfo result = new PageInfo(userMusicList);
            responseUtil.setResultObject(result);
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取音乐成功");
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }
}