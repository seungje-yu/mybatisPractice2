package com.ohgiraffers.employee.model.service;

import com.ohgiraffers.employee.model.dto.*;
import com.ohgiraffers.employee.model.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {
    private EmployeeMapper employeeMapper;

    public List<EmployeeAndDepartmentAndJobDTO> selectAllEmployees() {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeMapper.selectAllEmployees();

        sqlSession.close();
        return employeeAndDepartmentAndJobList;
    }

    public EmployeeAndDepartmentAndJobDTO selectEmployeeByNameOrId(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob = employeeMapper.selectEmployeeByNameOrId(parameter);

        sqlSession.close();
        return employeeAndDepartmentAndJob;
    }

    public List<EmployeeAndDepartmentAndJobDTO> selectEmployeesByDeptTitle(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeMapper.selectEmployeesByDeptTitle(parameter);

        sqlSession.close();
        return employeeAndDepartmentAndJobList;
    }

    public List<EmployeeAndDepartmentAndJobDTO> selectEmployeesByJobName(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeMapper.selectEmployeesByJobName(parameter);

        sqlSession.close();
        return employeeAndDepartmentAndJobList;
    }

    public boolean insertDept(DepartmentDTO parameter) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertDept(parameter);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    public boolean insertEmp(EmployeeDTO employee) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertEmp(employee);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    public boolean updateEmp(EmployeeDTO employee) {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = employeeMapper.updateEmp(employee);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean resignEmp(EmployeeDTO employee) {
        SqlSession sqlSession = getSqlSession();

        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = employeeMapper.resignEmp(employee);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public List<EmployeesByDept> selectEmployeesAndDept() {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeesByDept> employeesByDeptList = employeeMapper.selectEmployeesAndDept();
        sqlSession.close();
        return employeesByDeptList;

    }

    public List<EmployeeAndJobDTO> selectEmployeeAndManagerId() {
        SqlSession sqlSession = getSqlSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeAndJobDTO> employeeAndJobList = employeeMapper.selectEmployeeAndManagerId();
//        for (var x : employeeAndJobList) {
//            System.out.println(x);
//        } // 21개가 출력되어야 하는데 9개가 출력된다.
        System.out.println("=====");
        sqlSession.close();
        return employeeAndJobList;
    }
}
