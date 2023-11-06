package com.ohgiraffers.employee.Service;

import com.ohgiraffers.employee.common.SearchCriteria;
import com.ohgiraffers.employee.dto.DepartmentDTO;
import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {
    private EmployeeMapper mapper;

    public List<EmployeeDTO> selectAllmember() {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeDTOList = mapper.selectAllMember();
        sqlSession.close();
        return employeeDTOList;
    }

    public List<DepartmentDTO> selectAllDepartment() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<DepartmentDTO> departmentDTOList = mapper.selectAllDepartement();
        sqlSession.close();
        return departmentDTOList;
    }


    public List<EmployeeDTO> SearchNameOrId(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> employeeDTOList = mapper.SearchNameOrId(searchCriteria);
        sqlSession.close();
        return employeeDTOList;
    }

    public List<EmployeeDTO> SearchDepartment(String department) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> employeeDTOList = mapper.searchDepartment(department);
        sqlSession.close();
        return employeeDTOList;
    }

    public List<EmployeeDTO> SearchJob(String condition) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeDTO> employeeDTOList = mapper.searchJob(condition);
        sqlSession.close();
        return employeeDTOList;
    }

    public int insertDepartment(DepartmentDTO departmentDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = mapper.insertDeartement(departmentDTO);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int insertEmployee(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = mapper.insertEmployee(employeeDTO);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int modifyEmployee(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = mapper.modifyEmployee(employeeDTO);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }

    public int modifyHire(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = mapper.modifyHire(employeeDTO);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }
}

