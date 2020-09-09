package com.gzk.dao;

import com.gzk.pojo.Employee;

import java.util.List;

public interface ManagerMapper {

    //通过经理工号查那个经理手下的所有员工
    List<Employee> getEmployeeByManagerId(String id);

}
