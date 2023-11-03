package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.Service.EmployeeService;
import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.view.PrintResult;

import java.util.List;
import java.util.Map;

public class EmployeeController {
    private final PrintResult printResult;
    private final EmployeeService employeeService;
    public EmployeeController(){
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }
    public void selectAllMember() {
        List<EmployeeDTO> employeeDTOList = employeeService.selectAllmember();

        if(employeeDTOList != null){
            printResult.printMember(employeeDTOList);
        }else {
            printResult.printErrorMessage("selectList");
        }

    }


    public void selectNameOrID(Map<String, String> stringStringMap) {
    }
}
