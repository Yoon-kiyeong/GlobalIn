--2023-10-12
select * from tab;  -- table search command
select * from emp;  -- employee search command

select empno, ename, sal from emp;

-- 테이블의 구조 확인
desc emp;

--create table
create table dept01 as select * from dept;

select * from dept01;

--insert value
insert into dept01 values(50, '총무부', '서울');

--dept01 테이블의 지역을 서울에서 부산으로 데이터 수정
update dept01 set loc='부산' where deptno=50;

--dept01 테이블에서 부서번호가 50번인 데이터를 삭제
delete from dept01 where deptno=50;