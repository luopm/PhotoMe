package com.luopm.photome.dao;

import com.luopm.photome.model.User;
import com.luopm.photome.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer photomeUserId);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int insert(User record);

    User selectUsersByUserName(User record);

    List<User> selectALLUsers();

    int updateUser(User record);

    int deleteByUserName(User record);


}