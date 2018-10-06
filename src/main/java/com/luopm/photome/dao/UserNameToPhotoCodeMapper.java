package com.luopm.photome.dao;

import com.luopm.photome.model.UserNameToPhotoCode;
import com.luopm.photome.model.UserNameToPhotoCodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserNameToPhotoCodeMapper {
    int countByExample(UserNameToPhotoCodeExample example);

    int deleteByExample(UserNameToPhotoCodeExample example);

    int insertSelective(UserNameToPhotoCode record);

    List<UserNameToPhotoCode> selectByExample(UserNameToPhotoCodeExample example);

    int updateByExampleSelective(@Param("record") UserNameToPhotoCode record, @Param("example") UserNameToPhotoCodeExample example);

    int updateByExample(@Param("record") UserNameToPhotoCode record, @Param("example") UserNameToPhotoCodeExample example);

    int updateByPrimaryKey(UserNameToPhotoCode record);

    int insert(UserNameToPhotoCode record);

    List<UserNameToPhotoCode> selectByUTC(UserNameToPhotoCode record);

    int updateByUTC(UserNameToPhotoCode record);

    int deleteByUTC(UserNameToPhotoCode record);
}