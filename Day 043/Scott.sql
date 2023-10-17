--부서번호가 10번인 사원들의 입사일을 출력하되 요일까지 출력
select to_char(hiredate, 'yyyy-mm-dd-day') from emp where deptno = 10;

select to_char(sysdate, 'yyyy-mm-dd-dy') from dual;

select to_char(sysdate, 'yyyy-mm-dd-day hh:mi:ss')from dual;

select to_char('12345.67','L999,999,999') from dual;

select to_number('10,000','999,999')+to_number('20,000','999,999') from dual;

-- NVL : null값을 다른 값으로 변환
select ename, sal, comm, job from emp order by job;
select ename, sal, comm, nvl(comm, 0) job from emp order by job;

-- 연봉을 계산하기 위해 급여에 12를 곱한 후 커미션을 더함
select ename, sal, comm, sal*12, sal*12+comm from emp order by job;
select ename, sal, comm, sal*12, sal*12+nvl(comm,0) from emp order by job;

-- 모든 사원은 자신의 상관이 있다. 하지만 emp 테이블에 유일하게 상관이 없는 행이 있다.
-- 그 사원의 MGR column 값은 null이다.
-- 상관이 없는 사원만 출력하되 MGR 컬럼값 NULL 대신 CEO로 출력하시오
select * from emp ;
select ename, decode(mgr,null, 'CEO')from emp where mgr is null;
select ename, nvl(to_char(mgr,'9999'),'CEO') from emp where mgr is null;

select deptno, decode(deptno, 10, 'ACCOUNTING',
20, 'RESEARCH',
30, 'SALES', 
40, 'OPERATOR') as dname from emp;

select ename, deptno, case when deptno = 10 then 'ACCOUNTING'
when deptno = 20 then 'RESEARCH' when deptno = 30 then 'SALES' end dname
from emp;

-- 직급에 따라 보너스를 지급하기 위해 decode 함수를 사용하여 직급이 'MANAGER'인 사원은 15% 인상하고, 'CLERK'인 사원은 5%인상하도록 출력
select * from emp;
select ename, job, sal, decode(job, 'MANAGER', sal *1.15, 'CLERK', sal* 1.05, sal) as "보너스급여" from emp; 

-- 사원들의 급여를 인상해 주는 쿼리문을 case 문을 이용하여 작성
-- 직급이 'CLERK' 인 사람은 급여를 20% 인상, 직급이 'ANALYST' 인 사람은 급여를 15%인상, 직급이 'MANAGER'인 사람은 10% 인상
select ename, job, sal, case when job = 'MANAGER' then sal * 1.10 when job = 'CLERK' then sal * 1.20 when job = 'ANALYST' then sal *1.15 else sal end as"보너스급여" from emp;

select trunc(avg(sal)) from emp;

select max(sal) from emp;
select min(sal) from emp;
select count(*) from emp;

-- 사원들을 사원번호를 기준으로 그룹을 지음
select deptno, sum(sal), trunc(avg(sal)), max(sal), min(sal) from emp group by deptno;
select deptno, sum(sal), trunc(avg(sal)), max(sal), min(sal) from emp group by deptno HAVING avg(sal) >= 2000;

-- Cross Join
select * from emp, dept;

desc emp;
desc dept;

-- emp 테이블과 dept테이블의 공통컬럼인 deptno의 값이 일치되는 조건을 where 절에 사용함
-- 컬럼명이 같게 되면 혼동이 오기 때문에 컬럼명 앞에 테이블명.과 함께 기술

-- Equi Join
select ename, dname from emp, dept where emp.deptno = dept.deptno;
select ename, dname from emp e, dept d where e.deptno = d.deptno;

-- SCOTT인 사람의 정보를 출력하시오
select e.ename, d.dname from emp e, dept d where e.deptno = d.deptno and e.ename='SCOTT';

-- Non Equi Join
select * from salgrade;
select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal >= s.losal and e.sal <= s.hisal;
select e.ename, e.sal, s.grade from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- Outer Join
select * from dept;
select e.ename, d.deptno, d.dname from emp e, dept d where e.deptno = d.deptno order by d.deptno;

-- 부서테이블의 40번 부서와 조인할 사원테이블의 부서번호가 없지만, 40번 부서도 출력되도록 하려면 Outer Join을 사용해야 한다.
-- Outer Join을 하기 위해서 사용하는 기호는 (+)이며 조인 조건에서 정보가 부족한 컬럼명 뒤에 위치 시키면 됨
select e.ename, d.deptno, d.dname from emp e, dept d where e.deptno(+)=d.deptno order by d.deptno;

-- Self Join
select ename, mgr from emp;
select work.ename, manager.ename from emp work, emp manager where work.mgr = manager.empno;

-- 사원의 이름과 그의 매니저 이름을 출력하는 쿼리문을 작성하시오
-- ex) FORD의 매니저는 JONES이다.
select work.ename || '의 매니저는' || manager.ename || '이다'
from emp work, emp manager where work.mgr = manager.empno;

-- 문1] 사원들의 이름, 부서번호, 부서이름을 출력하시오
select e.ename, d.deptno, d.dname from emp e, dept d where e.deptno = d.deptno order by d.deptno;

-- 문2] 부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 출력하시오
select e.ename, e.job, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and d.deptno = 30;

-- 문3] 커미션을 받는 사원의 이름, 커미션, 부서이름 및 부서위치를 출력하시오
select e.ename, e.comm, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and e.comm is not null and e.comm not in (0);

-- 문4] DALLAS에서 근무하는 사원의 이름, 직급, 부서번호, 부서이름을 출력하시오
select e.ename, e.job, d.deptno, d.dname from emp e, dept d where loc ='DALLAS' and e.deptno = d.deptno;

-- 문5] 이름에 A가 들어가는 사원들의 이름과 부서 이름을 출력하시오
select e.ename, d.dname from emp e, dept d where ename like '%A%' and e.deptno = d.deptno;

-- 문6] 사원이름과 직급, 급여, 급여등급을 출력하시오
select e.ename, e.job, e.sal, s.grade from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- 문7] 사원이름, 부서번호와 해당 사원과 같은 부서에서 근무하는 사원을 출력하시오 단, self join으로 쿼리문 작성
select e.ename "자신", e.deptno, c.ename "동료", c.deptno from emp e, emp c
where e.ename <> c.ename and e.deptno = c.deptno order by e.ename;

-- 사원번호, 사원명, 급여 3개의 컬럼으로 구성된 emp01 테이블 생성
create table emp01(empno number(4),
ename varchar2(20),
sal number(7,2));

select * from emp01;
desc emp01;

create table num_temp(
n1 number,
n2 number(9),
n3 number(9,2),
n4 number(9,1),
n5 number(7),
n6 number(7, -2),
n7 number(6),
n8 number(3, 5));

select * from num_temp;

insert into num_temp(n1,n2,n3,n4,n5,n6)
values(1234567.89,1234567.89,1234567.89,1234567.89,1234567.89,1234567.89);

create table emp02 as select * from emp;
select * from emp02;

-- emp01 테이블에 문자 타입의 직급 컬럼 추가
alter table emp01
add(job varchar2(9));
desc emp01;

-- emp01 테이블에서 직급을 최대 30자리까지 변경할 수 있게 수정하시오
alter table emp01
modify (job varchar2(30));
desc emp01;
-- 컬럼 삭제
alter table emp01
drop column job;

-- emp01 테이블 삭제
drop table emp01;
select * from tab;

-- 테이블명 변경
rename emp02 to emp03;
select * from tab;
select * from emp03;