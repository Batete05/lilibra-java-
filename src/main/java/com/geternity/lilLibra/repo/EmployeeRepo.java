package com.geternity.lilLibra.repo;

import com.geternity.lilLibra.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Integer> {
}
