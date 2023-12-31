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

insert into usert values('gildong', '123456', '홍길동', '남자', 'gildong@naver.com');

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
values('aaa', '1111', '홍길동', 'aaa1', 'aaa2', 'hong@gmail.com', '010-1111-1111', '100-10', '서울 구로구', '프로그래머');

insert into tempmember 
values('bbb', '2222', '김철수', 'bbb1', 'bbb2', 'kim@gmail.com', '010-2222-2222', '200-20', '서울 영등포구', '선생님');

insert into tempmember 
values('ccc', '3333', '신짱구', 'bbb1', 'bbb2', 'sin@gmail.com', '010-333-3333', '300-30', '서울 용산구', '요리사');

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

create table board(
num number(7) not null,
writer varchar2(12) not null,
email varchar2(30) not null,
subject varchar2(50) not null,
pass varchar2(10) not null,
readcount number(5) default 0 not null,
ref number(5) default 0 not null,
step number(3) default 0 not null,
depth number(3) default 0 not null,
regdate timestamp(6) default sysdate not null,
content varchar2(4000) not null,
ip varchar2(20) not null,
constraint BOARD_PK primary key(num));

create sequence board_seq
start with 1
INCREMENT BY 1
NOMAXVALUE
NOCACHE
NOCYCLE;

create table Test1 (
name varchar2(10) not null,
id varchar2(20) not null,
major varchar2(20) not null);

insert into Test1 
values('홍길동','0112013','컴퓨터공학');

insert into Test1 
values('김유신','1014011','제어계측공학');

insert into Test1 
values('이순신','0794012','생명공학');

select * from Test1;

commit;

select * from board;