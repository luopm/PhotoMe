package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserPhotoService;
import com.luopm.photome.model.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/photo")
public class UserPhotoController {
    @Autowired
    private UserPhotoService userPhotoService;

    @ResponseBody
    @RequestMapping(value = "/addPhoto" )
    public Object addUserPhoto(UserPhoto userPhoto){
        return userPhotoService.addPhoto(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteByPhotoCode" )
    public Object deleteUserPhoto(UserPhoto userPhoto){
        return userPhotoService.deleteByPhotoCode(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/updateByPhotoCode" )
    public Object updateUserPhoto(UserPhoto userPhoto){
        return userPhotoService.updateByPhotoCode(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/getPhotoByPhotoCode" )
    public Object getUserPhoto(UserPhoto userPhoto){
        return userPhotoService.getPhotoByPhotoCode(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/getAllPhoto")
    public Object findAllUserPhoto(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userPhotoService.getAllUserPhoto(pageNum,pageSize);
    }
}