package com.luopm.photome.dao;

import com.luopm.photome.model.UserComment;
import com.luopm.photome.model.UserCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCommentMapper {
    int countByExample(UserCommentExample example);

    int deleteByExample(UserCommentExample example);

    int insertSelective(UserComment record);

    List<UserComment> selectByExample(UserCommentExample example);

    UserComment selectByPrimaryKey(Integer photomeUsercommentId);

    int updateByExampleSelective(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    int updateByExample(@Param("record") UserComment record, @Param("example") UserCommentExample example);

    int updateByPrimaryKeySelective(UserComment record);



    int insert(UserComment record);

    int updateComment(UserComment record);

    List<UserComment> selectALLComment();

    List<UserComment> selectCommentByUserName(UserComment record);

    int deleteComment(UserComment record);
}