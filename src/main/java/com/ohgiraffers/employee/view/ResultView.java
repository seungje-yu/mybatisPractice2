package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.common.EmployeeEnum;
import com.ohgiraffers.employee.model.dto.EmployeeAndDepartmentAndJobDTO;
import com.ohgiraffers.employee.model.dto.EmployeeAndJobDTO;
import com.ohgiraffers.employee.model.dto.EmployeesByDept;

import java.util.List;

public class ResultView {
    public void printAllEmployees(List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList) {
        for (EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob : employeeAndDepartmentAndJobList) {
            System.out.println(
                    "직원이름 : " + employeeAndDepartmentAndJob.getEmployee().getEmpName() +
                            ", 부서명 : " + employeeAndDepartmentAndJob.getDepartment().getDeptTitle() +
                            ", 직급 : " + employeeAndDepartmentAndJob.getJob().getJobName() +
                            ", 전화번호 : " + employeeAndDepartmentAndJob.getEmployee().getPhone());
        }
    }

    public void printEmployeeByNameOrId(EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob) {
        System.out.println(
                "직원이름 : " + employeeAndDepartmentAndJob.getEmployee().getEmpName() +
                        ", 주민등록번호 : " + employeeAndDepartmentAndJob.getEmployee().getEmpNo() +
                        ", 이메일 : " + employeeAndDepartmentAndJob.getEmployee().getEmail() +
                        ", 전화번호 : " + employeeAndDepartmentAndJob.getEmployee().getPhone() +
                        ", 부서명 : " + employeeAndDepartmentAndJob.getDepartment().getDeptTitle() +
                        ", 직급 : " + employeeAndDepartmentAndJob.getJob().getJobName() +
                        ", 급여 : " + employeeAndDepartmentAndJob.getEmployee().getSalary());
    }

    public void printEmployeesByDeptTitle(List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList) {
        for (EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob : employeeAndDepartmentAndJobList) {
            System.out.println(
                    "직원이름 : " + employeeAndDepartmentAndJob.getEmployee().getEmpName() +
                            ", 이메일 : " + employeeAndDepartmentAndJob.getEmployee().getEmail() +
                            ", 전화번호 : " + employeeAndDepartmentAndJob.getEmployee().getPhone() +
                            ", 직급 : " + employeeAndDepartmentAndJob.getJob().getJobName());
        }
    }

    public void printEmployeesByJobName(List<EmployeeAndDepartmentAndJobDTO> employeeAndDepartmentAndJobList) {
        for (EmployeeAndDepartmentAndJobDTO employeeAndDepartmentAndJob : employeeAndDepartmentAndJobList) {
            System.out.println(
                    "직원이름 : " + employeeAndDepartmentAndJob.getEmployee().getEmpName() +
                            ", 이메일 : " + employeeAndDepartmentAndJob.getEmployee().getEmail() +
                            ", 전화번호 : " + employeeAndDepartmentAndJob.getEmployee().getPhone() +
                            ", 부서명 : " + employeeAndDepartmentAndJob.getDepartment().getDeptTitle());
        }
    }

    public void printError(EmployeeEnum employeeEnum) {
        switch (employeeEnum) {
            case selectAllMember:
                System.out.println("실패");
                break;
            case selectEmployeeByNameOrId:
                System.out.println("실패");
                break;
            case selectEmployeesByDeptTitle:
                System.out.println("실패");
                break;
            case insertDept:
                System.out.println("실패");
                break;
            case insertEmp:
                System.out.println("실패");
                break;
            case updateEmp:
                System.out.println("실패");
                break;
            case selectEmployeesAndDept:
                System.out.println("실패");
                break;
            case selectEmployeeAndManagerId:
                System.out.println("실패");
                break;
        }
    }

    public void printSuccess(EmployeeEnum employeeEnum) {
        switch (employeeEnum) {
            case insertDept:
                System.out.println("성공");
                break;
            case insertEmp:
                System.out.println("성공");
                break;
            case updateEmp:
                System.out.println("성공");
                break;
        }
    }

    public void printEmployeesAndDept(List<EmployeesByDept> employeesByDeptList) {
        System.out.println(employeesByDeptList);
        for (int i = 0; i < employeesByDeptList.size(); i++) {
            EmployeesByDept employeesByDeptElement = employeesByDeptList.get(i);
            System.out.println(employeesByDeptElement.getDeptTitle());
            if (!employeesByDeptElement.getEmployeeList().isEmpty()) {
                for (int j = 0; j < employeesByDeptElement.getEmployeeList().size(); j++) {
                    System.out.println("\t\t\t" + employeesByDeptElement.getEmployeeList().get(j).getEmpName());
                }
            } else {
                System.out.println("\t\t\t직원없음");
            }
        }
    }

    public void printEmployeeAndJob(List<EmployeeAndJobDTO> employeeAndJobList) {
        for(var employeeAndJob:employeeAndJobList){
            System.out.println(employeeAndJob);
        }
    }
}
