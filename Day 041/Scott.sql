--2023-10-12
select * from tab;  -- table search command
select * from emp;  -- employee search command

select empno, ename, sal from emp;

-- ���̺��� ���� Ȯ��
desc emp;

--create table
create table dept01 as select * from dept;

select * from dept01;

--insert value
insert into dept01 values(50, '�ѹ���', '����');

--dept01 ���̺��� ������ ���￡�� �λ����� ������ ����
update dept01 set loc='�λ�' where deptno=50;

--dept01 ���̺��� �μ���ȣ�� 50���� �����͸� ����
delete from dept01 where deptno=50;