package com.ohgiraffers.employee.model.dto;

public class EmployeeAndDepartmentAndJobDTO {
    private EmployeeDTO employee;
    private DepartmentDTO department;
    private JobDTO job;

    public EmployeeAndDepartmentAndJobDTO() {
    }

    public EmployeeAndDepartmentAndJobDTO(EmployeeDTO employee, DepartmentDTO department, JobDTO job) {
        this.employee = employee;
        this.department = department;
        this.job = job;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
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
        return "EmployeeAndDepartmentAndJobDTO{" +
                "employee=" + employee +
                ", department=" + department +
                ", job=" + job +
                '}';
    }
}