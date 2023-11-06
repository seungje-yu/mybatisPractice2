package com.ohgiraffers.employee.common;

public class SecondDTO {

    EmployeeDTO employeeDTO;
    DeptDTO deptDTO;
    JobDTO jobDTO;

    @Override
    public String toString() {
        return "{" +
                "직원 이름 = " + employeeDTO.empName +
                ", 주민등록번호 = " + employeeDTO.empNo +
                ", 이메일 = " + employeeDTO.email +
                ", 전화번호 = " + employeeDTO.phone +
                ", 부서명 = " + deptDTO.deptTitle +
                ", 직급 = " + jobDTO.jobName +
                ", 급여 = " + employeeDTO.salary +
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

    public SecondDTO(EmployeeDTO employeeDTO, DeptDTO deptDTO, JobDTO jobDTO) {
        this.employeeDTO = employeeDTO;
        this.deptDTO = deptDTO;
        this.jobDTO = jobDTO;
    }

    public SecondDTO() {
    }
}
