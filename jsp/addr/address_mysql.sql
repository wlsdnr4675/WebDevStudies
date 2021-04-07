#> mysql -u boot -p

use boot_schema

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

commit;

