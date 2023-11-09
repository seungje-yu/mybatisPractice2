package com.ohgiraffers.employee.dto;

public class EmpAndJobAndDpDTO {
    private String empName;
    private String empPhone;
    private JobDTO job;
    private DepartmentDTO department;

    public EmpAndJobAndDpDTO() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmpAndJobAndDpDTO[" +
                "이름='" + empName + '\'' +
                ", 전화번호='" + empPhone + '\'' +
                ", 직급=" + job +
                ", 부서=" + department +
                ']';
    }
}