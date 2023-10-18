-- view 생성
create view view_emp10 as 
select empno, ename, sal, deptno from emp where deptno = 10;

drop view view_emp10;

select view_name, text from user_views;

insert into view_emp10
values(8000, 'angel', 7000, 10);
select * from view_emp10;
select * from emp10;

desc view_emp10;
create or replace
view view_emp10(사원번호, 사원명, 급여, 부서번호)
as select empno, ename, sal, deptno from emp10;
create or replace
view view_emp(사원번호, 사원명, 급여, 부서번호)
as select empno, ename, sal, deptno from emp10;

select * from view_emp10;
-- 컬럼에 별칭을 사용해서 뷰를 생성하면 컬럼 이름만 별칭으로 데이터 구조에 반영되고 emp10 테이블을 컬럼에는 전혀 영향을 주지 않기 때문에 오류가 발생함
select * from view_emp10 where 부서번호 = 10;
select * from view_emp where 부서번호 = 10;

-- 부서별 급여 총액과 평균을 구하는 작업을 뷰로 생성해 놓고 가져다 사용해 보장
create view view_sal as select deptno, sum(sal) as "SalSum", avg(sal) as "SalAvg" from emp10 group by deptno; 

-- 복합 뷰 생성
create view view_emp_dept as select e.ename, e.sal, e.deptno, d.dname, d.loc from emp e, dept d
where e.deptno = d.deptno order by empno desc;

-- 복합 뷰 조회
select * from view_emp_dept;

-- 복합 뷰 삭제
drop view view_sal;
select view_name, text from user_views;
select * from emp10;

-- 뷰 수정 (or replace)
create or replace view view_emp10
as select empno, ename, sal, comm, deptno from emp10 where deptno = 10;

create or replace force view view_notable
as select empno, ename, sal, comm, deptno from emp10 where deptno = 10;

-- with check option
create or replace view view_chk20
as select empno, ename, sal, comm, deptno from emp10
where deptno = 20 with check option;

update view_chk20 set ename='SK' where empno = 7369;

update view_chk20 set deptno = 10 where sal >= 5000;

select deptno, sal from emp10;

create or replace view view_read30
as select empno, ename, sal, comm, deptno from emp10
where deptno = 30 with read only;

update view_read30 set comm = 1000;

-- 시작값은 1이고 1씩 증가하고, 최대값이 1000000이 되는 시퀀스 생성
create SEQUENCE emp_seq start with 1
INCREMENT by 1 MAXVALUE 10000000;

drop table emp01;
-- emp 테이블에서 일부 컬럼(empno, ename, hiredate)의 구조만 복사하여 비어 있는 테이블 생성(emp01)
create table emp01 as
select empno, ename, hiredate from emp where 1 = 0;
select * from emp01;
delete from emp01 where empno = 1;

insert into emp01 values(EMP_SEQ.nextval, 'JULIA', sysdate);
insert into emp01 values(1, 'JULIA', sysdate);
select emp_seq.currval from dual;
commit;

create table dept03 as
select * from dept where 1 = 0;
select * from dept03;

-- 10부터 10씩 증가하면서 최대 30까지의 값을 갖는 시퀀스(dept_seq) 생성
create SEQUENCE dept_seq
start with 10 
INCREMENT by 10 MAXVALUE 30;

-- dept03 시퀀스에 데이터 추가
insert into dept03 values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept03 values(DEPT_SEQ.nextval, 'RESEARCH', 'DALLAS');
insert into dept03 values(DEPT_SEQ.nextval, 'SALES', 'CHICAGO');
insert into dept03 values(DEPT_SEQ.nextval, 'OPERATIONS', 'BOSTON');


create table dept03 (
deptno number(2) primary key,
dname varchar2(14),
loc varchar2(13));

-- 시퀀스 수정
alter sequence dept_seq
maxvalue 1000;

-- user_sequence 데이터 사전에 시퀀스 값이 설정되어 있는 것을 확인할 수 있음
select sequence_name, min_value, max_value, increment_by, cycle_flag from user_sequences;

select * from tab;

-- 시스템 권한 부여
create user orauser01 identified by user01;
grant create session to orauser01;
grant create table to orauser01;
grant resource to orauser01;
-- xe2로 접속해서 권한 부여

-- 사용자에게 부여한 권한 회수
revoke resource from orauser01;
revoke create table from orauser01;
revoke create session from orauser01;
-- xe2로 접속해서 권한 회수

create table department(
deptno number(3) not null, 
dname varchar2(30) not null,
college varchar2(30) not null,
loc varchar2(10) not null,
constraint DEPARTMENT_PK primary key(deptno));

commit;

select * from department;

update department set dname = '컴퓨터공학과' where deptno = 204;

