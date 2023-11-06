package com.ohgiraffers.employee.common;

public class ThirdDTO {


    EmployeeDTO employeeDTO;
    DeptDTO deptDTO;
    JobDTO jobDTO;

    @Override
    public String toString() {
        return "{" +
                "직원 이름 = " + employeeDTO.empName +
                ", 이메일 = " + employeeDTO.email +
                ", 전화번호 = " + employeeDTO.phone +
                ", 직급 = " + jobDTO.jobName +
                '}';
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public DeptDTO getDeptDTO() {
        return deptDTO;
    }

    public void setDeptDTO(DeptDTO deptDTO) {
        this.deptDTO = deptDTO;
    }

    public JobDTO getJobDTO() {
        return jobDTO;
    }

    public void setJobDTO(JobDTO jobDTO) {
        this.jobDTO = jobDTO;
    }

    public ThirdDTO(EmployeeDTO employeeDTO, DeptDTO deptDTO, JobDTO jobDTO) {
        this.employeeDTO = employeeDTO;
        this.deptDTO = deptDTO;
        this.jobDTO = jobDTO;
    }

    public ThirdDTO() {
    }
}