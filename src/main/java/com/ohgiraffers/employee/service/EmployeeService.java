package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.common.*;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {
    private EmployeeMapper mapper;
    public void firstOrder() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<FirstDTO> firstDTO = mapper.firstOrder();

        for(FirstDTO first : firstDTO) {
            System.out.println(first);
        }

        sqlSession.close();

    }

    public void secondOrder(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<SecondDTO> secondDTOS = mapper.secondOrder(searchCriteria);

        if(secondDTOS != null && secondDTOS.size() > 0){
            for(SecondDTO menu : secondDTOS) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }

    public void thirdOrder(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<ThirdDTO> thirdDTOS = mapper.thirdOrder(searchCriteria);

        if(thirdDTOS != null && thirdDTOS.size() > 0) {
            for(ThirdDTO menu : thirdDTOS){
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }

    public void fourthOrder(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<FourthDTO> fourthOrder = mapper.fourthOrder(searchCriteria);

        if(fourthOrder != null && fourthOrder.size() > 0) {
            for(FourthDTO menu : fourthOrder){
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }

    public void sevenOrder(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.sevenOrder(criteria);

        if(result > 0) {
            System.out.println("직원 정보 변경에 성공하였습니다.");
            sqlSession.commit();
        } else {
            System.out.println("직원 정보 변경에 실패하셨습니다.");
            sqlSession.rollback();
        }

        sqlSession.close();
    }

    public void eightOrder(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.eightOrder(criteria);

        if(result > 0) {
            System.out.println("정보 변경에 성공하였습니다.");
            sqlSession.commit();
        } else {
            System.out.println("정보 변경에 실패하셨습니다.");
            sqlSession.rollback();
        }

        sqlSession.close();
    }

    public void tenOrder() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<TenDTO> tenOrder = mapper.tenOrder();

        for(TenDTO ten : tenOrder) {
            System.out.println(ten);
        }

        sqlSession.close();
    }

    public void fiveOrder(Dept2DTO dept2DTO) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result1 = mapper.fiveOrderDept(dept2DTO);

        if(result1 > 0){
            System.out.println("신규 부서 생성에 성공했습니다.");
            sqlSession.commit();
        } else {
            System.out.println("신규 부서 생성에 실패했습니다.");
            sqlSession.rollback();
        }


        sqlSession.close();
    }

    public void sixOrder(EmployeeDTO employeeDTO) {


        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = mapper.sixOrder(employeeDTO);

        if(result > 0){
            System.out.println("신규 직원 등록에 성공했습니다.");
            sqlSession.commit();
        } else {
            System.out.println("신규 직원 등록에 실패했습니다.");
            sqlSession.rollback();
        }

        sqlSession.close();

    }
}
