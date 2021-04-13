#> mysql -u boot -p

use boot_schema

drop table ADDRESS_FILE;
drop table ADDRESS;

create table ADDRESS(
   SEQ int AUTO_INCREMENT PRIMARY KEY, 
   NAME varchar(10), 
   ADDR varchar(20), 
   RDATE datetime
); 

insert into ADDRESS(NAME, ADDR, RDATE) values('�ѵ���', '�����', now());
insert into ADDRESS(NAME, ADDR, RDATE) values('�Ӽ���', '�λ��', now());
insert into ADDRESS(NAME, ADDR, RDATE) values('������', '��õ��', now());


create table ADDRESS_FILE(
   SEQF int AUTO_INCREMENT PRIMARY KEY, 
   OFNAME varchar(50), 
   SFNAME varchar(50), 
   FSIZE bigint, 
   SEQ int constraint ADDRESS_FK references ADDRESS(SEQ) on delete cascade 
); 
insert into ADDRESS_FILE(OFNAME, SFNAME, FSIZE, SEQ) values('a.png', 'a_123456.png', 1000, 2);
insert into ADDRESS_FILE(OFNAME, SFNAME, FSIZE, SEQ) values('b.png', 'b_123456.png', 2000, 2);
insert into ADDRESS_FILE(OFNAME, SFNAME, FSIZE, SEQ) values('c.png', 'c_123456.png', 3000, 2);
commit;

select * from ADDRESS_FILE;

