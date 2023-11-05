package com.ohgiraffers.employee.controller;

import com.ohgiraffers.employee.Service.EmployeeService;
import com.ohgiraffers.employee.dto.DepartmentDTO;
import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.common.SearchCriteria;
import com.ohgiraffers.employee.view.PrintResult;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmployeeController {
    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllMember() {
        List<EmployeeDTO> employeeDTOList = employeeService.selectAllmember();

        if (employeeDTOList != null) {
            printResult.printMember(employeeDTOList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectAllDepartment(){
        List<DepartmentDTO> departmentDTOList = employeeService.selectAllDepartment();

        if(departmentDTOList != null){
            printResult.printDepartment(departmentDTOList);
        }else {
            printResult.printErrorMessage("selectDept");
        }
    }


    public void selectNameOrID(SearchCriteria searchCriteria) {
        List<EmployeeDTO> employeeDTOList = employeeService.SearchNameOrId(searchCriteria);

        if (employeeDTOList != null && employeeDTOList.size() > 0) {
            printResult.selectNameOrID(employeeDTOList);
        } else {
            printResult.printErrorMessage("selectNameOrID");
        }
    }

    public void searchDepartment(String department) {
        List<EmployeeDTO> employeeDTOList = employeeService.SearchDepartment(department);

        if (employeeDTOList != null && employeeDTOList.size() > 0) {
            printResult.searchDepartment(employeeDTOList);
        } else {
            printResult.printErrorMessage("searchDepartment");
        }
    }

    public void searchJob(String condition) {
        List<EmployeeDTO> employeeDTOList = employeeService.SearchJob(condition);

        if (employeeDTOList != null && employeeDTOList.size() > 0) {
            printResult.searchJob(employeeDTOList);
        } else {
            printResult.printErrorMessage("searchJob");
        }
    }

    public void insertDepartment(Map<String , String > inputDept) {

        String deptId = inputDept.get("deptId");
        String deptTitle = inputDept.get("deptTitle");
        String locationId = inputDept.get("locationId");

        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setDeptId(deptId);
        departmentDTO.setDeptTitle(deptTitle);
        departmentDTO.setLocationId(locationId);

        int result = employeeService.insertDepartment(departmentDTO);
        if(result > 0){
            printResult.printSuccessMessage("insertDepartment");
        }else {
            printResult.printErrorMessage("insertDepartment");
        }
    }

    public void insertEmployee(Map<String , String > insertEmployee) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            int empId = Integer.parseInt(insertEmployee.get("empId"));
            String empName = insertEmployee.get("empName");
            String empNo = insertEmployee.get("empNo");
            String phone = insertEmployee.get("phone");
            String email = insertEmployee.get("email");
            String deptCode = insertEmployee.get("deptCode");
            String jobCode = insertEmployee.get("jobCode");
            String salLevel = insertEmployee.get("salLevel");
            int salary = Integer.parseInt(insertEmployee.get("salary"));
            Double bonus = Double.parseDouble(insertEmployee.get("salary"));
            int managerId = Integer.parseInt(insertEmployee.get("managerId"));
            Date entDate = format.parse(insertEmployee.get("entDate"));

            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setEmpId(empId);
            employeeDTO.setEmpName(empName);
            employeeDTO.setEmpNo(empNo);
            employeeDTO.setPhone(phone);
            employeeDTO.setEmail(email);
            employeeDTO.setDeptCode(deptCode);
            employeeDTO.setJobCode(jobCode);
            employeeDTO.setSalary(salary);
            employeeDTO.setSalLevel(salLevel);
            employeeDTO.setBonus(bonus);
            employeeDTO.setManagerId(managerId);
            employeeDTO.setEntDate(entDate);
            System.out.println("employeeDTO = " + employeeDTO);

        int resutl = employeeService.insertEmployee(employeeDTO);
        if(resutl > 0 ){
            printResult.printSuccessMessage("insertEmployee");
            }else {
            printResult.printErrorMessage("insertEmployee");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void modifyEmployee(Map<String , String > modifyEmployee) {

        int empId = Integer.parseInt(modifyEmployee.get("empId"));
        String empName = modifyEmployee.get("empName");
        String phone = modifyEmployee.get("phone");
        String email = modifyEmployee.get("email");
        String deptCode = modifyEmployee.get("deptCode");
        String jobCode = modifyEmployee.get("jobCode");

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(empId);
        employeeDTO.setEmpName(empName);
        employeeDTO.setPhone(phone);
        employeeDTO.setEmail(email);
        employeeDTO.setDeptCode(deptCode);
        employeeDTO.setJobCode(jobCode);

        int result = employeeService.modifyEmployee(employeeDTO);
        if(result > 0){
            printResult.printSuccessMessage("modifyEmployee");
        }else {
            printResult.printErrorMessage("modifyEmployee");
        }
    }

    public void modifyHire(Map<String, String> modifyHire) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            int empId = Integer.parseInt(modifyHire.get("empId"));
            Date hireDate = format.parse(modifyHire.get("hireDate"));

            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setEmpId(empId);
            employeeDTO.setHireDate(hireDate);

            int result = employeeService.modifyHire(employeeDTO);
            if (result > 0) {
                printResult.printSuccessMessage("modifyEmployee");
            } else {
                printResult.printErrorMessage("modifyEmployee");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
