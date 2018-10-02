package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserCommentMapper;
import com.luopm.photome.dao.UserMusicMapper;
import com.luopm.photome.model.UserComment;
import com.luopm.photome.model.UserMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userCommentService")
public class UserCommentService {

    @Autowired
    private UserCommentMapper userCommentMapper;

    public int addUserComment(UserComment userComment){
        return userCommentMapper.insert(userComment);
    }

    public int deleteUserComment(UserComment userComment){
        return userCommentMapper.deleteByPrimaryKey(userComment.getPhotomeUsercommentId());
    }

    public int updateUserComment(UserComment userComment){

        return userCommentMapper.updateByPrimaryKey(userComment);
    }
    public UserComment getUserComment(UserComment userComment){
        return userCommentMapper.selectByPrimaryKey(userComment.getPhotomeUsercommentId());
    }

    public List<UserComment> getCommentByUserName(String userName) {
        return userCommentMapper.selectCommentByUserName(userName);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public PageInfo<UserComment> findAllUserComment(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserComment> userCommentList = userCommentMapper.selectALLComment();
        PageInfo result = new PageInfo(userCommentList);
        return result;
    }

}