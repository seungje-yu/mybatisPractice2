package com.ohgiraffers.employee.mapper;

import com.ohgiraffers.common.*;

import java.util.List;

public interface EmployeeMapper {




    List<EmployeeAndDepartmentAndJobDTO> selectAllEmployee();

    List<EmployeeAndDepartmentAndJob2DTO> searchByDeptTitle(SearchCriteria searchCriteria);

    List<EmployeeAndDepartmentAndJob3DTO> searchByNameOrId(SearchCriteria searchCriteria);

    List<EmployeeAndDepartmentAndJob4DTO> searchByJobName(SearchCriteria searchCriteria);

    int createNewEmp(EmployeeDTO newEmp);

    int createNewDept(DepartmentDTO newDept);

    int modifyEmp(EmployeeAndDepartmentAndJob4DTO modifyEmp);

    int retirementEmp(EmployeeDTO retirementEmp);


//    List<EmployeeAndDepartmentAndJobDTO> searchByNameOrId(SearchCriteria searchCriteria);
}
