package com.ohgiraffers.employee.run;

import com.ohgiraffers.employee.view.EmployeeView;

public class Application {

    public static void main(String[] args) {

        /* 실행용 클래스 */
        /* 제공된 패키지에 필요한 클래스를 생성하고 코드를 기입 */
        /* 데이터베이스 명 : employee
        *  아이디는 기존에 사용했던 ohgiraffers를 이용
        * */

        EmployeeView employeeView = new EmployeeView();

        employeeView.displayView();
    }
}
