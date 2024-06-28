package com.geternity.lilLibra.service;

import com.geternity.lilLibra.dtos.EmployeeDto;
import com.geternity.lilLibra.models.Department;
import com.geternity.lilLibra.models.Employee;
import com.geternity.lilLibra.models.Salary;
import com.geternity.lilLibra.repo.DepartmentRepo;
import com.geternity.lilLibra.repo.EmployeeRepo;
import com.geternity.lilLibra.repo.ProjectRepo;
import com.geternity.lilLibra.repo.SalaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation {

    private EmployeeRepo employeeRepo; // Remove 'static' keyword

    private SalaryRepo salaryRepo;
    private DepartmentRepo departmentRepo;
    private ProjectRepo projectRepo;

    @Autowired // Remove 'static' keyword
    public EmployeeServiceImplementation(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(EmployeeDto employee) {
        Employee emp = new Employee();
        emp.setFirstname(employee.firstname());
        emp.setLastname(employee.lastname());
        emp.setAddress(employee.address());
        Department dep = new Department(employee.department().name(), employee.department().number_participants(), employee.department().address());
        emp.setDepartment(dep);

        employeeRepo.save(emp);
        return emp;
    }

    public List<Employee> employeeList() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> findEmployeeByID(int id) {
        return employeeRepo.findById(id);
    }

    public Optional<Employee> deleteUserById(int employee_id) {
        employeeRepo.deleteById(employee_id);

        return null;
    }

    public Optional<Employee> updateEmployeeById(int id, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepo.findById(id);
        if (existingEmployee.isPresent()) {
            Employee emp = existingEmployee.get();
            emp.setFirstname(employee.getFirstname());
            emp.setLastname(employee.getLastname());
            emp.setAddress(employee.getAddress());

            if (employee.getDepartment() != null) {
                Department dep = new Department(
                        employee.getDepartment().getName(),
                        employee.getDepartment().getNumber_participants(),
                        employee.getDepartment().getAddress()
                );
                emp.setDepartment(dep);
            }

            employeeRepo.save(emp);
            return Optional.of(emp);
        } else {
            return Optional.empty();
        }
}
}
