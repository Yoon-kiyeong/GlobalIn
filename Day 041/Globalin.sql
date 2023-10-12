create table MEMBER (
ID varchar2(50), pwd varchar2(50), name varchar2(50), gender varchar2(50), age number,
birthday varchar2(50), phone varchar2(50), regdate date);

drop table member;

select lengthb('ab') from dual;
select lengthb('ÇÑ±Û') from dual;

alter table member drop column age;
alter table member add email varchar2(200);

create table NOTICE (
ID number, title nvarchar2(100), write_id nvarchar2(50), content clob, regdate timestamp, hit number, files nvarchar2(1000));

create table "COMMENT"  (
id number, conrtent nvarchar2(2000), regdate timestamp, writer_id nvarchar2(50), notice_id number);

create table role ( id varchar2(50), discriptioion nvarchar2(500));

create table member_role (member_id nvarchar2(50), role_id varchar2(50));