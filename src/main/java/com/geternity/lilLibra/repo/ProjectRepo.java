package com.geternity.lilLibra.repo;

import com.geternity.lilLibra.models.Employee;
import com.geternity.lilLibra.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {
}
