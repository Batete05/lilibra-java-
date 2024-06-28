package com.geternity.lilLibra.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int salary_id;
    private long salary;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private List<Employee> employees;

    public Salary(){

    }

    public Salary(long salary) {
        this.salary = salary;
    }

    public Salary(int salary){
        this.salary=salary;
    }

    public int getId() {
        return salary_id;
    }

    public void setId(int id) {
        this.salary_id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
