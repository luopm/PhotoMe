package com.luopm.photome.dao;

import com.luopm.photome.model.UserComment;
import com.luopm.photome.model.UserCommentExample;
import java.util.List;

import com.luopm.photome.model.UserDetail;
import org.apache.ibatis.annotations.Param;

public interface UserCommentMapper {
    int countByExample(UserCommentExample example);

    int deleteByExample(UserCommentExample example);

    int deleteByPrimaryKey(Integer photomeUsercommentId);

    int insert(UserComment record);

    int insertSelective(UserComment record);

    List<UserComment> selectByExample(UserCommentExample example);

    UserComment selectByPrimaryKey(Integer photomeUsercommentId);

    int updateByExampleSelective(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    int updateByExample(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    int updateByPrimaryKeySelective(UserComment record);

    int updateByPrimaryKey(UserComment record);

    List<UserComment> selectALLComment();

    List<UserComment> selectCommentByUserName(String UserName);
}