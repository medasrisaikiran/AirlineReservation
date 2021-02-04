column departure_date format a20;
column arrival_date format a20;
column departure_time format a20;
column duration format a20;
column departuredate format a20;
column bookingtime format a20;
column departure_time format a20;
column arrival_time format a20;
set linesize 300;
set pagesize 100;

/*DROPPING TABLES*/
drop table userdetails cascade constraints;
drop table flightdetails cascade constraints;
drop table ticket cascade constraints;
drop table bookingdetails cascade constraints;

/* Showing results for Booknew.xlsx */

ALTER SESSION SET NLS_DATE_FORMAT='DD-MM-RR';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE userDetails(
userid Number,
firstname VARCHAR2(20),
lastname VARCHAR2(20),
email VARCHAR2(20),
gender VARCHAR2(2),
mobile Varchar2(10),
dob date,
password VARCHAR2(20)
);

/* INSERT QUERY NO: 1 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
101, 'medasri', 'saikiran', 'ms@gmail.com', 'm', 7330844693, '3/12/99', 'Meda@7330'
);

/* INSERT QUERY NO: 2 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
102, 'samanta', 'chauhan', 'sc@gmail.com', 'f', 8421014874, '3/12/99', 'Sama@8421'
);

/* INSERT QUERY NO: 3 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
103, 'rachit', 'lalla', 'rl@gmail.com', 'm', 7030111718, '3/12/99', 'Rach@7030'
);

/* INSERT QUERY NO: 4 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
104, 'sushma', 'sudam', 'ss@gmail.com', 'f', 9100652434, '3/12/99', 'Sush@9100'
);

/* INSERT QUERY NO: 5 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
105, 'tony', 'stark', 'ts@gmail.com', 'm', 1331331331, '3/12/99', 'Tony@1331'
);

/* INSERT QUERY NO: 6 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob,password)
VALUES
(
106, 'harvard', 'stark', 'hs@gmail.com', 'm', 2424242424, '3/12/99', 'Harv@2424'
);



ALTER SESSION SET  NLS_TIMESTAMP_FORMAT ='HH24:MI';



/* CREATE TABLE */
CREATE TABLE FlightDetails(
FlightId Number,
Source VARCHAR2(10),
Destination VARCHAR2(10),
Capacity Number,
Duration timestamp,
Departure_time timestamp,
Arrival_time timestamp,
Economy_class_price Number,
Business_class_price Number,
Cabin VARCHAR2(1)
);

/* INSERT QUERY NO: 1 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10001, 'Hyderabad', 'Mumbai', 54, '4:00', '9:00','14:00', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 2 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10002, 'Hyderabad', 'Kolkata', 54,  '5:30','14:00','19:30', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 3 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10003, 'Hyderabad', 'Chennai', 54, '5:00', '17:00', '21:00', 10000, 18000, 'n'
);

/* INSERT QUERY NO: 4 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10004, 'Hyderabad', 'Bengaluru', 54, '3:30', '10:00', '13:30', 14000, 26000, 'y'
);

/* INSERT QUERY NO: 5 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10005, 'Hyderabad', 'Delhi', 54, '10:00', '11:30', '21:30', 20000, 36000, 'n'
);

/* INSERT QUERY NO: 6 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10006, 'Mumbai', 'Hyderabad', 54, '5:00', '11:00', '16:00', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 7 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10007, 'Mumbai', 'Kolkata', 54, '5:30', '12:00', '17:30', 16000, 30000, 'y'
);

/* INSERT QUERY NO: 8 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10008, 'Mumbai', 'Chennai', 54, '5:00', '13:00', '18:00', 12000, 20000, 'n'
);

/* INSERT QUERY NO: 9 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10009, 'Mumbai', 'Bengaluru', 54, '4:00', '13:30', '17:30', 10000, 18000, 'n'
);

/* INSERT QUERY NO: 10 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10010, 'Mumbai', 'Delhi', 54, '8:00', '8:00', '16:00', 18000, 32000, 'y'
);

/* INSERT QUERY NO: 11 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10011, 'Kolkata', 'Mumbai', 54, '5:30', '11:30', '18:00', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 12 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10012, 'Kolkata', 'Hyderabad', 54, '5:30', '13:45', '19:15', 16000, 30000, 'y'
);

/* INSERT QUERY NO: 13 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10013, 'Kolkata', 'Chennai', 54, '6:00', '14:00', '20:00', 18000, 32000, 'y'
);

/* INSERT QUERY NO: 14 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10014, 'Kolkata', 'Bengaluru', 54, '6:00', '12:30', '18:30', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 15 */
INSERT INTO FlightDetails(flightid,source,destination,capacity,departure_time,arrival_time,duration,economy_class_price,business_class_price,cabin)
VALUES
(
10015, 'Kolkata', 'Delhi', 54, '5:30', '16:00', '21:30', 12000, 20000, 'n'
);

