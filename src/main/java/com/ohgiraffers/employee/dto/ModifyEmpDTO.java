package com.ohgiraffers.employee.dto;

public class ModifyEmpDTO {
    private int empId;
    private String empName;
    private String empEmail;
    private String empPhone;
    private String departmentTitle;
    private String jobName;

    public ModifyEmpDTO() {
    }

    public ModifyEmpDTO(int empId, String empName, String empEmail, String empPhone, String departmentTitle, String jobName) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.departmentTitle = departmentTitle;
        this.jobName = jobName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "ModifyEmpDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", departmentTitle='" + departmentTitle + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
