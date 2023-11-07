package com.ohgiraffers.common;

public class EmployeeAndDepartmentAndJobDTO {

    private String empName;
    private DepartmentDTO department;
    private JobDTO job;
    private String Phone;

    public EmployeeAndDepartmentAndJobDTO() {
    }

    public EmployeeAndDepartmentAndJobDTO(String empName, DepartmentDTO department, JobDTO job, String phone) {
        this.empName = empName;
        this.department = department;
        this.job = job;
        Phone = phone;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "직원전체조회:" +
                "직원이름 = '" + empName + '\'' +
                ", 부서명 = " + department.getDepTitle() +
                ", 직급 = " + job.getJobName() +
                ", 전화번호 = '" + Phone + '\'';

    }
}
