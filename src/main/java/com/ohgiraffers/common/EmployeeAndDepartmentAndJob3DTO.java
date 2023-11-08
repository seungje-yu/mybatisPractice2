package com.ohgiraffers.common;

public class EmployeeAndDepartmentAndJob3DTO {

    private String empName;
    private String empNo;
    private String email;
    private String Phone;
    private DepartmentDTO department;
    private JobDTO job;
    private double salary;


    public EmployeeAndDepartmentAndJob3DTO() {
    }

    public EmployeeAndDepartmentAndJob3DTO(String empName, String empNo, String email, String phone, DepartmentDTO department, JobDTO job, double salary) {
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        Phone = phone;
        this.department = department;
        this.job = job;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "직원이름 또는 ID로 조회 :" +
                "직원이름 ='" + empName + '\'' +
                ", 주민등록번호 ='" + empNo + '\'' +
                ", 이메일 ='" + email + '\'' +
                ", 전화번호 ='" + Phone + '\'' +
                ", 부서명 =" + department.getDepTitle() +
                ", 직급 =" + job.getJobName() +
                ", 급여 =" + salary;

    }

}
