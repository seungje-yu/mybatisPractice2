package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.dto.JobDTO;

import java.util.List;

public class PrintResult {
    public void printMember(List<EmployeeDTO> employeeDTOList) {
        for (EmployeeDTO employeeDTO : employeeDTOList) {

            System.out.print(employeeDTO.getEmpName());
            System.out.print(" / ");
            if(employeeDTO.getDepartmentDTO() == null){
                System.out.print("미배정");
                System.out.print(" / ");
            }else{
                System.out.print(employeeDTO.getDepartmentDTO().getDeptTitle());
                System.out.print(" / ");
            }
            System.out.print(employeeDTO.getJobDTO().getJobName());
            System.out.print(" / ");
            if(employeeDTO.getPhone() == 0){
                System.out.print("미지정");

            }else {
                System.out.print(employeeDTO.getPhone());

            }
            System.out.println("");


        }
    }



    public void printErrorMessage(String selectList) {
        System.out.println("실패~~~~~");
    }
}
