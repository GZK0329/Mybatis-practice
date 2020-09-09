package com.gzk.dao;

import com.gzk.pojo.Student;
import com.gzk.pojo.Teacher;
import com.gzk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestJoin {

  /*  @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper =  sqlSession.getMapper(StudentMapper.class);
        Student stu = mapper.getStudentById(2);
        System.out.println(stu);

        sqlSession.close();
    }*/
    @Test
    public void TestGetTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper =  sqlSession.getMapper(TeacherMapper.class);
        Teacher tea = mapper.getTeacher(1);
        System.out.println(tea);
        sqlSession.close();
    }
}
