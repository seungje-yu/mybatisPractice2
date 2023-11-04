package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.common.EmployeeEnum;
import com.ohgiraffers.employee.model.dto.DepartmentDTO;
import com.ohgiraffers.employee.model.dto.EmployeeAndDepartmentAndJobDTO;
import com.ohgiraffers.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.employee.model.service.EmployeeService;
import com.ohgiraffers.employee.view.EmployeeView;
import com.ohgiraffers.employee.view.ResultView;

import java.util.List;
import java.util.Map;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    ResultView resultView = new ResultView();

    public void selectAllEmployees() {
        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeService.selectAllEmployees();

        if (employeeAndDepartmentAndJobList != null && !employeeAndDepartmentAndJobList.isEmpty()) {
            resultView.printAllEmployees(employeeAndDepartmentAndJobList);
        } else {
            resultView.printError(EmployeeEnum.selectAllMember);
        }
    }

    public void selectEmployeeByNameOrId(Map<String, String> parameter) {
        EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob = employeeService.selectEmployeeByNameOrId(parameter);

        if (employeeAndDepartmentAndJob != null) {
            resultView.printEmployeeByNameOrId(employeeAndDepartmentAndJob);
        } else {
            resultView.printError(EmployeeEnum.selectEmployeeByNameOrId);
        }
    }

    public void selectEmployeesByDeptTitle(Map<String, String> parameter) {
        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeService.selectEmployeesByDeptTitle(parameter);
        if (employeeAndDepartmentAndJobList != null) {
            resultView.printEmployeesByDeptTitle(employeeAndDepartmentAndJobList);
        } else {
            resultView.printError(EmployeeEnum.selectEmployeesByDeptTitle);
        }
    }

    public void selectEmployeesByJobName(Map<String, String> parameter) {
        System.out.println(parameter);
        List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList = employeeService.selectEmployeesByJobName(parameter);
        if (employeeAndDepartmentAndJobList != null) {
            resultView.printEmployeesByJobName(employeeAndDepartmentAndJobList);
        } else {
            resultView.printError(EmployeeEnum.selectEmployeesByDeptTitle);
        }
    }
    public void insertDept(Map<String, String> parameter) {
        DepartmentDTO department = new DepartmentDTO();
        department.setDeptId(parameter.get("deptId"));
        department.setDeptTitle(parameter.get("deptTitle"));
        department.setLocationId(parameter.get("locationId"));

        if(employeeService.insertDept(department)){
            resultView.printSuccess(EmployeeEnum.insertDept);
        }else{
            resultView.printError(EmployeeEnum.insertDept);
        }
    }

    public void insertEmp(Map<String, Object> parameter) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpId((String)parameter.get("empId"));
        employee.setEmpName((String)parameter.get("empName"));
        employee.setEmpNo((String)parameter.get("empNo"));
        employee.setEmail((String)parameter.get("email"));
        employee.setPhone((String)parameter.get("phone"));
        employee.setDeptCode((String)parameter.get("deptCode"));
        employee.setJobCode((String)parameter.get("jobCode"));
        employee.setSalLevel((String)parameter.get("salLevel"));
        employee.setSalary((int)parameter.get("salary"));
        employee.setBonus((double)parameter.get("bonus"));
        employee.setManagerId((String)parameter.get("managerId"));
        employee.setHireDate((String)parameter.get("hireDate"));
        employee.setEntDate((String)parameter.get("entDate"));
        employee.setEntYn((String)parameter.get("entYn"));

        if(employeeService.insertEmp(employee)){
            resultView.printSuccess(EmployeeEnum.insertEmp);
        }else{
            resultView.printError(EmployeeEnum.insertEmp);
        }
    }

    public void updateEmp(Map<String, String> parameter) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpName(parameter.get("empName"));
        employee.setEmpNo(parameter.get("empNo"));
        employee.setEmail(parameter.get("email"));
        employee.setPhone(parameter.get("phone"));
        employee.setDeptCode(parameter.get("deptCode"));
        employee.setJobCode(parameter.get("jobCode"));

        if(employeeService.updateEmp(employee)){
            resultView.printSuccess(EmployeeEnum.updateEmp);
        }else{
            resultView.printError(EmployeeEnum.updateEmp);
        }
    }
    public void resignEmp(Map<String, String> parameter) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpId(parameter.get("empId"));
        employee.setEntYn(parameter.get("entYn"));

        if(employeeService.resignEmp(employee)){
            resultView.printSuccess(EmployeeEnum.updateEmp);
        }else{
            resultView.printError(EmployeeEnum.updateEmp);
        }
    }
}
