package com.geternity.lilLibra.controllers;

import com.geternity.lilLibra.dtos.EmployeeDto;
import com.geternity.lilLibra.models.Employee;
import com.geternity.lilLibra.service.EmployeeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImplementation employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> employeeList(){
        List<Employee> employees=employeeService.employeeList();
        return ResponseEntity.ok().body(employees);
    }



    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employee){
        Employee savedEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok().body(savedEmployee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable int id){
    Optional<Employee> employee= employeeService.deleteUserById(id);
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employeeDto) {
        Optional<Employee> updatedEmployee = employeeService.updateEmployeeById(id, employeeDto);
        if (updatedEmployee.isPresent()) {
            return ResponseEntity.ok(updatedEmployee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


//package com.geternity.lilLibra.controllers;
//
//import com.geternity.lilLibra.dtos.EmployeeDto;
//import com.geternity.lilLibra.models.Employee;
//import com.geternity.lilLibra.service.EmployeeServiceImplementation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//@Controller
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeServiceImplementation employeeService;
//
//    @GetMapping("/employees")
//    public String employeeList(Model model) {
//        List<Employee> employees = employeeService.employeeList();
//        model.addAttribute("employees", employees);
//        return "viewAll";
//    }
//
//    @PostMapping("/employees")
//    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employee){
//        Employee savedEmployee = employeeService.addEmployee(employee);
//        return ResponseEntity.ok().body(savedEmployee);
//    }
//}
