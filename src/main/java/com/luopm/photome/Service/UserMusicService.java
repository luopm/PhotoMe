package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.dao.UserNameToMusicCodeMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserMusic;
import com.luopm.photome.model.UserNameToMusicCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userMusicService")
public class UserMusicService {

    @Autowired
    private UserMusicMapper userMusicMapper;
    @Autowired
    private UserNameToMusicCodeMapper userNameToMusicCodeMapper;

    public ResponseUtil addMusic(UserMusic userMusic,String userName){
        userMusic.setPhotomeUsermusicMusiccreatdate(new Date());
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            UserMusic resultMusic = userMusicMapper.selectByMusicCode(userMusic);
            if ( resultMusic != null || userMusicMapper.insert(userMusic) >= 1 ){
                UserNameToMusicCode userNameToMusicCode = new UserNameToMusicCode();
                userNameToMusicCode.setUsername(userName);
                userNameToMusicCode.setMusiccode(userMusic.getPhotomeUsermusicMusiccode());
                userNameToMusicCodeMapper.insert(userNameToMusicCode);
                responseUtil.setResponseUtil(1, "添加Music成功",
                        resultMusic != null ? resultMusic:userMusic,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
            e.printStackTrace();
        }
        return responseUtil;
    }

    public ResponseUtil deleteMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMusicMapper.deleteMusicByMusicCode(userMusic) >= 1){
                responseUtil.setResponseUtil(1, "删除Music成功",
                        1,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userMusicMapper.updateByMusicCode(userMusic) >= 1){
                responseUtil.setResponseUtil(1, "修改Music成功",
                        userMusicMapper.selectByMusicCode(userMusic),null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getMusicByMusicCode(UserMusic userMusic){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            responseUtil.setResultMsg("Music不存在，请检查musicCode");
            userMusic = userMusicMapper.selectByMusicCode(userMusic);
            if (userMusic != null){
                responseUtil.setResponseUtil(1, "获取Music成功",
                        userMusic,null);
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
    public ResponseUtil getAllUserMusic(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserMusic> userMusicList = userMusicMapper.selectALLMusic();
            PageInfo result = new PageInfo(userMusicList);
            responseUtil.setResponseUtil(1, "获取Music成功",
                    result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }
}