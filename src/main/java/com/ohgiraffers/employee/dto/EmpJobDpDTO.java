package com.ohgiraffers.employee.dto;

public class EmpJobDpDTO {
    private EmployeeDTO empDTO;
    private JobDTO jobDTO;
    private DepartmentDTO DpDTO;

    public EmpJobDpDTO() {
    }

    public EmpJobDpDTO(EmployeeDTO empDTO, JobDTO jobDTO, DepartmentDTO dpDTO) {
        this.empDTO = empDTO;
        this.jobDTO = jobDTO;
        DpDTO = dpDTO;
    }

    public EmployeeDTO getEmpDTO() {
        return empDTO;
    }

    public void setEmpDTO(EmployeeDTO empDTO) {
        this.empDTO = empDTO;
    }

    public JobDTO getJobDTO() {
        return jobDTO;
    }

    public void setJobDTO(JobDTO jobDTO) {
        this.jobDTO = jobDTO;
    }

    public DepartmentDTO getDpDTO() {
        return DpDTO;
    }

    public void setDpDTO(DepartmentDTO dpDTO) {
        DpDTO = dpDTO;
    }

    @Override
    public String toString() {
        return "EmpJobDpDTO{" +
                "empDTO=" + empDTO +
                ", jobDTO=" + jobDTO +
                ", DpDTO=" + DpDTO +
                '}';
    }
}
