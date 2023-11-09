package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.controller.EmployeeController;
import com.ohgiraffers.employee.dto.EmployeeDTO;
import com.ohgiraffers.employee.dto.ModifyEmpDTO;
import com.ohgiraffers.employee.dto.SearchConditionAndValues;
import com.ohgiraffers.employee.dto.SearchDTO;
import com.ohgiraffers.employee.service.EmployeeSirvice;

import java.util.Scanner;

public class EmployeeView {

    public void displayView() {

        /*
        ============ 직원 관리 ====================
        1. 직원전체조회
        2. 직원 이름 또는 id로 직원조회
        3. 부서명으로 검색
        4. 직급으로 검색
        5. 신규 부서 생성
        6. 신규 직원 생성
        7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)
        8. 직원퇴사
        ==========================================
        상세 내용은 pdf를 참고
        */
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        EmployeeSirvice employeeSirvice = new EmployeeSirvice();
        do {
            System.out.println("============ 직원 관리 ====================");
            System.out.println("1. 직원전체조회");
            System.out.println("2. 직원 이름 또는 id로 직원조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)");
            System.out.println("8. 직원퇴사");
            System.out.println("9. 부서별 직원 목록 조회");
            System.out.println("10. 직원 목록 조회");
            System.out.println("0. 프로그램 종료");
            System.out.println("==========================================");
            System.out.print("원하는 프로그램을 선택해주세요 : ");

            int no = sc.nextInt();
            switch (no){
                case 1 : employeeController.selectAll(); break;
                case 2 : employeeController.selectInfoByIdAndName(inputSearchDTO()); break;
                case 3 : employeeController.selectInfoByDeptTitle(inputDeptTitle()); break;
                case 4 : employeeController.selectInfoByJobName(inputJobName()); break;
                case 5 : employeeSirvice.insertNewDept(inputDeptInfo()); break;
                case 6 : employeeSirvice.insertNewEmp(inputEmpInfo()); break;
                case 7 : employeeSirvice.modifyEmp(inputModifyEmp()); break;
                case 8 : employeeSirvice.deleteEmp(inputEmpId()); break;
                case 9 : employeeController.collectionSearch(); break;
                case 10 :employeeController.selectManager(); break;
                case 0 : return;
            }
        }while (true);



    }

    private EmployeeDTO inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("퇴사한 직원의 아이디를 입력해주세요 : ");
        int id = sc.nextInt();

        EmployeeDTO empList = new EmployeeDTO();

        empList.setId(id);

        return empList;
    }

    private ModifyEmpDTO inputModifyEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 직원의 아이디를 입력해주세요 : ");
        int id = sc.nextInt();
        System.out.print("수정될 직원의 이름을 입력해주세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("수정될 직원의 이메일을 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("수정될 직원의 전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("수정될 부서명을 입력해주세요 : ");
        String deptTitle = sc.nextLine();
        System.out.print("수정될 직급명을 입력해주세요 : ");
        String jobName = sc.nextLine();

        ModifyEmpDTO empList = new ModifyEmpDTO();

        empList.setEmpId(id);
        empList.setEmpName(name);
        empList.setEmpEmail(email);
        empList.setEmpPhone(phone);
        empList.setDepartmentTitle(deptTitle);
        empList.setJobName(jobName);


        return empList;

    }

    private EmployeeDTO inputEmpInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("신규 직원의 아이디를 입력해주세요 : ");
        int id = sc.nextInt();
        System.out.print("신규 직원의 이름을 입력해주세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("신규 직원의 주민등록번호를 입력해주세요 : ");
        String no = sc.nextLine();
        System.out.print("신규 직원의 이메일을 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("신규 직원의 전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("신규 직원의 부서코드를 입력해주세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("신규 직원의 직급코드를 입력해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("신규 직원의 급여등급을 입력해주세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("신규 직원의 급여를 입력해주세요 : ");
        int salary = sc.nextInt();
        System.out.print("신규 직원의 보너스율을 입력해주세요 : ");
        sc.nextLine();
        String bonus = sc.nextLine();
        System.out.print("신규 직원의 관리자 사번을 입력해주세요 : ");
        String managerId = sc.nextLine();
        System.out.print("신규 직원의 입사을 입력해주세요 : ");
        String hireDate = sc.nextLine();

        EmployeeDTO empList = new EmployeeDTO();
        empList.setId(id);
        empList.setName(name);
        empList.setNo(no);
        empList.setEmail(email);
        empList.setPhone(phone);
        empList.setDeptCode(deptCode);
        empList.setJobCode(jobCode);
        empList.setSalLevel(salLevel);
        empList.setSalary(salary);
        empList.setBonus(bonus);
        empList.setManagerId(managerId);
        empList.setHireDate(hireDate);

        return empList;
    }

    private SearchConditionAndValues inputDeptInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("신규 부서코드를 입력해주세요 : ");
        String condition = sc.nextLine();

        System.out.print("신규 부서명을 입력해주세요 : ");
        String values = sc.nextLine();

        return new SearchConditionAndValues(condition, values);
    }

    private SearchConditionAndValues inputJobName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("직급명으로 검색하시겠습니까? ( job ) : ");
        String condition = sc.nextLine();

        System.out.print("검색하실 직급명을 입력해주세요 : ");
        String values = sc.nextLine();

        return new SearchConditionAndValues(condition, values);

    }

    private SearchConditionAndValues inputDeptTitle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("부서명으로 검색하시겠습니까? ( dept ) : ");
        String condition = sc.nextLine();

        System.out.print("검색하실 부서명을 입력해주세요 : ");
        String values = sc.nextLine();

        return new SearchConditionAndValues(condition, values);
    }

    private SearchConditionAndValues inputSearchDTO() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색 조건을 입력하세요 ( id or name ) : ");
        String condition = sc.nextLine();

        System.out.print("검색하실 id, name 을 입력하세요 : ");
        String Values = sc.nextLine();


        return new SearchConditionAndValues(condition,Values);
    }
}
