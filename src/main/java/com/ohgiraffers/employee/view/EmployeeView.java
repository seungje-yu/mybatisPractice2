package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.common.*;
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

        do {
            System.out.println("===직원관리===");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 이름 또는 id로 직원 조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경 (이름, 전화번호, 이메일, 부서, 직급)");
            System.out.println("8. 직원 퇴사 정보 변경");
            System.out.println("9. 퇴사 여부 조회");
            System.out.println("10. 프로그램 종료");
            System.out.println("=============");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : employeeService.firstOrder();
                    break;
                case 2 : employeeService.secondOrder(inputCriteria()); break;
                case 3 : employeeService.thirdOrder(inputThirdCriteria());break;
                case 4 : employeeService.fourthOrder(inputFourthCriteria());break;
                case 5 : employeeService.fiveOrder(inputFiceOrder());break;
                case 6 : employeeService.sixOrder(inputEmployee());break;
                case 7 : employeeService.sevenOrder(inputSevenOrder());break;
                case 8 : employeeService.eightOrder(inputEightOrder());break;
                case 9 : employeeService.tenOrder();break;
                case 10 : return;
                default:
                    System.out.println("잘못된 번호입니다"); break;
            }

        } while (true);

    }

    private static EmployeeDTO inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("신규 사원 코드를 입력하세요 : ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("신규 사원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("신규 사원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("신규 사원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("신규 사원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("신규 사원의 직급코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("신규 사원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();


        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(empId);
        employeeDTO.setEmpName(empName);
        employeeDTO.setEmpNo(empNo);
        employeeDTO.setEmail(email);
        employeeDTO.setPhone(phone);
        employeeDTO.setJobCode(jobCode);
        employeeDTO.setSalLevel(salLevel);

        System.out.println(employeeDTO);

        return employeeDTO;
    }

    private void print(){


    }

    private Dept2DTO inputFiceOrder() {

        Scanner sc = new Scanner(System.in);
        System.out.print("신 부서코드를 입력해주세요 : ");
        String deptId = sc.nextLine();
        System.out.print("신 부서명을 입력해주세요 : ");
        String deptTitle = sc.nextLine();
        System.out.print("지역코드를 입력해주세요 : ");
        String locationId = sc.nextLine();

        Dept2DTO dept2DTO = new Dept2DTO();


        dept2DTO.setLocationId(locationId);
        dept2DTO.setDeptId(deptId);
        dept2DTO.setDeptTitle(deptTitle);

        return dept2DTO;
    }

    private Map<String, Object> inputEightOrder() {

        Scanner sc = new Scanner(System.in);

        System.out.print("퇴사할 직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        Map<String, Object> criteria = new HashMap<>();
        criteria.put("name", name);


        return criteria;
    }

    private Map<String, Object> inputSevenOrder() {

        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 직원 코드를 입력하세요 : ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("변경할 직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("변경할 직원 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("변경할 직원 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("변경할 직원 부서를 입력하세요 : ");
        String deptTitle = sc.nextLine();
        System.out.print("변경할 직원 직급을 입력하세요 : ");
        String jobName = sc.nextLine();

        Map<String, Object> criteria = new HashMap<>();
        criteria.put("code", code);
        criteria.put("name", name);
        criteria.put("phone", phone);
        criteria.put("email", email);
        criteria.put("deptTitle", deptTitle);
        criteria.put("jobName", jobName);


        return criteria;
    }

    private SearchCriteria inputFourthCriteria() {
        Scanner sc = new Scanner(System.in);
        System.out.print("직급을 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria("category", value);
    }

    private SearchCriteria inputThirdCriteria() {

        Scanner sc = new Scanner(System.in);
        System.out.print("부서명을 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria("category", value);
    }

    private SearchCriteria inputCriteria() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 조건을 입력하세요(name or id) : ");
        String codition = sc.nextLine();
        System.out.print("검색할 내용을 입력하세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria(codition, value);
    }


}
