package com.gzk.dao;

import com.gzk.pojo.Student;
import com.gzk.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //List<Teacher> getTeacher();

    //获取指定老师以及他的所有学生的信息
    Teacher getTeacher(@Param("tid") int id);

}
