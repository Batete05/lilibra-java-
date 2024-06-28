package com.geternity.lilLibra.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalTime;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;

    @Column(name = "firstname", length = 250, nullable = false)
    private String firstname;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public LocalTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalTime getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(LocalTime timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    @Column(name = "lastname", length = 250, nullable = false)
    private String lastname;

    @CreationTimestamp
    @Column(name = "createdTime",updatable = false)
    private LocalTime timeCreated;

    @CreationTimestamp
    @Column(name = "updatedTime", nullable = false)
    private LocalTime timeUpdated;

    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Salary salary;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;


    @Embedded
    private Address address;

    @OneToOne
    @JoinColumn(name = "project_id")
    private Project project;


    public Employee() {
    }

    public Employee(String firstname,String lastname,  Salary salary, Department department, Address address, Project project) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.project = project;
    }

    public String getFirstname() {
        return firstname;
    }

    public void getFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void getLastname(String lastname) {
        this.lastname = lastname;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public LocalTime getCreatedAt() {
        return timeCreated;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.timeCreated = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return timeUpdated;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.timeUpdated = updatedAt;
    }

}
