package com.luopm.photome.dao;

import com.luopm.photome.model.UserMusic;
import com.luopm.photome.model.UserMusicExample;
import com.luopm.photome.model.UserMusicWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMusicMapper {
    int countByExample(UserMusicExample example);

    int deleteByExample(UserMusicExample example);

    int insertSelective(UserMusic record);

    List<UserMusic> selectByExampleWithBLOBs(UserMusicExample example);

    List<UserMusic> selectByExample(UserMusicExample example);

    UserMusic selectByPrimaryKey(Integer photomeUsermusicId);

    int updateByExampleSelective(@Param("record") UserMusic record, @Param("example") UserMusicExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMusic record, @Param("example") UserMusicExample example);

    int updateByExample(@Param("record") UserMusic record, @Param("example") UserMusicExample example);

    int updateByPrimaryKeySelective(UserMusic record);

    int updateByPrimaryKeyWithBLOBs(UserMusicWithBLOBs record);

    int insert(UserMusic record);

    int deleteMusicByMusicCode(UserMusic record);

    int updateByMusicCode(UserMusic record);

    List<UserMusic> selectALLMusic();

    UserMusic selectByMusicCode(UserMusic record);
}