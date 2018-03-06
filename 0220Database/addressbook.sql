--계정바꾸기 (credu/credu)
select * from tab;
drop table addressbook;

create table addressbook(
num number primary key,
name varchar2(10) not null,
phone varchar2(15),
addr varchar2(70));

create sequence num_seq increment by 1 start with 1 nocycle nocache; 
--auto increment : nocycle은 주기반복X nocache : 캐시사용여부, 캐시사용시 껐다가 키면 기존 값이 날아가서 처음부터 시작
drop sequence num_seq; --시퀀스 삭제

insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'aaa','010-111-1111','서울');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'bbb','010-222-2222','울릉도');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'ccc','010-333-3333','제주도');

select * from addressbook;








