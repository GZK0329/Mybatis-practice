package com.gzk.dao;

import com.gzk.pojo.Student;
import com.gzk.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper {
    //insert
/*    @Insert("insert into Student(sid, name, age) values(#{sid}, #{name}, #{age}")
    void addStudent(Student student);

    //delete
    @Delete("delete from Student where sid = #{sid}")
    void deleteStudent(Student student);

    //update
    @Update("update Student set name=#{name},age=#{age} where sid=#{sid}")
    void updateStudent(Student student);

    //select
    @Select("select * from Student where sid = #{sid}")
    Student getStudentById(@Param("sid") int sid);*/

    //根据tid找到学生对应的老师
    List<Student> selectAllStudent();

    List<Student> selectAllStudent2();
}
