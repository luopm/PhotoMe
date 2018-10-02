package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserCommentService;
import com.luopm.photome.model.UserComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/comment")
public class UserCommentController {
    @Autowired
    private UserCommentService userCommentService;

    @ResponseBody
    @RequestMapping(value = "/addComment" )
    public int addUserComment(UserComment userComment){
        return userCommentService.addUserComment(userComment);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteComment" )
    public int deleteUserComment(UserComment userComment){
        return userCommentService.deleteUserComment(userComment);
    }
    @ResponseBody
    @RequestMapping(value = "/updateComment" )
    public int updateUserComment(UserComment userComment){
        return userCommentService.updateUserComment(userComment);
    }
    @ResponseBody
    @RequestMapping(value = "/getComment" )
    public UserComment getUserComment(UserComment userComment){
        return userCommentService.getUserComment(userComment);
    }
    @ResponseBody
    @RequestMapping(value = "/getCommentByUserName" )
    public Object getCommentByUserName(String userName){
        return userCommentService.getCommentByUserName(userName);
    }

    @ResponseBody
    @RequestMapping(value = "/getAllComment")
    public Object findAllUserComment(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userCommentService.findAllUserComment(pageNum,pageSize);
    }
}