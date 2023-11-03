package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.controller.EmployeeController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeView {

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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        } while (true);

    }

    private static Map<String, String> inputNameOrId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 조건을 입력하세요(Name or Id) : ");
        String condition = sc.nextLine();

        Map<String, String> criteria = new HashMap<>();
        if("Name".equals(condition)){
            System.out.println("검색할 이름을 입력하세요 : ");
            String nameValue = sc.nextLine();

            criteria.put("nameValue", nameValue);
        }else if("Id".equals(condition)){
            System.out.println("검색할 ID를 입력하세요 : ");
            String IdValue = sc.nextLine();

            criteria.put("IdValue", IdValue);

        }
        return criteria;




    }
}
