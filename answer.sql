/*1. 직원 전체 조회
    - 출력컬럼: 직원이름, 부서명, 직급, 전화번호
    - 단, 부서가 없는 직원은 '미배정' 이라고 출력
    - 전화번호가 없는 직원은 '미지정' 이라고 출력*/
SELECT E.EMP_NAME,
       IFNULL(D.DEPT_TITLE, '미배정'),
       J.JOB_NAME,
       IFNULL(E.PHONE, '미지정')
FROM EMPLOYEE E
         LEFT JOIN DEPARTMENT D
                   ON E.DEPT_CODE = D.DEPT_ID
         LEFT JOIN JOB J
                   ON E.JOB_CODE = J.JOB_CODE;

/*2. 직원 이름 또는 id로 직원 조회
    - 출력: 직원이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급, 급여*/
SELECT E.EMP_NAME,
       E.EMP_NO,
       E.EMAIL,
       E.PHONE,
       D.DEPT_TITLE,
       J.JOB_NAME,
       E.SALARY
FROM EMPLOYEE E
         JOIN DEPARTMENT D
              ON E.DEPT_CODE = D.DEPT_ID
         JOIN JOB J
              ON E.JOB_CODE = J.JOB_CODE;
# WHERE
#     E.EMP_NAME = '대북혼';
# AND
#     E.EMP_ID = 201;

/*3. 부서명으로 검색하여 포함된 직원들의 목록을 출력
    - 출력 : 직원이름, 이메일, 전화번호, 직급*/
SELECT E.EMP_NAME,
       E.EMAIL,
       E.PHONE,
       J.JOB_NAME,
       D.DEPT_TITLE
FROM EMPLOYEE E
         JOIN DEPARTMENT D
              ON E.DEPT_CODE = D.DEPT_ID
         JOIN JOB J
              ON E.JOB_CODE = J.JOB_CODE
WHERE D.DEPT_TITLE = '인사관리부';

/*4. 직급으로 검색하여 같은 직급의 직원들의 목록을 출력
    - 출력 : 직원이름, 이메일, 전화번호, 부서명*/
SELECT E.EMP_NAME,
       E.EMAIL,
       E.PHONE,
       D.DEPT_TITLE
FROM EMPLOYEE E
         JOIN DEPARTMENT D
              ON E.DEPT_CODE = D.DEPT_ID
         JOIN JOB J
              ON E.JOB_CODE = J.JOB_CODE;
# WHERE J.JOB_NAME = '차장'

/*5. 신규 부서를 생성*/
INSERT INTO DEPARTMENT(DEPT_ID,
                       DEPT_TITLE,
                       LOCATION_ID)
VALUES ('E3', '땡떙부', 'L6');

/*6. 신규 직원을 생성*/
INSERT INTO employee(EMP_ID,
                     EMP_NAME,
                     EMP_NO,
                     EMAIL,
                     PHONE,
                     DEPT_CODE,
                     JOB_CODE,
                     SAL_LEVEL,
                     SALARY,
                     BONUS,
                     MANAGER_ID,
                     HIRE_DATE,
                     ENT_DATE)
VALUES ('223',
        '이준경',
        '991111-1111111',
        'jk_lee@greedy.com',
        '01012345678',
        'D3',
        'J5',
        'S4',
        2500000,
        0.2,
        '201',
        '2013-03-01',
        '2011-01-01',
        'Y');

/*7. 직원 정보 변경*/
UPDATE EMPLOYEE
SET EMP_NAME = '이름이름',
    PHONE = '01012345678',
    EMAIL = 'asd@asd.com',
    DEPT_CODE = 'D3',
    JOB_CODE = 'J2'
WHERE EMP_NO = '770808-2665412';

/*8. 직원 퇴사 기능*/
UPDATE EMPLOYEE
SET ENT_YN = 'Y'
WHERE EMP_ID = '203';

#
# select D.DEPT_TITLE,E.EMP_NAME
# FROM employee E
#          RIGHT JOIN department D ON E.DEPT_CODE = D.DEPT_ID;

#
