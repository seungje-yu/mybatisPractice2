package com.ohgiraffers.employee.common;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<FirstDTO> firstOrder();

    List<SecondDTO> secondOrder(SearchCriteria searchCriteria);

    List<ThirdDTO> thirdOrder(SearchCriteria searchCriteria);

    List<FourthDTO> fourthOrder(SearchCriteria searchCriteria);

    int sevenOrder(Map<String, Object> criteria);

    int eightOrder(Map<String, Object> criteria);

    List<TenDTO> tenOrder();

    int fiveOrderDept(Dept2DTO dept2DTO);

    int fiveOrderEmp(Dept2DTO dept2DTO);

    int sixOrder(EmployeeDTO employeeDTO);
}
