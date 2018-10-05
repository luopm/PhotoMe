package com.luopm.photome.dao;

import com.luopm.photome.model.UserPhoto;
import com.luopm.photome.model.UserPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPhotoMapper {
    int countByExample(UserPhotoExample example);

    int deleteByExample(UserPhotoExample example);



    int insertSelective(UserPhoto record);

    List<UserPhoto> selectByExampleWithBLOBs(UserPhotoExample example);

    List<UserPhoto> selectByExample(UserPhotoExample example);

    UserPhoto selectByPrimaryKey(Integer photomeUserphotoId);

    int updateByExampleSelective(@Param("record") UserPhoto record, @Param("example") UserPhotoExample example);

    int updateByExampleWithBLOBs(@Param("record") UserPhoto record, @Param("example") UserPhotoExample example);

    int updateByExample(@Param("record") UserPhoto record, @Param("example") UserPhotoExample example);

    int updateByPrimaryKeySelective(UserPhoto record);

    int updateByPrimaryKeyWithBLOBs(UserPhoto record);

    int insert(UserPhoto record);

    int updateByPhotoCode(UserPhoto record);

    List<UserPhoto> selectALLPhoto();

    UserPhoto selectPhotoByPhotoCode(UserPhoto record);

    int deleteByPhotoCode(UserPhoto record);
}