/* INSERT QUERY NO: 16 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10016, 'Chennai', 'Hyderabad', 54, '9:00', '2:00', '5:00', 10000, 18000, 'y'
);

/* INSERT QUERY NO: 17 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10017, 'Chennai', 'Mumbai', 54, '1:15', '6:15', '5:00', 14000, 26000, 'n'
);

/* INSERT QUERY NO: 18 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10018, 'Chennai', 'Kolkata', 54, '5:00', '11:00', '6:00', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 19 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10019, 'Chennai', 'Bengaluru', 54, '3:45', '8:45', '5:00', 10000, 18000, 'y'
);

/* INSERT QUERY NO: 20 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10020, 'Chennai', 'Delhi', 54, '1:00', '11:00', '10:00', 20000, 36000, 'n'
);

/* INSERT QUERY NO: 21 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10021, 'Bengaluru', 'Hyderabad', 54, '11:45', '4:45', '5:00', 14000, 26000, 'n'
);

/* INSERT QUERY NO: 22 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10022, 'Bengaluru', 'Mumbai', 54, '12:00', '4:00', '4:00', 10000, 18000, 'y'
);

/* INSERT QUERY NO: 23 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10023, 'Bengaluru', 'Kolkata', 54, '1:30', '7:30', '6:00', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 24 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10024, 'Bengaluru', 'Chennai', 54, '5:15', '10:15', '5:00', 10000, 18000, 'y'
);

/* INSERT QUERY NO: 25 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10025, 'Bengaluru', 'Delhi', 54, '1:00', '9:00', '8:00', 18000, 18000, 'y'
);

/* INSERT QUERY NO: 26 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10026, 'Delhi', 'Hyderabad', 54, '10:00', '8:00', '10:00', 20000, 36000, 'n'
);

/* INSERT QUERY NO: 27 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10027, 'Delhi', 'Mumbai', 54, '11:15', '9:15', '10:00', 18000, 32000, 'n'
);

/* INSERT QUERY NO: 28 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10028, 'Delhi', 'Kolkata', 54, '4:00', '9:15', '5:30', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 29 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10029, 'Delhi', 'Chennai', 54, '1:00', '11:00', '10:00', 20000, 36000, 'n'
);

/* INSERT QUERY NO: 30 */
INSERT INTO flightdetails(flightid, source, destination, capacity, departure_time, arrival_time, duration, economy_class_price, business_class_price, cabin)
VALUES
(
10030, 'Delhi', 'Bengaluru', 54, '2:00', '10:00', '8:00', 18000, 32000, 'y'
);



ALTER SESSION SET  NLS_TIMESTAMP_FORMAT = 'DD-MM-YY HH24:MI';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE Ticket(
TicketId Number,
seatNumber Number,
Price Number,
departure_date timestamp,
Return_date timestamp
);

/* INSERT QUERY NO: 1 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
103, 1, 12000, '14/1/21 12:00', '14/1/21 12:00'
);

/* INSERT QUERY NO: 2 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
104, 2, 12000, '11/12/20 9:30', '11/12/20 9:30'
);

/* INSERT QUERY NO: 3 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
105, 1, 18000, '13/1/21 12:00', '13/1/21 12:00'
);

/* INSERT QUERY NO: 4 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
106, 1, 20000, '14/1/21 21:00', '14/1/21 21:00'
);

/* INSERT QUERY NO: 5 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
107, 2, 20000, '14/1/21 17:00', '14/1/21 17:00'
);

ALTER SESSION SET  NLS_TIMESTAMP_FORMAT = 'DD-MM-YY HH24:MI:SS';


/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE bookingDetails(
BookingId Number,
FlightId Number ,
userid Number ,
ticketid Number ,
bookingtime timestamp,
status VARCHAR(20),
Departuredate date
);

/* INSERT QUERY NO: 1 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
109, 10001, 101, 103, '14/1/21 12:00', 'active', '17/7/21'
);

/* INSERT QUERY NO: 2 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
110, 10001, 101, 104, '11/12/20 9:30', 'cancelled', '21/5/21'
);

/* INSERT QUERY NO: 3 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
111, 10010, 103, 105, '13/1/21 12:00', 'completed', '12/6/21'
);

/* INSERT QUERY NO: 4 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
112, 10005, 104, 106, '14/1/21 21:00', 'active', '5/5/21 '
);

/* INSERT QUERY NO: 5 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
113, 10005, 104, 107, '14/1/21 17:00', 'completed', '9/2/21'
);

commit;


