package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.dao.EmployeeMapper;
import com.ohgiraffers.employee.dto.*;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeSirvice {
    public void insertNewDept(SearchConditionAndValues searchConditionAndValues) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.insertNewDept(searchConditionAndValues);

        if (result > 0 ){
            System.out.println("신규 부서 생성에 성공하셨습니다");
            sqlSession.commit();
        }else {
            System.out.println("신규 부서 생성에 실패하셨습니다");
            sqlSession.rollback();
        }
        sqlSession.close();
    }

    public List<EmpAndJobAndDpDTO> selectAll() {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmpAndJobAndDpDTO> empList = mapper.selectAll();

        sqlSession.close();

        return empList;
    }

    public List<SearchDTO> selectInfoByIdAndName(SearchConditionAndValues searchConditionAndValues) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<SearchDTO> empList = mapper.searchNameAndId(searchConditionAndValues);

        sqlSession.close();

        return empList;
    }

    public List<SearchDTO> selectInfoByDeptTitle(SearchConditionAndValues searchConditionAndValues) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<SearchDTO> empList = mapper.selectInfoByDeptTitle(searchConditionAndValues);

        return empList;
    }

    public List<SearchDTO> selectInfoByJobName(SearchConditionAndValues searchConditionAndValues) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<SearchDTO> empList = mapper.selectInfoByJobName(searchConditionAndValues);

        sqlSession.close();

        return empList;
    }

    public void insertNewEmp(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.insertNewEmp(employeeDTO);

        if (result > 0 ){
            System.out.println("신규 직원 생성에 성공하셨습니다");
            sqlSession.commit();
        }else {
            System.out.println("신규 직원 생성에 실패하셨습니다");
            sqlSession.rollback();
        }
        sqlSession.close();
    }

    public void modifyEmp(ModifyEmpDTO searchDTO) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.modifyEmp(searchDTO);

        if (result > 0 ){
            System.out.println("직원 정보 변경에 성공하셨습니다");
            sqlSession.commit();
        }else {
            System.out.println("직원 정보 변경에 실패하셨습니다");
            sqlSession.rollback();
        }
        sqlSession.close();

    }

    public void deleteEmp(EmployeeDTO employeeDTO) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.deleteEmp(employeeDTO);

        if (result > 0 ){
            System.out.println("직원 퇴사 처리에 성공하셨습니다");
            sqlSession.commit();
        }else {
            System.out.println("직원 퇴사 처리에 실패하셨습니다");
            sqlSession.rollback();
        }
        sqlSession.close();
    }
}
