package com.ohgiraffers.employee.model.dto;

import java.util.List;

public class EmployeesByDeptTitle {
    private DepartmentDTO department;
    private JobDTO job;
    private List<EmployeeDTO> employeeList;

    public EmployeesByDeptTitle() {
    }

    public EmployeesByDeptTitle(List<EmployeeDTO> employeeList, DepartmentDTO department, JobDTO job) {
        this.employeeList = employeeList;
        this.department = department;
        this.job = job;
    }

    public List<EmployeeDTO> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeDTO> employeeList) {
        this.employeeList = employeeList;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "EmployeesByDeptTitle{" +
                "employeeList=" + employeeList +
                ", department=" + department +
                ", job=" + job +
                '}';
    }
}
