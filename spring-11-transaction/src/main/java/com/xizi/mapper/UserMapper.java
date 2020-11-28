package com.xizi.mapper;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    int addUser(User user);

    int deleteUser(int id);
}
