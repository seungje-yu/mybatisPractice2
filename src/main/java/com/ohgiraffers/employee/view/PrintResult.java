package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.dto.EmpAndJobAndDpDTO;
import com.ohgiraffers.employee.dto.SearchDTO;

import java.util.List;

public class PrintResult {
    public static void printempList(List<EmpAndJobAndDpDTO> empList) {
        for (EmpAndJobAndDpDTO emp : empList){
            System.out.print(emp.getEmpName() + " / ");
            System.out.print(emp.getDepartment().getDepartmentTitle() + " / ");
            System.out.print(emp.getJob().getJobName() + " / ");
            System.out.print(emp.getEmpPhone() + " " + "\n");
        }
    }
    public static void printselectInfoByIdAndName(List<SearchDTO> empList){
        for (SearchDTO emp : empList){
            //직원이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급, 급여
            System.out.print(emp.getEmpName() + " / ");
            System.out.print(emp.getEmpNo() + " / ");
            System.out.print(emp.getEmpEmail() + " / ");
            System.out.print(emp.getEmpPhone() + " / ");
            System.out.print(emp.getDepartment().getDepartmentTitle() + " / ");
            System.out.print(emp.getJob().getJobName() + " / ");
            System.out.print(emp.getEmpSalary() + " " + "\n");
        }   }


    public static void printErrorMessage(String errorCode) {
        
        String errorMessage = "";
        switch (errorCode){
            case "selectAll" : System.out.println("총 직원 출력에 실패하셨습니다.");
            case "selectInfoByIdAndName" : System.out.println("아이디, 이름으로 검색하기에 실패하셨습니다.");
            case "selectInfoByDeptTitle" : System.out.println("부서명으로 조회하기에 실패하셨습니다.");
            case "selectInfoByJobName" : System.out.println("직급명으로 조회하기에 실패하셨습니다.");
        }
    }

    public static void selectInfoByDeptTitle(List<SearchDTO> empList) {
        for (SearchDTO emp : empList){
            System.out.print(emp.getEmpName() + " / ");
            System.out.print(emp.getEmpEmail() + " / ");
            System.out.print(emp.getEmpPhone() + " / ");
            System.out.print(emp.getJob().getJobName() + " " + "\n");
        }
    }

    public static void printselectInfoByJobName(List<SearchDTO> empList) {
        //출력 : 직원이름, 이메일, 전화번호, 부서명
        for (SearchDTO emp : empList){
            System.out.print(emp.getEmpName() + " / ");
            System.out.print(emp.getEmpEmail() + " / ");
            System.out.print(emp.getEmpPhone() + " / ");
            System.out.print(emp.getDepartment().getDepartmentTitle() + " " + "\n");
        }
    }
}
