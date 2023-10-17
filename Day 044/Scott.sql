create table dept01 (deptno number(2), dname varchar2(14), loc varchar2(13));

desc dept01;
-- 부서번호 10번, 부서이름은 ACCOUNTING, 지역명은 NEW YORK을 추가하시오
insert into dept01(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK'); -- 특정 컬럼 지정
insert into dept01 values(10, 'ACCOUNTING', 'NEW YORK'); -- 모든 값 지정

drop table dept01;

create table dept01(deptno number(2) not null, dname varchar2(14), loc varchar2(13));

create table emp01 as select * from emp;
select * from emp01;
update emp01 set deptno = 30;
rollback;
-- 모든 사원들의 급여를 10% 인상
update emp01 set sal = sal * 1.1;
-- 모든 사원들의 입사일을 오늘 날짜로 수정
update emp01 set hiredate = sysdate;

-- 특정 행만 변경 : update문에 where 절을 추가하여 조건에 만족하는 특정 행만 변경

-- 부서번호가 10번인 사원만 30번으로 수정
update emp01 set deptno = 30 where deptno = 10;

-- 급여가 3000 이상인 사원만 급여를 10% 인상하시오
update emp01 set sal = sal * 1.1 where sal >= 3000;

-- scott의 부서번호는 10번으로, 직급은 manager로 수정하시오
update emp01 set deptno = 10, job = 'MANAGER' where ename = 'SCOTT';
select * from emp01 where ename = 'SCOTT';

-- scott의 입사일을 오늘로, 급여 50, 커미션 4000으로 수정하시오
update emp01 set hiredate = sysdate, sal = 50, comm = 4000 where ename= 'SCOTT';

delete from dept01;

delete from dept01 where deptno = 30;

select * from tab;
drop table emp01;

-- 다음과 같은 구조로 emp01테이블을 생성하시오
-- 컬럼이름         자료형
-- empno          number(4)      
-- ename          varchar2(10)
-- job            varchar2(9)
-- mgr            number(4)
-- hiredate       date
-- sal            number(7,2)
-- comm           number(7,2)
-- deptno         number(2)

-- 다음 데이터를 추가하시오
-- empno    ename   job         mgr     hiredate    sal  comm deptno
-- 7988     smith   cleak       7836    80/12/17    800         20
-- 7499     allen   salesman    7836    80/12/20    1600 300    30
-- 7839     king    president                       5000 
create table emp01 (empno number(4), ename varchar2(10), job varchar2(9), mgr number(4), hiredate date, sal number(7,2), comm number(7,2), deptno number(2));
insert into emp01 (empno, ename, job, mgr, hiredate, sal, deptno)
values (7988, 'smith', 'clerk', 7836, '1980-12-17', 800, 20);
insert into emp01 (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (7499, 'allen', 'salesman', 7836, '1980-12-20', 1600, 300, 30);
insert into emp01 (empno, ename, job, sal)
values (7839, 'king', 'president', 5000);

select * from emp01;

drop table dept01;
create table dept01 as select * from dept;
select * from dept01; -- 데이터 확인 작업
delete from dept01; -- 전체 데이터 삭제
rollback; -- 삭제 이전 상태로 되돌림

-- 부서번호 20번 삭제 후 확인
delete from dept01 where deptno = 20;
commit; -- 데이터베이스에 영구 저장
rollback; -- 커밋을 완료한 후에는 rollback을 해도 소용 없음

-- not null 제약조건
-- 사원번호, 사원명, 직급, 부서번호 4개의 컬럼으로 구성된 아무런 제약조건이 없는 emp01 테이블을 완성하시오
create table emp01(empno NUMBER(4) not null, ename varchar2(20) not null, job varchar2(20), deptno number(7,2));
insert into emp01 values(null, null, 'salesman', 30);

create table emp05(
empno number(4) primary key, nemae varchar2(10) not null, job varchar2(9), deptno number(4) references dept(deptno));

insert into dept01(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept01(deptno, dname, loc) values(20, 'RESEARCH', 'DALLAS');
insert into dept01(deptno, dname, loc) values(30, 'SALES', 'CHICAGO');
insert into dept01(deptno, dname, loc) values(20, 'OPERATION', 'BOSTON');

create table emp06(
empno number(4) primary key,
ename varchar2(10) not null,
gender varchar2(1) check(gender in ('M', 'F')));

insert into emp06 values(7566,'JONES','M');

create table emp05(empno number(4) constraint EMP05_EMPNO_PK primary key,
ename varchar2(10) constraint EMP05_ENAME_NN not null,
job varchar2(9) constraint EMP05_JOB_UK UNIQUE, deptno number(4) REFERENCES dept01(deptno));

insert into emp05 values(7499, 'ALLEN', 'SALESMAN', 30);

create table emp04(empno number(4), ename varchar2(10) not null, job varchar2(9), deptno number(4),
primary key(empno), unique(job), foreign key (deptno) references dept01(deptno));

select constraint_name, constraint_type, table_name, r_constraint_name from user_constraints where table_name = 'emp01';

alter table emp01 add primary key(empno);

select constraint_name, constraint_type, table_name, r_constraint_name from user_constraints where table_name = 'emp05';

drop table dept01;
alter table emp05 -- 제약조건 비활성화
disable constraint EMP05_DEPTNO_PK;

alter table emp05 -- 제약조건 활성화
enable constraint EMP05_DEPTNO_PK;

alter table dept01
disable primary key cascade; -- 부모테이블의 기본키에 대한 제약조건을 비활성화

select deptno from emp where ename = 'SCOTT'; -- 서브쿼리
select dname from dept where deptno = 20; -- 메인쿼리
select dname from dept where deptno =(select deptno from emp where ename = 'SCOTT');

-- SMITH과 같은 부서에서 근무하는 사원의 정보를 출력하시오
select deptno from emp where ename='SMITH';
select * from emp where deptno = (select deptno from emp where ename='SMITH');

-- 서브쿼리에서 그룹함수 사용
-- 서브쿼리를 사용하여 평균 급여보다 더 많은 급여를 받는 사원을 검색하여 출력
select avg(sal) from emp;
select sal from emp where sal > 2037;

select trunc(AVG(SAL)) from emp;
select sal from emp where sal > (select trunc(AVG(SAL)) from emp);

-- 급여가 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원을 출력하시오
select distinct deptno from emp where sal >= 3000;
select ENAME, sal, deptno from emp where deptno = 20;
select ename, sal, deptno from emp where deptno = 30;
select ename, sal, deptno from emp where deptno IN(SELECT DISTINCT DEPTNO FROM EMP WHERE SAL >= 3000);

-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사람의 이름, 급여를 출력하는 쿼리문을 작성하시오
select sal from emp where deptno = 30;
select ename, sal from emp where sal > 2850;
select ename, sal from emp where sal > all(SELECT sal FROM EMP WHERE DEPTNO = 30);

-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여를 출력하시오
select sal from emp where deptno = 30;
select ename, sal from emp where sal > 950;
select ename, sal from emp where sal > any(SELECT sal from emp where deptno = 30);

-- 사원들 중에서 커미션을 받는 사원이 한명이라도 있을 경우 모든 사원정보를 출력하시오
select empno from emp where comm is not null;
select * from emp where exists (select empno from emp where comm is not null);

select * from emp;
select * from dept;
-- 서브쿼리를 이용하여 쿼리문을 작성하시오
-- 문1) SCOTT의 급여와 동일하거나 더 많이 받는 사원명과 급여를 출력하시오
select ename, sal from emp where sal >= (select sal from emp where ename='SCOTT');
-- 문2) 직급이 사원인 사람의 부서와 부서번호와 부서명과 지역명을 출력하시오
select deptno, dname loc from dept where deptno in (select deptno from emp where job = 'clerk');
-- 문3) 이름에 T를 포함하고 있는 사원들과 같은 부서에 근무하고 있는 사원의 사원번호, 이름을 출력하시오
select empno 
-- 문4) 부서위치가 DALLAS인 모든 사원의 이름, 부서번호를 출력하시오

-- 문5) SALES 부서의 모든 사원의 이름과 급여를 출력하시오
select ename, sal from emp where job = 'SALESMAN';
-- 문6) KING에게 보고 하는 모든 사원의 이름과 급여를 출력하시오
select ename, sal from emp where MGR = 7839;
-- 문7) 자신의 급여가 평균 급여보다 많고 이름에 S가 들어가는 사원과 동일한 부서에서 근무하는 모든 사원의 사원번호, 이름 및 급여를 출력하시오



