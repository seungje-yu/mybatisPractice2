package com.ohgiraffers.employee.model.mapper;

import com.ohgiraffers.employee.model.dto.*;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<EmployeeAndDepartmentAndJobDTO> selectAllEmployees();
    EmployeeAndDepartmentAndJobDTO selectEmployeeByNameOrId(Map<String,String> parameter);
    List<EmployeeAndDepartmentAndJobDTO> selectEmployeesByDeptTitle(Map<String, String> parameter);
    List<EmployeeAndDepartmentAndJobDTO> selectEmployeesByJobName(Map<String, String> parameter);
    int insertDept(DepartmentDTO parameter);

    int insertEmp(EmployeeDTO employee);

    int updateEmp(EmployeeDTO employee);

    int resignEmp(EmployeeDTO employee);
    List<EmployeesByDept> selectEmployeesAndDept();
    List<EmployeeAndJobDTO> selectEmployeeAndManagerId();
}
