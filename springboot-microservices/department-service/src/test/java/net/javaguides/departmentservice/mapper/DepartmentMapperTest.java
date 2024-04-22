package net.javaguides.departmentservice.mapper;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentMapperTest {

    @Test
    void mapToDepartmentDto() {
        Department department = new Department(1L, "IT", "IT services", "001");
        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
        assertEquals(department.getDepartmentName(), departmentDto.getDepartmentName());
    }

    @Test
    void mapToDepartment() {
        DepartmentDto departmentDto = new DepartmentDto(1L, "IT", "IT services", "001");
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        assertEquals(department.getDepartmentName(), departmentDto.getDepartmentName());
    }
}