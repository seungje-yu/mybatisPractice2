package com.ohgiraffers.common;

public class EmployeeAndDepartmentAndJob4DTO {

    private String empName;
    private String email;
    private String Phone;
    private DepartmentDTO department;
    private JobDTO job;

    public EmployeeAndDepartmentAndJob4DTO() {
    }

    public EmployeeAndDepartmentAndJob4DTO(String empName, String email, String phone, DepartmentDTO department, JobDTO job) {
        this.empName = empName;
        this.email = email;
        Phone = phone;
        this.department = department;
        this.job = job;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
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
        return "직급으로 검색 :" +
                "직원이름 ='" + empName + '\'' +
                ", 이메일 ='" + email + '\'' +
                ", 전화번호 ='" + Phone + '\'' +
                ", 부서명=" + department.getDepTitle();

    }

}
