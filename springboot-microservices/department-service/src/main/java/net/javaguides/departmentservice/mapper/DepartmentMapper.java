package net.javaguides.departmentservice.mapper;

import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import org.modelmapper.ModelMapper;

public class DepartmentMapper {

    private DepartmentMapper(){}
    private static final ModelMapper modelMapper;
    static {
        modelMapper = new ModelMapper();
    }
    public static DepartmentDto mapToDepartmentDto(Department department){
        return  modelMapper.map(department, DepartmentDto.class);
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return modelMapper.map(departmentDto, Department.class);
    }
}
