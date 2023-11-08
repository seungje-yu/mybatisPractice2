package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.controller.EmployeeController;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeView {
    EmployeeController employeeController = new EmployeeController();

    public void displayView() {
        Scanner sc = new Scanner(System.in);
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
        do {
            System.out.println("===== 직원 관리 =====");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 이름 또는 id로 직원 조회");
            System.out.println("3. 부서명으로 검색");
            System.out.println("4. 직급으로 검색");
            System.out.println("5. 신규 부서 생성");
            System.out.println("6. 신규 직원 생성");
            System.out.println("7. 직원 정보 변경(이름, 전화번호, 이메일, 부서, 직급");
            System.out.println("8. 직원 퇴사");
            System.out.println("9. 부서별 직원 목록 조회");
            System.out.println("10. 직원목록 조회(관리자, 직원)");
            System.out.println("11. 끝내기");
            System.out.println("==========");
            System.out.print("메뉴: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    employeeController.selectAllEmployees();
                    break;
                case 2:
                    employeeController.selectEmployeeByNameOrId(inputNameOrId());
                    break;
                case 3:
                    employeeController.selectEmployeesByDeptTitle(inputDeptTitle());
                    break;
                case 4:
                    employeeController.selectEmployeesByJobName(inputJobName());
                    break;
                case 5:
                    employeeController.insertDept(inputDeptInfo());
                    break;
                case 6:
                    employeeController.insertEmp(inputEmpInfo());
                    break;
                case 7:
                    employeeController.updateEmp(inputEmpInfo2());
                    break;
                case 8:
                    employeeController.resignEmp(inputEmpInfo3());
                    break;
                case 9:
                    employeeController.selectEmployeesAndDept();
                    break;
                case 10:
                    employeeController.selectEmployeeAndManagerId();
                    break;
                case 11:
                    System.out.println("종료합니다.");
                    return;
            }
        } while (true);
    }

    private Map<String, String> inputEmpInfo3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("직원 퇴사 유무를 변경할 empId를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("변경할 entYn를 입력하세요 : ");
        String entYn = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("empId", empId);
        map.put("entYn", entYn);
        return map;
    }

    private Map<String, String> inputEmpInfo2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("바꿀 직원의 empNo를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("바꿀 empName을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("바꿀 email를 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("바꿀 phone를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("바꿀 deptCode를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("바꿀 jobCode를 입력하세요 : ");
        String jobCode = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("empName", empName);
        map.put("empNo", empNo);
        map.put("email", email);
        map.put("phone", phone);
        map.put("deptCode", deptCode);
        map.put("jobCode", jobCode);
        return map;
    }

    private Map<String, Object> inputEmpInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("새로만들 empId를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("새로만들 empName을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("새로만들 empNo를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("새로만들 email를 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("새로만들 phone를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("새로만들 deptCode를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("새로만들 jobCode를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("새로만들 salLevel를 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("새로만들 salary를 입력하세요 : ");
        int salary = sc.nextInt();
        System.out.print("새로만들 bonus를 입력하세요 : ");
        double bonus = sc.nextDouble();
        System.out.print("새로만들 managerId를 입력하세요 : ");
        sc.nextLine();
        String managerId = sc.nextLine();
        System.out.print("새로만들 hireDate를 입력하세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("새로만들 entDate를 입력하세요 : ");
        String entDate = sc.nextLine();
        System.out.print("새로만들 entYn를 입력하세요 : ");
        String entYn = sc.nextLine();
        Map<String, Object> map = new HashMap<>();
        map.put("empId", empId);
        map.put("empName", empName);
        map.put("empNo", empNo);
        map.put("email", email);
        map.put("phone", phone);
        map.put("deptCode", deptCode);
        map.put("jobCode", jobCode);
        map.put("salLevel", salLevel);
        map.put("salary", salary);
        map.put("bonus", bonus);
        map.put("managerId", managerId);
        map.put("hireDate", hireDate);
        map.put("entDate", entDate);
        map.put("entYn", entYn);
        return map;
    }

    private Map<String, String> inputDeptInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("새로만들 deptId를 입력하세요 : ");
        String deptId = sc.nextLine();
        System.out.print("새로만들 deptTitle을 입력하세요 : ");
        String deptTitle = sc.nextLine();
        System.out.print("새로만들 locationId를 입력하세요 : ");
        String locationId = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("deptId", deptId);
        map.put("deptTitle", deptTitle);
        map.put("locationId", locationId);
        return map;
    }

    private Map<String, String> inputJobName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 직급을 입력하세요 : ");
        String jobName = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        return map;
    }

    private Map<String, String> inputDeptTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 부서명을 입력하세요 : ");
        String deptTitle = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("deptTitle", deptTitle);
        return map;
    }

    private Map<String, String> inputNameOrId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("선택 옵션을 입력하세요(이름 / 아이디) : ");
        String category = sc.nextLine();
        System.out.print("찾을 값을 입력하세요 : ");
        String value = sc.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("category", category);
        map.put("value", value);
        return map;
    }
}
