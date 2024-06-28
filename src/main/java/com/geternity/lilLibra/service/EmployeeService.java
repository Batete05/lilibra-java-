package com.geternity.lilLibra.service;

import com.geternity.lilLibra.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();
    Employee addEmployee(Employee employee);

    Employee deleteUserById( Employee employee);
}
