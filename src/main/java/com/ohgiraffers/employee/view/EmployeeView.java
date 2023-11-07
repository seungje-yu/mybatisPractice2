package com.ohgiraffers.employee.view;

import com.ohgiraffers.common.*;
import com.ohgiraffers.employee.service.EmployeeService;

import java.util.HashMap;
import java.util.Map;

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
        EmployeeService employeeService = new EmployeeService();

        do{
            System.out.println("==================== 직원 관리 ====================");
            System.out.println("1. 직원전체조회");
            System.out.println("2. 직원 이름 또는 id로 직원조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일, 부서, 직급)");
            System.out.println("8. 직원퇴사");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:  employeeService.selectAllEmployee(); break;
                case 2:  employeeService.searchByNameOrId(inputSearchCriteria()); break;
                case 3:  employeeService.searchByDeptTitle(inputSearchCriteria2()); break;
                case 4:  employeeService.searchByJobName(inputSearchCriteria3()); break;
                case 5:  employeeService.createNewDept(inputNewDeptInfo()); break;
                case 6:  employeeService.createNewEmp(inputNewEmp()); break;
                case 7:  employeeService.modifyEmp(inputModify()); break;
                case 8:  employeeService.retirementEmp(inputRetire()); break;
            }
        }while(true);
    }

    private EmployeeDTO inputRetire() {

        Scanner sc = new Scanner(System.in);
        System.out.print("퇴사처리할 사원 이름을 입력하세요 : ");
        String empName = sc.nextLine();
//        System.out.print("퇴사 날짜를 입력하세요 : ");
//        String entDate = sc.nextLine();

        EmployeeDTO retirementEmp = new EmployeeDTO();

        retirementEmp.setEmpName(empName);

        return retirementEmp;


    }

    private EmployeeAndDepartmentAndJob4DTO inputModify() {

        Scanner sc = new Scanner(System.in);

        System.out.print("변경할 사원 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("변경할 전화번호를 입력하세요 : ");
        String Phone = sc.nextLine();
        System.out.print("변경할 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("변경할 부서를 입력하세요 : ");
        String depTitle = sc.nextLine();
        System.out.print("변경할 직급을 입력하세요 : ");
        String jobName = sc.nextLine();

        EmployeeAndDepartmentAndJob4DTO modifyEmp = new EmployeeAndDepartmentAndJob4DTO();
        DepartmentDTO department = new DepartmentDTO();
        JobDTO job = new JobDTO();

        modifyEmp.setEmpName(empName);
        modifyEmp.setPhone(Phone);
        modifyEmp.setEmail(email);
        department.setDepTitle(depTitle);
        job.setJobName(jobName);
        modifyEmp.setJob(job);
        modifyEmp.setDepartment(department);


        return modifyEmp;
    }


    private EmployeeDTO inputNewEmp() {


        Scanner sc = new Scanner(System.in);
        System.out.print("신규 등록할 사원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("신규 등록할 사원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("신규 등록할 사원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("신규 등록할 사원의 휴대폰번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("신규 등록할 사원의 부서코드를 입력하세요 (D1~D9) : ");
        String deptCode = sc.nextLine();
        System.out.print("신규 등록할 사원의 직급코드를 입력하세요 (J1~J7) : ");
        String jobCode = sc.nextLine();
        System.out.print("신규 등록할 사원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("신규 등록할 사원의 급여를 입력하세요 : ");
        double salary = sc.nextDouble();
        System.out.print("신규 등록할 사원의 보너스를 입력하세요 : ");
        float bonus = sc.nextFloat();
        System.out.print("신규 등록할 사원의 사번을 입력하세요 : ");
        String managerId = sc.nextLine();

//        System.out.print("신규 등록할 사원의 입사일을 입력하세요 : ");
//        String hireDate = sc.nextLine();



        EmployeeDTO newEmp = new EmployeeDTO();

        newEmp.setEmpName(empName);
        newEmp.setEmpNo(empNo);
        newEmp.setEmail(email);
        newEmp.setPhone(phone);
        newEmp.setDeptCode(deptCode);
        newEmp.setJobCode(jobCode);
        newEmp.setSalLevel(salLevel);
        newEmp.setSalary(salary);
        newEmp.setBonus(bonus);
        newEmp.setManagerId(managerId);
//        newEmp.setHireDate(hireDate);
        //ent_DATE는 null로
        //ent_yn 은 N 디폴트로 쿼리문에
        return newEmp;
    }

    private DepartmentDTO inputNewDeptInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("신규 생성할 부서코드를 입력하세요 (F1~F9) : ");
        //char(2)로 되어 있어서, 현재 D9까지는 생성되어있고, 그 다음번호인 D10 생성시 크기 에러.
        // 그래서 일단 F1~F9 로 새 코드 부여해서 생성하는 것으로.. +1 씩 늘어나게는 아직 못함.
        String depId = sc.nextLine();
        System.out.print("신규 생성할 부서명을 입력하세요 : ");
        String depTitle = sc.nextLine();
        System.out.print("신규 생성할 부서의 지역을 입력하세요 (L1~L5) : ");
        String locationId = sc.nextLine();


        DepartmentDTO newDept = new DepartmentDTO();

        newDept.setDepId(depId);
        newDept.setDepTitle(depTitle);
        newDept.setLocationId(locationId);

        return newDept;
    }


    private SearchCriteria inputSearchCriteria3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("직급 종류: 대표, 부사장, 부장");
        System.out.println("차장, 과장, 대리, 사원");
        System.out.print("검색하실 직급명을 입력 : ");
        System.out.println();

        String value = sc.nextLine();

        return new SearchCriteria(value);
    }

    private SearchCriteria inputSearchCriteria2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("부서명: 인사관리부, 회계관리부, 마케팅부, 국내영업부");
        System.out.println("해외영업1부, 해외영업2부, 해외영업3부, 기술지원부, 총무부");
        System.out.print("검색하실 부서명을 입력 : ");
        System.out.println();

        String value = sc.nextLine();

        return new SearchCriteria(value);
    }

//    private SearchCriteria inputSearchCriteria() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("직원 검색 (직원이름 또는 ID) : ");
//        String value = sc.nextLine();
//
//        return new SearchCriteria(value);
//    }
    private SearchCriteria inputSearchCriteria() {

        Scanner sc = new Scanner(System.in);

        System.out.print("검색 기준을 입력하세요 (name or ID): ");
        String condition = sc.nextLine();
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();


        return new SearchCriteria(condition, value);
    }

}
