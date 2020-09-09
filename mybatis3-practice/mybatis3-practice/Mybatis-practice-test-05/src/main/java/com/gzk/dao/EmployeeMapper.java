package com.gzk.dao;

import com.gzk.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    //通过工号查员工
    Employee getEmployeeById(String id);

    //查所有符合某一条件的员工并显示他们的经理
    List<Employee> selectEmployee();


}
