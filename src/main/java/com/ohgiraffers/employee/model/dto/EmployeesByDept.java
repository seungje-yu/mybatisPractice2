package com.ohgiraffers.employee.model.dto;

import java.util.List;

public class EmployeesByDept {
    private String deptTitle;
    private List<EmployeeDTO>  employeeList;

    public EmployeesByDept() {
    }

    public EmployeesByDept(String deptTitle, List<EmployeeDTO> employeeList) {
        this.deptTitle = deptTitle;
        this.employeeList = employeeList;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public List<EmployeeDTO> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeDTO> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "EmployeesByDept{" +
                "deptTitle='" + deptTitle + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}