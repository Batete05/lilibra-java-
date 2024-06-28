package com.geternity.lilLibra.repo;

import com.geternity.lilLibra.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository <Department, Integer>{
}
