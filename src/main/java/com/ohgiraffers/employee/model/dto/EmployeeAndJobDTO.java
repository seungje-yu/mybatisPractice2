package com.ohgiraffers.employee.model.dto;

public class EmployeeAndJobDTO {
    private String jobName;
    private String userType;
    private EmployeeDTO employee;

    public EmployeeAndJobDTO() {
    }

    public EmployeeAndJobDTO(EmployeeDTO employee, String jobName, String userType) {
        this.employee = employee;
        this.jobName = jobName;
        this.userType = userType;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return employee.getEmpName() + "|\t" +
                employee.getEmpNo() + "|\t" +
                employee.getEmail() + "|\t" +
                employee.getPhone() + "|\t" +
                employee.getDeptCode() + "|\t" +
                jobName + "|\t" +
                employee.getEntYn() + "|\t" +
                userType;

    }
}