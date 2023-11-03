package com.ohgiraffers.employee.mapper;

import com.ohgiraffers.employee.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllMember();
}
