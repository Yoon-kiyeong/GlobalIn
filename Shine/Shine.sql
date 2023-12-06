select * from dba_sys_privs
where grantee='SHINE';

create table Employee (
    no number(10) not null,
    ID varchar2(50) unique not null,
    PW varchar2(50) not null,
    Name varchar2(20) not null,
    Position varchar2(20) not null,
    Phone varchar2(50) not null,
    Call varchar2(50) not null,
    Email varchar2(200) not null,
    Gender varchar2(20) not null,
    Birth varchar2(20) not null,
    DeptName varchar2(10) not null,
    DeptNo number(4) not null,
    HireDate date not null,
    ExitDate date,
    Status varchar2(20) not null,
    Photo BLob,
    CONSTRAINT Employee_pk primary key(no)
    );

insert into employee(no, id, pw, name, position, phone, call, email, gender, birth, deptname, deptno, hiredate, status)
values (empNo_seq.NEXTVAL, 'admin', 'admin1234', '包府磊', '包府磊', '010-1111-1111', '02-1111-1111', 'admin@admin.com', '包府磊', '2023-01-01', '包府磊', '0', '2023-01-01' ,'犁流');

create table commute(
    Intimedate DATE,
    OutTime date ,
    DayTotal date ,
    OverTime date ,
    Night date ,
    Holtime date ,
    weektotal date ,
    monthtotal date ,
    no number(10) not null,
    constraint fk_no foreign key(no) references Employee(no));

select * from employee;

commit;

create sequence empNo_seq
increment by 1
start WITH 1 
MINVALUE 1
MAXVALUE 9999
NOCYCLE
NOCACHE
NOORDER;

select * from employee;
select * from commute;

insert into employee(no, id, pw, name, position, phone, call, email, gender, birth, deptname, deptno, hiredate, status)
values (empNo_seq.NEXTVAL, 'test', 'test1234', 'test', '荤盔', '010-2222-2222', '02-1111-2222', 'test@test.com', 'test', '2023-01-01', '包府磊', '0', '2023-01-01' ,'犁流');

drop table commute;
drop table employee;

commit;

select * from employee where id = 'test' and pw = 'test1234';