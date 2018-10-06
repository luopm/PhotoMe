package com.luopm.photome.dao;

import com.luopm.photome.model.UserNameToMusicCode;
import com.luopm.photome.model.UserNameToMusicCodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserNameToMusicCodeMapper {
    int countByExample(UserNameToMusicCodeExample example);

    int deleteByExample(UserNameToMusicCodeExample example);

    int insertSelective(UserNameToMusicCode record);

    List<UserNameToMusicCode> selectByExample(UserNameToMusicCodeExample example);

    int updateByExampleSelective(@Param("record") UserNameToMusicCode record, @Param("example") UserNameToMusicCodeExample example);

    int updateByExample(@Param("record") UserNameToMusicCode record, @Param("example") UserNameToMusicCodeExample example);

    int updateByPrimaryKeySelective(UserNameToMusicCode record);

    int insert(UserNameToMusicCode record);

    int updateByUTC(UserNameToMusicCode record);

    List<UserNameToMusicCode> selectByUTC(UserNameToMusicCode record);

    int deleteByUTC(UserNameToMusicCode record);
}