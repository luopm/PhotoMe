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
    public int addUserMusic(UserMusic userMusic){
        return userMusicService.addUserMusic(userMusic);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteMusic" )
    public int deleteUserMusic(UserMusic userMusic){
        return userMusicService.deleteUserMusic(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/updateMusic" )
    public int updateUserMusic(UserMusic userMusic){
        return userMusicService.updateUserMusic(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/getMusic" )
    public UserMusic getUserMusic(UserMusic userMusic){
        return userMusicService.getUserMusic(userMusic);
    }
    @ResponseBody
    @RequestMapping(value = "/getMusicByUserName" )
    public Object getUserMusicByUserName(String userName){
        return userMusicService.getUserMusicByUserName(userName);
    }

    @ResponseBody
    @RequestMapping(value = "/getAllMusic")
    public Object findAllUserMusic(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userMusicService.findAllUserMusic(pageNum,pageSize);
    }
}