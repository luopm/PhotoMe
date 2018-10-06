package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserNameToPhotoCodeService;
import com.luopm.photome.Service.UserPhotoService;
import com.luopm.photome.model.UserNameToPhotoCode;
import com.luopm.photome.model.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/UNTPC")
public class UNTPCController {
    @Autowired
    private UserNameToPhotoCodeService userNameToPhotoCodeService;

    @ResponseBody
    @RequestMapping(value = "/addUserNameToPhotoCode" )
    public Object addUserPhoto(UserNameToPhotoCode userNameToPhotoCode){
        return userNameToPhotoCodeService.addUTC(userNameToPhotoCode);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteUserNameToPhotoCode" )
    public Object deleteUserPhoto(UserNameToPhotoCode userNameToPhotoCode){
        return userNameToPhotoCodeService.deleteByUTC(userNameToPhotoCode);
    }
}