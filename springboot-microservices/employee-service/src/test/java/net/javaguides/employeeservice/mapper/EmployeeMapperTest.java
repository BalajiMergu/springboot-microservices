package net.javaguides.employeeservice.mapper;

import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapperTest {


    @Test
    void mapToEmployeeDto() {
        Employee employee = new Employee(1L, "FirstName", "LastName", "email",
                "1", "1");
        EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);
        assertEquals(employeeDto.getFirstName(), employee.getFirstName());
    }

    @Test
    void mapToEmployee() {
        EmployeeDto employeeDto = new EmployeeDto(1L, "FirstName", "LastName", "email",
                "1", "1");
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        assertEquals(employeeDto.getFirstName(), employee.getFirstName());
    }
}