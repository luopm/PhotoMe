package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserPhotoService;
import com.luopm.photome.model.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping(value = "/photo")
public class UserPhotoController {
    @Autowired
    private UserPhotoService userPhotoService;

    @ResponseBody
    @RequestMapping(value = "/addPhoto" )
    public Object addPhoto(HttpServletRequest request,
                                @RequestParam("userName")String userName) throws IOException {
        MultipartFile file = ((MultipartHttpServletRequest) request).getFile("photomeUserphotoPhotoname");
        UserPhoto userPhoto = new UserPhoto();
        try {
            userPhoto.setPhotomeUserphotoPhotocontent(file.getBytes());
            userPhoto.setPhotomeUserphotoPhotoname(file.getOriginalFilename());
            userPhoto.setPhotomeUserphotoPhotocreatdate(new Date());
            userPhoto.setPhotomeUserphotoPhotocode("Name:"+file.getOriginalFilename()+
                    "Size:"+Long.toString(file.getSize()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return userPhotoService.addPhoto(userPhoto,userName);
    }
    @ResponseBody
    @RequestMapping(value = "/deletePhotoByPhotoCode" )
    public Object deleteUserPhoto(UserPhoto userPhoto){
        return userPhotoService.deleteByPhotoCode(userPhoto);
    }
    @ResponseBody
    @RequestMapping(value = "/updatePhotoByPhotoCode" )
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
    @ResponseBody
    @RequestMapping(value = "/getPhotoByCode" ,produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.POST)
    public byte[] getPhoto(UserPhoto userPhoto)throws IOException{
        return userPhotoService.getPhotoByCode(userPhoto);
    }
}