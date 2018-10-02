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
    public int addUserPhoto(UserPhoto userPhoto){
        return userPhotoService.addUserPhoto(userPhoto);
    }

    @ResponseBody
    @RequestMapping(value = "/deletePhoto" )
    public int deleteUserPhoto(UserPhoto userPhoto){
        return userPhotoService.deleteUserPhoto(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/updatePhoto" )
    public int updateUserPhoto(UserPhoto userPhoto){
        return userPhotoService.updateUserPhoto(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/getPhoto" )
    public UserPhoto getUserPhoto(UserPhoto userPhoto){
        return userPhotoService.getUserPhoto(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/getPhotoByPhotoCode" )
    public Object getPhotoByPhotoCode(String photoCode){
        return userPhotoService.getPhotoByPhotoCode(photoCode);
    }
    @ResponseBody
    @RequestMapping(value = "/getAllPhoto")
    public Object findAllUserPhoto(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userPhotoService.findAllUserPhoto(pageNum,pageSize);
    }
}