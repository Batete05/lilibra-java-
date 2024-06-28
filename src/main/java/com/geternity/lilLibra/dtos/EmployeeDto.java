package com.geternity.lilLibra.dtos;

import com.geternity.lilLibra.models.Address;

public record EmployeeDto(
        String firstname,
        String lastname,
        Address address,
        DepartmentDto department,
        SalaryDto salary,
        ProjectDto project

) {
    public static record SalaryDto() {
    }


}
