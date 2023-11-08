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
SET EMP_NAME  = '이름이름',
    PHONE     = '01012345678',
    EMAIL     = 'asd@asd.com',
    DEPT_CODE = 'D3',
    JOB_CODE  = 'J2'
WHERE EMP_NO = '770808-2665412';

/*8. 직원 퇴사 기능*/
UPDATE EMPLOYEE
SET ENT_YN = 'Y'
WHERE EMP_ID = '203';

/*9. 부서별 직원 목록 조회
  부서를 먼저 출력한다. 다음에 \t를 여러번 한 다음에
  그 부서에 맞는 직원 리스트를 출력한다. 이때 만약 이 리스트 자체가 null 이라면
  직원 없음. 이라고 출력하면 된다.*/
select D.DEPT_TITLE, E.EMP_NAME
FROM employee E
         RIGHT JOIN department D ON E.DEPT_CODE = D.DEPT_ID;

/*10. 직원목록 조회
  E1 과 E2 를 셀프조인 하는데.
  E1의 관리자 아이디와 E2의 직원 아이디가 같은걸 LEFT JOIN 하므로
  여기서 E1의 관리자 아이디가 null 이라면. 그 직원은 관리자.
  만약 E1의 직원아이디 값이 존재하면 이 직원은 일반직원*/
select E.EMP_NAME,
       E.EMP_NO,
       E.EMAIL,
       IFNULL(E.PHONE,'미지정') AS PHONE,
       E.DEPT_CODE,
       (SELECT J.JOB_NAME FROM JOB J WHERE J.JOB_CODE=E.JOB_CODE) AS JOB_NAME,
       E.ENT_YN,
       CASE
           WHEN (select E1.MANAGER_ID
                 FROM EMPLOYEE E1
                          LEFT JOIN EMPLOYEE E2 ON E1.MANAGER_ID = E2.EMP_ID
                 WHERE E.EMP_ID = E1.EMP_ID) IS NULL THEN '관리자'
           ELSE '직원'
           END AS USER_TYPE
FROM EMPLOYEE E
WHERE DEPT_CODE IS NOT NULL
ORDER BY USER_TYPE;

select E.EMP_NAME,
       E.EMP_NO,
       E.EMAIL,
       IFNULL(E.PHONE,'미지정') AS PHONE,
       E.DEPT_CODE,
       J.JOB_NAME,
       E.ENT_YN,
       CASE
           WHEN (select E1.MANAGER_ID
                 FROM EMPLOYEE E1
                          LEFT JOIN EMPLOYEE E2 ON E1.MANAGER_ID = E2.EMP_ID
                 WHERE E.EMP_ID = E1.EMP_ID) IS NULL THEN '관리자'
           ELSE '직원'
           END AS USER_TYPE
FROM EMPLOYEE E
         JOIN JOB J ON J.JOB_CODE = E.JOB_CODE
WHERE E.DEPT_CODE is not null
ORDER BY USER_TYPE;

select E.EMP_NAME,
       E.EMP_NO,
       E.EMAIL,
       IFNULL(E.PHONE,'미지정') AS PHONE,
       E.DEPT_CODE,
       (SELECT J.JOB_NAME FROM JOB J WHERE J.JOB_CODE=E.JOB_CODE) AS JOB_NAME,
       E.ENT_YN,
       CASE
           WHEN (select E1.MANAGER_ID
                 FROM EMPLOYEE E1
                          LEFT JOIN EMPLOYEE E2 ON E1.MANAGER_ID = E2.EMP_ID
                 WHERE E.EMP_ID = E1.EMP_ID) IS NULL THEN '관리자'
           ELSE '직원'
           END AS USER_TYPE
FROM EMPLOYEE E
WHERE DEPT_CODE IS NOT NULL
ORDER BY USER_TYPE ;