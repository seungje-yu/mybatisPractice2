package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.controller.EmployeeController;
import com.ohgiraffers.employee.common.SearchCriteria;
import com.ohgiraffers.employee.dto.DepartmentDTO;
import com.ohgiraffers.employee.dto.EmployeeDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class EmployeeView {
    PrintResult printResult = new PrintResult();

    public void displayView() {
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("*•.¸✨¸.•*” 직원 관리 *•.¸✨¸.•*”");
            System.out.println("1. 직원전체조회");
            System.out.println("2. 직원 이름 또는 id로 직원조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일,부서, 직급)");
            System.out.println("8. 직원퇴사");
            System.out.println("9. 프로그램 종료");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    employeeController.selectAllMember();
                    break;
                case 2:
                    employeeController.selectNameOrID(inputNameOrId());
                    break;
                case 3:
                    employeeController.selectAllDepartment();
                    employeeController.searchDepartment(inputDepartment());
                    break;
                case 4:
                    employeeController.searchJob(inputJob());
                    break;
                case 5:
                    employeeController.insertDepartment(inputDepartmentId());
                    break;
                case 6:
                    employeeController.insertEmployee(inputEmployee());
                    break;
                case 7:
                    employeeController.modifyEmployee(ModifyEmployee());
                    break;
                case 8:
                    employeeController.modifyHire(modifyHire());
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        } while (true);

    }

    private static Map<String , String > modifyHire() {
        Scanner sc = new Scanner(System.in);
        System.out.print("해고할 직원의 사원 번호를 입력해주세요 : ");
        String empId = sc.nextLine();
        System.out.print("해고일자를 입력해주세요 : ");
        String hireDate = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("hireDate", hireDate);
        return parameter;

    }

    private static Map<String , String> ModifyEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 직원의 사번을 입력하세요 : ");
        String empId = sc.nextLine();

        System.out.print("수정할 직원의 이름을 입력하세요 : ");
        String empName = sc.nextLine();

        System.out.print("수정할 직원의 연락처를 입력하세요 : ");
        String phone = sc.nextLine();

        System.out.print("수정할 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();

        System.out.print("수정할 직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();

        System.out.print("수정할 직원의 직급을 입력하세요 : ");
        String jobCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId",empId);
        parameter.put("empName",empName);
        parameter.put("phone",phone);
        parameter.put("email",email);
        parameter.put("deptCode",deptCode);
        parameter.put("jobCode",jobCode);

        return parameter;




    }

    private static  Map<String , String> inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 직원의 사원번호를 입력하세요 : ");
        String empId = sc.nextLine();

        System.out.print("등록할 직원의 이름를 입력하세요 : ");
        String empName = sc.nextLine();

        System.out.print("등록할 직원의 주민등록번호를 입력하세요 : ");
        String empNo = sc.nextLine();

        System.out.print("등록할 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();

        System.out.print("등록할 직원의 연락처를 입력하세요 : ");
        String phone = sc.nextLine();

        System.out.print("등록할 직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();

        System.out.print("등록할 직원의 직급코드를 입력하세요 : ");
        String jobCode = sc.nextLine();

        System.out.print("등록할 직원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();

        System.out.print("등록할 직원의 급여를 입력하세요 : ");
        String salary = sc.nextLine();

        System.out.print("등록할 직원의 보너스율을 입력하세요 : ");
        String bonus = sc.nextLine();

        System.out.print("등록할 직원의 관리자사번을 입력하세요 : ");
        String managerId = sc.nextLine();

        System.out.print("등록할 직원의 입사일자를 입력하세요 : ");
        String entDate = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerId", managerId);
        parameter.put("entDate", entDate);




        return parameter;
    }

    private static Map<String ,String > inputDepartmentId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 신규 부서의 ID값을 입력하세요 : ");
        String deptId = sc.nextLine();
        System.out.print("등록할 신규 부서명을 입력하세요 : ");
        String deptTitle = sc.nextLine();
        System.out.print("등록할 신규 부서의 지역코드을 입력하세요 : ");
        String locationId = sc.nextLine();

        Map<String ,String > inputDept = new HashMap<>();
        inputDept.put("deptId", deptId);
        inputDept.put("deptTitle", deptTitle);
        inputDept.put("locationId", locationId);



        return inputDept;

    }

    private static String inputJob() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 직급을 입력하세요 : ");
        String condition = sc.nextLine();

        return condition;
    }

    private static String inputDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("검색할 부서를 입력하세요 : ");
        String department = sc.nextLine();

        return department;
    }

    private static SearchCriteria inputNameOrId() {


        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 조건을 입력하세요(name or id) : ");
        String condition = sc.nextLine();

        System.out.print("검색할 키워드를 입력하세요 : ");
        String value = sc.nextLine();


        return new SearchCriteria(condition, value);




    }
}
