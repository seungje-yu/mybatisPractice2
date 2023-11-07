package com.ohgiraffers.employee.service;

import com.ohgiraffers.common.*;
import com.ohgiraffers.employee.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService {



    private EmployeeMapper mapper;

    public void selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJobDTO> empList = mapper.selectAllEmployee();

        for (EmployeeAndDepartmentAndJobDTO e : empList) {
            System.out.println(e);
        }



        sqlSession.close();
    }

    public void searchByNameOrId(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJob3DTO> searchEmp = mapper.searchByNameOrId(searchCriteria);


            for(EmployeeAndDepartmentAndJob3DTO a : searchEmp) {
                System.out.println(a);

            }
        sqlSession.close();
    }

    public void searchByDeptTitle(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJob2DTO> searchEmp = mapper.searchByDeptTitle(searchCriteria);

            for (EmployeeAndDepartmentAndJob2DTO a : searchEmp) {
                System.out.println(a);


        }
        sqlSession.close();
    }

    public void searchByJobName(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeAndDepartmentAndJob4DTO> searchEmp = mapper.searchByJobName(searchCriteria);

        for (EmployeeAndDepartmentAndJob4DTO a : searchEmp) {
            System.out.println(a);
        }

            sqlSession.close();

    }

    public void createNewEmp(EmployeeDTO newEmp) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.createNewEmp(newEmp);

        if(result > 0){
            System.out.println("신규 사원 등록 성공");
            sqlSession.commit();
        }else {
            System.out.println("등록 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
    }


    public void createNewDept(DepartmentDTO newDept) {

        SqlSession sqlSession = getSqlSession();



        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.createNewDept(newDept);

        if(result > 0){
            System.out.println("신규 부서 등록 성공");
            sqlSession.commit();
        }else {
            System.out.println("등록 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
    }

    public void modifyEmp(EmployeeAndDepartmentAndJob4DTO modifyEmp) {

        SqlSession sqlSession = getSqlSession();



        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.modifyEmp(modifyEmp);

        if(result > 0){
            System.out.println("수정 성공");
            sqlSession.commit();
        }else {
            System.out.println("수정 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
    }

    public void retirementEmp(EmployeeDTO retirementEmp) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.retirementEmp(retirementEmp);

        if(result > 0){
            System.out.println("처리 성공");
            sqlSession.commit();
        }else {
            System.out.println("처리 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
    }
}