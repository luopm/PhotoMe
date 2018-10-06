package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserNameToMusicCodeService;
import com.luopm.photome.model.UserNameToMusicCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/UNTMC")
public class UNTMCController {
    @Autowired
    private UserNameToMusicCodeService userNameToMusicCodeService;

    @ResponseBody
    @RequestMapping(value = "/addUserNameToMusicCode" )
    public Object addUserMusic(UserNameToMusicCode userNameToMusicCode){
        return userNameToMusicCodeService.addUTC(userNameToMusicCode);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteUserNameToMusicCode" )
    public Object deleteUserMusic(UserNameToMusicCode userNameToMusicCode){
        return userNameToMusicCodeService.deleteByUTC(userNameToMusicCode);
    }
}