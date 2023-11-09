package com.ohgiraffers.employee.dto;

public class SearchDTO {

    private int empId;
    private String empName;
    private String empNo;
    private String empEmail;
    private String empPhone;
    private int empSalary;
    private String entYn;
    private String managerId;
    private String empDeptCode;
    private JobDTO job;
    private DepartmentDTO department;

    public SearchDTO() {
    }

    public SearchDTO(int empId, String empName, String empNo, String empEmail, String empPhone, int empSalary, String entYn, String managerId, JobDTO job, DepartmentDTO department) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empSalary = empSalary;
        this.entYn = entYn;
        this.managerId = managerId;
        this.job = job;
        this.department = department;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
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

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
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

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
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
        return "SearchDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empSalary=" + empSalary +
                ", entYn='" + entYn + '\'' +
                ", managerId='" + managerId + '\'' +
                ", job=" + job +
                ", department=" + department +
                '}';
    }
}