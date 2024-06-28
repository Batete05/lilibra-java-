package com.geternity.lilLibra.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int project_id;
    private String project_name;

//    @OneToOne
//    @JoinColumn(name = "employee_id")
//    public Employee employee;

    @ManyToOne
    @JoinColumn(name="department_id")
    public Department department;

    public Project(){}

    public Project(String project_name) {
        this.project_name = project_name;
//        this.employee = employee;
//        this.department = department;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
}

