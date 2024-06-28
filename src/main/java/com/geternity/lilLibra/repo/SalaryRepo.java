package com.geternity.lilLibra.repo;

import com.geternity.lilLibra.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepo extends JpaRepository <Salary, Integer> {
}
