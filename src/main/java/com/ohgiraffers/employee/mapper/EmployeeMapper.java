package com.ohgiraffers.employee.mapper;

import com.ohgiraffers.employee.common.SearchCriteria;
import com.ohgiraffers.employee.dto.DepartmentDTO;
import com.ohgiraffers.employee.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllMember();

    List<EmployeeDTO> SearchNameOrId(SearchCriteria searchCriteria);

    List<EmployeeDTO> searchDepartment(String department);

    List<EmployeeDTO> searchJob(String searchCriteria);

    int insertDeartement(DepartmentDTO departmentDTO);

    int insertEmployee(EmployeeDTO employeeDTO);

    int modifyEmployee(EmployeeDTO employeeDTO);

    int modifyHire(EmployeeDTO employeeDTO);

    List<DepartmentDTO> selectAllDepartement();
}
