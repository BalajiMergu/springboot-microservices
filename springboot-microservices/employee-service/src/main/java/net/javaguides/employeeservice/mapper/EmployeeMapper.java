package net.javaguides.employeeservice.mapper;

import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.entity.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {

    private EmployeeMapper(){}
    private static final ModelMapper modelMapper;
    static {
        modelMapper = new ModelMapper();
    }

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return modelMapper.map(employee, EmployeeDto.class);
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
       return modelMapper.map(employeeDto, Employee.class);
    }
}
