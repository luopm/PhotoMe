package com.luopm.photome.Controller;

import com.luopm.photome.Service.UserMusicService;
import com.luopm.photome.model.UserMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/music")
public class UserMusicController {

    @Autowired
    private UserMusicService userMusicService;

    @ResponseBody
    @RequestMapping(value = "/addMusic" )
    public Object addUserMusic(UserMusic userMusic){
        return userMusicService.addMusic(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteMusicByMusicCode" )
    public Object deleteUserMusic(UserMusic userMusic){
        return userMusicService.deleteMusicByMusicCode(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/updateMusicByMusicCode" )
    public Object updateUserMusic(UserMusic userMusic){
        return userMusicService.updateMusicByMusicCode(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/getMusicByMusicCode" )
    public Object getUserMusic(UserMusic userMusic){
        return userMusicService.getMusicByMusicCode(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/getAllMusic")
    public Object findAllUserMusic(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userMusicService.getAllUserMusic(pageNum,pageSize);
    }
}