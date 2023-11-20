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
    Photo BLob,
    CONSTRAINT Employee_pk primary key(no)
    );
    
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