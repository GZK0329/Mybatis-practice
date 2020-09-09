package com.gzk.dao;

import com.gzk.pojo.Teacher;

public interface TeacherMapper {
    //insert
    void addTeacher(Teacher teacher);

    //delete
    void deleteTeacher(Teacher teacher);

    //update
    void updateTeacher(Teacher teacher);

    //select
    void getTeacherById(int id);
}
