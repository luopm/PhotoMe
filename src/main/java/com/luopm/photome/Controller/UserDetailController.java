package com.luopm.photome.Controller;

import com.luopm.photome.Service.UserDetailService;
import com.luopm.photome.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/detail")
public class UserDetailController {
    @Autowired
    private UserDetailService userDetailService;

    @ResponseBody
    @RequestMapping(value = "/addDetail" )
    public int addUserDetail(UserDetail userDetail){
        return userDetailService.addUserDetail(userDetail);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteDetail" )
    public int deleteUserDetail(UserDetail userDetail){
        return userDetailService.deleteUserDetail(userDetail);
    }
    @ResponseBody
    @RequestMapping(value = "/updateDetail" )
    public int updateUserDetail(UserDetail userDetail){
        return userDetailService.updateUserDetail(userDetail);
    }
    @ResponseBody
    @RequestMapping(value = "/getDetail" )
    public UserDetail getUserDetail(UserDetail userDetail){
        return userDetailService.getUserDetail(userDetail);
    }
    @ResponseBody
    @RequestMapping(value = "/getDetailByUserName" )
    public Object getDetailByUserName(String userName){
        return userDetailService.getDetailByUserName(userName);
    }
    @ResponseBody
    @RequestMapping(value = "/getAllDetail")
    public Object findAllUserDetail(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userDetailService.findAllUserDetail(pageNum,pageSize);
    }
}