drop table flight_details cascade constraints;

create table flight_details
	  (
	     flno number primary key,
	     flname varchar2(20),
	     src varchar2(20),
	     dest varchar2(20)
	  );
	  
insert into flight_details values (101,'AirIndia','Mumbai','New York');
insert into flight_details values (102,'Indian Airlines','Mumbai','France');
insert into flight_details values (103,'British Airways','Mumbai','London');
	  