package com.ohgiraffers.employee.common;

public class TenDTO {

    EmployeeDTO employeeDTO;

    @Override
    public String toString() {
        return "{" +
                "이름 = " + employeeDTO.empName +
                ", 퇴사 여부 = " + employeeDTO.entYn +
                '}';
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public TenDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public TenDTO() {
    }
}
