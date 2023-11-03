package com.ohgiraffers.employee.Service;

import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {

    public List<EmployeeDTO> selectAllmember() {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeDTOList = employeeMapper.selectAllMember();
        System.out.println("employeeDTOList = " + employeeDTOList);
        sqlSession.close();
        return employeeDTOList;
    }
}
