select * from tab;

select * from employee;

DESC department

SELECT * FROM department;

-- SELECT 필드명들 FROM 테이블명 WHERE 조건식;

-- 사원 테이블에서 사원번호, 사원이름, 직급, 부서번호를 추출하시오.
SELECT eno, ename, job, dno FROM employee;


-- 사원 테이블에서 급여가 1,000$ 이상인 사원의 사원번호, 사원이름, 직급을 추출하시오
SELECT eno, ename, job, salary FROM employee WHERE salary >= 1000;


-- 사원테이블에서 부서번호가 20번에 해당하는 사원의 사원번호, 이름, 직급, 부서번호를 추출하시오.
Select eno, ename, job, dno
FROm employee
WHERE dno = 20;


-- 사원테이블에서 부서번호가 20번 or 30번에 해당하는 사원의 사번, 이름, 직급, 부서번호 추출
SELECT eno, ename, job, dno
FROM employee
WHERE dno = 20
OR dno = 30;


-- 사원테이블에서 입사년도가 1980년도인 사원의 사번, 이름, 직급, 입사일을 추출하시오.
-- 날짜를 문자열로 인식하므로 따옴표를 통해서 묶어야 한다. 
SELECT eno, ename, job, hiredate
FROM employee
WHERE hiredate >= '1981-02-01' and hiredate <= '1981-02-28';


-- 사원테이블에서 급여가 1000에서 1500 사이에 해당하는 직원의 사원번호,이름, 직급, 급여를 추출하시오. 
-- 범위 지정은 between으로 손쉽게 가능하다.
SELECT eno, ename, job, salary
from employee
WHERE salary between 1000 and 1500;


-- 사원테이블에서 급여가 2000미만이거나 3000 초과인 해당하는 직원의 사원번호,이름, 직급, 급여를 추출하시오. 
SELECT eno, ename, job, salary
FROM employee
WHERE salary > 3000 
OR salary < 2000;


-- 커미션이 300 혹은 500혹은 1400인 사원이 있는지 검색하는 쿼리문
-- in('a', 'b', 'c') 로 구성되며 소괄호 안에 검색할 것을 dtype에 맞게 넣으면 됨.
SELECT commission FROM employee WHERE commission in(300, 500, 1400);
SELECT commission FROM employee WHERE commission not in(300, 500);


-- LIKE 연산자 : 컬럼에 저장된 데이터의 시작 위치에 데이터가 일치하면 조회가 가능한 연산자이다.
-- '%박%'  : 박으로 시작하던, 박으로 끝나던, 박이 중간에 있던, 즉 박을 '포함'하라는 의미임.

-- SMITH이름을 가진 사원에 대한 정보를 추출
SELECT * FROM employee WHERE ename NOT LIKE '%S';

-- _(언더바)는 1개당 1글자를 의미함.
SELECT * FROM employee WHERE ename LIKE '____S';

-- commission이 null인 직원에 대한 정보를 추출하시오.
SELECT * FROM employee WHERE commission is not null;


-- 임시테이블을 dual 이라고 사용
-- 이 dual은 단순 계산, 연산, 표시 등을 하는데 사용할 때 편함
-- 현재 시스템에 등록된 시간을 확인하는 명령
select sysdate from dual;

