package com.ohgiraffers.common;


public class EmployeeDTO {

    private int empId;
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private double salary;
    private float bonus;
    private String managerId;
    private String hireDate;
    private String entDate;
    private String entYn;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String empName, String empNo, String email, String phone, String deptCode, String jobCode, String salLevel, double salary, float bonus, String managerId, String hireDate, String entDate, String entYn) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
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

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getEntDate() {
        return entDate;
    }

    public void setEntDate(String entDate) {
        this.entDate = entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", entDate='" + entDate + '\'' +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
