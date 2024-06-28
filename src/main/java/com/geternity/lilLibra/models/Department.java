package com.geternity.lilLibra.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

//@Embeddable
@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int department_id;
    private String name;
//    private String level;
    private int number_participants;

//    @OneToOne
//    @JoinColumn(name = "employee_id")
//    public Employee employee;

//    @OneToMany(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "project_id")
//    public List<Project> projects;

    @Embedded
    private  Address address;

    private Department(){

    }
    public Department(String name, int number_participants,  Address address) {
        this.name = name;
//        this.projects=project;
        this.number_participants = number_participants;
//        this.projects = projects;
        this.address = address;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_participants() {
        return number_participants;
    }

    public void setNumber_participants(int number_participants) {
        this.number_participants = number_participants;
    }

//   this public List<Project> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
