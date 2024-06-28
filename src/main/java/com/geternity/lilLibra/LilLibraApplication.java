package com.geternity.lilLibra;

import com.geternity.lilLibra.repo.*;
import com.geternity.lilLibra.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LilLibraApplication {

	public LilLibraApplication(){}

	public static void main(String[] args) {
		SpringApplication.run(LilLibraApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(com.geternity.lilLibra.repo.EmployeeRepo employeeRepo, com.geternity.lilLibra.repo.DepartmentRepo departmentRepo, com.geternity.lilLibra.repo.SalaryRepo salaryRepo, com.geternity.lilLibra.repo.ProjectRepo projectRepo){
		return args -> {
			//Address details
			com.geternity.lilLibra.models.Address ad1=new com.geternity.lilLibra.models.Address("nyarugenge","rwanda","naf@gmail.com","0787289178");
			com.geternity.lilLibra.models.Address ad2=new com.geternity.lilLibra.models.Address("Gishwati","burundi","had@gmail.com","0787289162");
			com.geternity.lilLibra.models.Address ad3=new com.geternity.lilLibra.models.Address("Nyamagabe","Chad","hewr@gmail.com","0787289141");

			//Project details
			com.geternity.lilLibra.models.Project p1=new com.geternity.lilLibra.models.Project("foodie");
			com.geternity.lilLibra.models.Project p2=new com.geternity.lilLibra.models.Project("rba_site");
			com.geternity.lilLibra.models.Project p3=new com.geternity.lilLibra.models.Project("amazi_meza");
			projectRepo.save(p1);
			projectRepo.save(p2);
			projectRepo.save(p3);


			//Department details
			com.geternity.lilLibra.models.Department d1=new com.geternity.lilLibra.models.Department("accounting",3,ad1);
			com.geternity.lilLibra.models.Department d2=new com.geternity.lilLibra.models.Department("backend",6,ad2);
			com.geternity.lilLibra.models.Department d3=new com.geternity.lilLibra.models.Department("fronted",56,ad3);
			departmentRepo.save(d1);
			departmentRepo.save(d2);
			departmentRepo.save(d3);

			//Salary details
			com.geternity.lilLibra.models.Salary s1=new com.geternity.lilLibra.models.Salary(352534);
			com.geternity.lilLibra.models.Salary s2=new com.geternity.lilLibra.models.Salary(243542);
			com.geternity.lilLibra.models.Salary s3=new com.geternity.lilLibra.models.Salary(7578000);
			salaryRepo.save(s1);
			salaryRepo.save(s2);
			salaryRepo.save(s3);

			com.geternity.lilLibra.models.Employee employee= new com.geternity.lilLibra.models.Employee("Edwige","Akuzwe Sheja",s1,d1,ad2,p1);
			com.geternity.lilLibra.models.Employee employee1=new com.geternity.lilLibra.models.Employee("Claude ","Tuyizere",s2,d2,ad1,p2);
			com.geternity.lilLibra.models.Employee employee2=new com.geternity.lilLibra.models.Employee("JeanClaude ","Nyayisaba",s3,d3,ad3,p3);

			employeeRepo.save(employee);
			employeeRepo.save(employee1);
			employeeRepo.save(employee2);

		};
	}

}
