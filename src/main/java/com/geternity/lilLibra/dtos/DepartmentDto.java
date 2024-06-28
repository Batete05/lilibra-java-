package com.geternity.lilLibra.dtos;

import com.geternity.lilLibra.models.Address;

public record DepartmentDto(
        String name,
        int number_participants,
        Address address
) {
}
