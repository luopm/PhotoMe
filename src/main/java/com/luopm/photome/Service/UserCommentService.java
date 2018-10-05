package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserCommentMapper;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserComment;
import com.luopm.photome.model.UserMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userCommentService")
public class UserCommentService {

    @Autowired
    private UserCommentMapper userCommentMapper;

    public ResponseUtil addUserComment(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userCommentMapper.insert(userComment) == 1){
                responseUtil.setResultObject(userComment);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("新增用户评论成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil deleteUserComment(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userCommentMapper.deleteComment(userComment) == 1){
                responseUtil.setResultObject(userComment);
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("删除用户评论成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil updateUserComment(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userCommentMapper.updateComment(userComment) == 1){
                responseUtil.setResultObject(userCommentMapper.selectCommentByUserName(userComment));
                responseUtil.setResultCode(1);
                responseUtil.setResultMsg("更新用户评论成功");
            }
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }

    public ResponseUtil getUserCommentByUserName(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            responseUtil.setResultObject(userCommentMapper.selectCommentByUserName(userComment));
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取用户评论成功");
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }
    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public ResponseUtil getAllUserComment(int pageNum, int pageSize) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserComment> userCommentList = userCommentMapper.selectALLComment();
            PageInfo result = new PageInfo(userCommentList);
            responseUtil.setResultObject(result);
            responseUtil.setResultCode(1);
            responseUtil.setResultMsg("获取用户评论成功");
        }catch (Exception e){
            responseUtil.setResultObject(e.getMessage());
            responseUtil.setResultCode(0);
            responseUtil.setResultMsg("操作失败");
        }
        return responseUtil;
    }











}