package com.ohgiraffers.employee.dao;

import com.ohgiraffers.employee.dto.*;

import java.util.List;

public interface EmployeeMapper {
    List<EmpAndJobAndDpDTO> selectAll();

    List<SearchDTO> searchNameAndId(SearchConditionAndValues searchConditionAndValues);

    List<SearchDTO> selectInfoByDeptTitle(SearchConditionAndValues searchConditionAndValues);

    List<SearchDTO> selectInfoByJobName(SearchConditionAndValues searchConditionAndValues);

    int insertNewDept(SearchConditionAndValues searchConditionAndValues);

    int insertNewEmp(EmployeeDTO employeeDTO);

    int modifyEmp(ModifyEmpDTO searchDTO);

    int deleteEmp(EmployeeDTO employeeDTO);
}
