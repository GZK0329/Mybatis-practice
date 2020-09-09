package com.gzk.dao;

import com.gzk.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select ("select * from mybatis ")
    List<User> getUserList();
    @Insert("insert into mybatis (id, name, pwd) values(#{id}, #{name}, #{pwd})")
    void addUser(User user);
    @Update("update mybatis set name=#{name},pwd=#{pwd} where id=#{id}")
    void updateUserById(User user);
    @Delete("delete from mybatis where id=#{id}")
    void deleteUserById(int i);

}
