package com.ohgiraffers.employee.model.dto;

public class EmployeeAndJobDTO {
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobName;
    private String entYn;
    private String userType;

    public EmployeeAndJobDTO() {
    }

    public EmployeeAndJobDTO(String empName, String empNo, String email, String phone, String deptCode, String jobName, String entYn, String userType) {
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobName = jobName;
        this.entYn = entYn;
        this.userType = userType;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %20s | %12s | %2s | %3s | %s | %3s", empName, empNo, email, phone, deptCode, jobName, entYn, userType);

    }
}