package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserCommentMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserComment;
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
            if (userCommentMapper.insert(userComment) >= 1){
                responseUtil.setResponseUtil(1, "新增用户评论成功",
                        userComment,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil deleteUserComment(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userCommentMapper.deleteComment(userComment) >= 1){
                responseUtil.setResponseUtil(1, "删除用户评论成功",
                        userComment,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateUserComment(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userCommentMapper.updateComment(userComment) >= 1){
                responseUtil.setResponseUtil(1, "更新用户评论成功",
                        userCommentMapper.selectCommentByUserName(userComment),null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getUserCommentByUserName(UserComment userComment){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            List<UserComment> userCommentList = userCommentMapper.selectCommentByUserName(userComment);
            if (userCommentList != null){
                responseUtil.setResponseUtil(1, "获取用户评论成功",
                        userCommentList,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
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
            responseUtil.setResponseUtil(1, "获取用户评论成功",
                    result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }











}