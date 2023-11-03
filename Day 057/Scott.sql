create table visit (
no number(5) not null, 
writer varchar2(20) not null,
memo varchar2(4000) not null,
regdate date not null,
CONSTRAINT VISIT_PK primary key(no));

create sequence visit_seq
start with 1
increment by 1
nomaxvalue
nocache
nocycle;

commit;

select * from visit;

create table USERT (
userID varchar2(20),
userPassword varchar2(20),
userName varchar2(20),
usergender varchar2(20),
userEmail varchar2(50),
PRIMARY KEY (userID));

desc usert;

insert into usert values('gildong', '123456', 'ȫ�浿', '����', 'gildong@naver.com');

select * from usert;

create table tempmember (
   id varchar2(20) primary key,
   passwd varchar2(20),
   name varchar2(20),
   mem_num1 varchar2(6),
   mem_num2 varchar2(7),
   e_mail varchar2(50),
   phone varchar2(20),
   zipcode varchar2(7),
   address varchar2(80),
   job varchar2(30)
);

insert into tempmember 
values('aaa', '1111', 'ȫ�浿', 'aaa1', 'aaa2', 'hong@gmail.com', '010-1111-1111', '100-10', '���� ���α�', '���α׷���');

insert into tempmember 
values('bbb', '2222', '��ö��', 'bbb1', 'bbb2', 'kim@gmail.com', '010-2222-2222', '200-20', '���� ��������', '������');

insert into tempmember 
values('ccc', '3333', '��¯��', 'bbb1', 'bbb2', 'sin@gmail.com', '010-333-3333', '300-30', '���� ��걸', '�丮��');

select * from tempmember;

commit;

create table zipcode(
seq number(5) not null,
zipcode varchar2(7) not null,
sido varchar2(6) not null,
gugun varchar2(30) not null,
dong varchar2(50) not null,
ri varchar2(80),
bunji varchar2(20),
constraint ZIPCODE_PK primary key(seq));

create table student(
id varchar2(12) not null,
pass varchar2(12) not null,
name varchar2(10) not null,
phone1 varchar2(3) not null,
phone2 varchar2(4) not null,
phone3 varchar2(4) not null,
email varchar2(50) not null,
zipdcode varchar2(7) not null,
address1 varchar2(120) not null,
address2 varchar2(50) not null,
constraint STUDENT_PK primary key(id)
);

drop table student;
select * from student;

commit;

select * from zipcode;


