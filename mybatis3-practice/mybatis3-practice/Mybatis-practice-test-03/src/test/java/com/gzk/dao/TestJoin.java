package com.gzk.dao;

import com.gzk.pojo.Student;
import com.gzk.pojo.Teacher;
import com.gzk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.LinkedList;
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
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectAllStudent();
        for (Student stu : list) {
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectAllStudent2();
        for (Student stu : list) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
