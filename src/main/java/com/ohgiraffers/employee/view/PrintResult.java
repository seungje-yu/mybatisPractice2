package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.dto.DepartmentDTO;
import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.dto.JobDTO;

import java.util.Date;
import java.util.List;

public class PrintResult {
    public void printMember(List<EmployeeDTO> employeeDTOList) {
        for (EmployeeDTO employeeDTO : employeeDTOList) {

            System.out.print(employeeDTO.getEmpName());//이름
            System.out.print(" / ");
            System.out.print(employeeDTO.getDepartmentDTO().getDeptTitle()); //부서명
            System.out.print(" / ");
            System.out.print(employeeDTO.getJobDTO().getJobName()); //직급
            System.out.print(" / ");
            System.out.print(employeeDTO.getPhone());
            System.out.println("");


        }
    }

    public void printDepartment(List<DepartmentDTO> departmentDTOList){
        for(DepartmentDTO departmentDTO : departmentDTOList){
            System.out.print(departmentDTO.getDeptTitle() + " / " );
        }
    }


    public void printErrorMessage(String result) {
        switch (result) {
            case "selectList":
                System.out.println("전체 조회에 실패했습니다.");
                break;
            case "selectNameOrID":
                System.out.println("해당조건에 맞는 검색 결과가 없습니다.");
                break;
            case "searchDepartment":
                System.out.println("해당 부서에 속한 직원이 없습니다.");
                break;
            case "searchJob":
                System.out.println("해당 직급을 가진 직원이 없습니다.");
                break;

            case "insertDepartment":
                System.out.println("부서 등록에 실패하였습니다.");
                break;

            case "insertEmployee" :
                System.out.println("직원 등록에 실패하였습니다.");
                break;

            case "modifyEmployee" :
                System.out.println("직원 수정에 실패하였습니다.");
                break;
            case  "selectDept" :
                System.out.println("부서 조회에 실패하였습니다.");


        }

    }

    public void printSuccessMessage(String result) {
        switch (result) {
            case "insertDepartment":
                System.out.println("부서 등록에 성공하였습니다.");
                break;
            case  "insertEmployee":
                System.out.println("직원 등록에 성공하였습니다.");
                break;
            case "modifyEmployee" :
                System.out.println("직원 수정에 성공하였습니다");
                break;

        }
    }

    public void selectNameOrID(List<EmployeeDTO> employeeDTOList) {
        for (EmployeeDTO employeeDTO : employeeDTOList) {

            System.out.print(employeeDTO.getEmpName());//이름
            System.out.print(" / ");
            System.out.print(employeeDTO.getEmpNo());//주민번호
            System.out.print(" / ");
            System.out.print(employeeDTO.getEmail());//이메일
            System.out.print(" / ");
            System.out.print(employeeDTO.getPhone());
            System.out.print(" / ");
            System.out.print(employeeDTO.getDepartmentDTO().getDeptTitle()); //부서명
            System.out.print(" / ");
            System.out.print(employeeDTO.getJobDTO().getJobName()); //직급
            System.out.print(" / ");
            System.out.println(employeeDTO.getSalary()); //급여
        }
    }

    public void searchDepartment(List<EmployeeDTO> employeeDTOList) {
        for (EmployeeDTO employeeDTO : employeeDTOList) {

            System.out.print(employeeDTO.getEmpName());//이름
            System.out.print(" / ");

            System.out.print(employeeDTO.getEmail());//이메일
            System.out.print(" / ");

            System.out.print(employeeDTO.getPhone());

            System.out.print(" / ");
            System.out.println(employeeDTO.getJobDTO().getJobName()); //직급

        }

    }

    public void searchJob(List<EmployeeDTO> employeeDTOList) {
        for (EmployeeDTO employeeDTO : employeeDTOList) {

            System.out.print(employeeDTO.getEmpName());//이름
            System.out.print(" / ");

            System.out.print(employeeDTO.getEmail());//이메일
            System.out.print(" / ");

            System.out.print(employeeDTO.getPhone());

            System.out.print(" / ");
                System.out.println(employeeDTO.getDepartmentDTO().getDeptTitle()); //부서명
            }
        }
    }

