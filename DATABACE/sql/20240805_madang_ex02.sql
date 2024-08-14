/* madang 계정으로 접속 실행하면 Emp, Dept 테이블이 생성된다. */
/* 오라클 데이터베이스에서 scott 계정으로 많이 사용되는 샘플 데이터베이스이다. */

use madangdb;

drop table if exists EMP;
drop table if exists DEPT;
drop table if exists SALGRADE;

CREATE TABLE IF NOT EXISTS DEPT (
  DEPTNO integer NOT NULL,
  DNAME varchar(14),
  LOC varchar(13),
  PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE IF NOT EXISTS EMP (
  EMPNO integer NOT NULL PRIMARY KEY,
  ENAME varchar(10),
  JOB varchar(9),
  MGR integer,
  HIREDATE date,
  SAL integer,
  COMM integer,
  DEPTNO integer,
  FOREIGN KEY (deptno) REFERENCES DEPT(deptno)
);

INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

CREATE TABLE IF NOT EXISTS SALGRADE(
	GRADE INTEGER,
	LOSAL INTEGER,
	HISAL INTEGER
);

INSERT INTO SALGRADE VALUES (1, 700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

select * from EMP;
select * from DEPT;
select * from SALGRADE;

-- <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  문제풀기  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-- 1)사원의 이름과 직위를 출력하세요 단 사원의 이름은 '사원이름' 직위는 '사원직위' 머리글이 나오게
select ENAME as 사원이름, JOB as 사원직위
from EMP;

-- 2) 30번 부서에 근무하는 ㅗㅁ든 사원의 이름과 급여를 출력하세요
select ENAME, SAL
from EMP
where DEPTNO = 30;

-- 3) 사원번호와 이름, 현재급여, 증가급여분(증가액열),10%인상된급여(열이름인상된급여)를 사원번호순으로
select empno, ename,comm as 증가액, ((sal*110)/100) as 인상된급여
from emp
order by empno; 

-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
select ename, deptno
from emp
where ename like ('S%');

-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 
-- 	열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
select max(sal) as MAX, min(sal) as MIN, sum(sal) as SUM, round(avg(sal)) as AVG
from emp;

-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
select job as 업무 , count(ename) as 업무별사원수
from emp
group by job;

-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
select (max(sal) - min(sal)) as 차액
from emp;

-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
select count(ename) as total, sum(sal) as sum, avg(sal) as avg
from emp
where DEPTNO = 30;

-- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요.
     create view gugugu
	 as select DEPTNO, avg(SAL) as vvs
     from EMP
     group by DEPTNO;
     
     select * from gugugu;
     
     select DEPTNO 'Most rich Dept'
     from gugugu
     where  vvs in ( select max(vvs) from gugugu);
     
-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서,
-- 	   업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다.
    create view sipsip
	as select distinct JOB ,(SAL>=3000) as rich
	from EMP
    where (JOB not in ('salesman'));
    
    select * from sipsip;
    
    select EMP.JOB, avg(SAL)
    from EMP, sipsip
    where (EMP.JOB=sipsip.job) and rich
    group by EMP.JOB;

-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하세요.
-- 12) EMP테이블에서 이름, 겹여, 커미션(COMM)금액, 총액(SAL+COMM)을 구하여 총액이 많은 순서대로 출력하세요. 단 커미션이 NULL인 사람은 제외합니다.
-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
-- 14) 사원이 한 명도 없는 부서의 이름을 출력하세요.
-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하세요.
-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하세요.
-- 17) 사원의 이름과 사원의 부서를 출력하세요.
-- 18) 사원의 이름과 팀장(MGR)의 이름을 출력하세요.
-- 19) 사원 SCOTT보다 급여를 많이 받는 사람의 이름을 출력하세요.
-- 20) 사원 SCOTT이 일하는 부서번호 혹은 DALLAS에 있는 부서번호를 출력하세요.
