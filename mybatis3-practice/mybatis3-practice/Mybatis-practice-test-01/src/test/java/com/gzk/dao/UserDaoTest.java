package com.gzk.dao;

import com.gzk.pojo.User;
import com.gzk.utils.MybatisUtils;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){

        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5, "张三", "123"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUserById(new User(5,"kkkkk","123456789"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(5);

        sqlSession.commit();
        sqlSession.close();
    }
}
