package com.luopm.photome.dao;

import com.luopm.photome.model.UserDetail;
import com.luopm.photome.model.UserDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDetailMapper {
    int countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer photomeUserdetailId);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetail record);

    int insert(UserDetail record);

    List<UserDetail> selectALLDetail();

    UserDetail selectDetailByUserName(UserDetail record);

    int updateByUserName(UserDetail record);

    int deleteByUserName(UserDetail record);


}