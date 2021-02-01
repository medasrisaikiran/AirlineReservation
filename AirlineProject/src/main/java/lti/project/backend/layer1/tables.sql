/*DROPPING TABLES*/
drop table userdetails cascade constraints;
drop table flightdetails cascade constraints;
drop table ticket cascade constraints;
drop table bookingdetails cascade constraints;

/* Showing results for Booknew.xlsx */

ALTER SESSION SET NLS_DATE_FORMAT='MM-DD-RR';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE userDetails(
userid Number constraint pk_userid primary key,
firstname VARCHAR2(30) constraint nn_firstname not null,
lastname VARCHAR2(30) constraint nn_lastname not null,
email VARCHAR2(30) constraint u_email unique,
gender VARCHAR2(2),
mobile Number constraint u_mobile unique,
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
FlightId Number constraint pk_flightid primary key,
Source VARCHAR2(20) constraint nn_source not null,
Destination VARCHAR2(20) constraint nn_destination not null,
Capacity Number constraint check_capacity check(Capacity >0),
Duration timestamp,
Departure_time timestamp,
Arrival_time timestamp,
Economy_class_price Number,
Business_class_price Number,
Cabin VARCHAR2(1)
);

/* INSERT QUERY NO: 1 */
INSERT INTO FlightDetails
VALUES
(
10001, 'Hyderabad', 'Mumbai', 54, '4:00', '9:00','14:00', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 2 */
INSERT INTO FlightDetails
VALUES
(
10002, 'Hyderabad', 'Kolkata', 54,  '5:30','14:00','19:30', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 3 */
INSERT INTO FlightDetails
VALUES
(
10003, 'Hyderabad', 'Chennai', 54, '5:00', '17:00', '21:00', 10000, 18000, 'n'
);

/* INSERT QUERY NO: 4 */
INSERT INTO FlightDetails
VALUES
(
10004, 'Hyderabad', 'Bengaluru', 54, '3:30', '10:00', '13:30', 14000, 26000, 'y'
);

/* INSERT QUERY NO: 5 */
INSERT INTO FlightDetails
VALUES
(
10005, 'Hyderabad', 'Delhi', 54, '10:00', '11:30', '21:30', 20000, 36000, 'n'
);

/* INSERT QUERY NO: 6 */
INSERT INTO FlightDetails
VALUES
(
10006, 'Mumbai', 'Hyderabad', 54, '5:00', '11:00', '16:00', 12000, 20000, 'y'
);

/* INSERT QUERY NO: 7 */
INSERT INTO FlightDetails
VALUES
(
10007, 'Mumbai', 'Kolkata', 54, '5:30', '12:00', '17:30', 16000, 30000, 'y'
);

/* INSERT QUERY NO: 8 */
INSERT INTO FlightDetails
VALUES
(
10008, 'Mumbai', 'Chennai', 54, '5:00', '13:00', '18:00', 12000, 20000, 'n'
);

/* INSERT QUERY NO: 9 */
INSERT INTO FlightDetails
VALUES
(
10009, 'Mumbai', 'Bengaluru', 54, '4:00', '13:30', '17:30', 10000, 18000, 'n'
);

/* INSERT QUERY NO: 10 */
INSERT INTO FlightDetails
VALUES
(
10010, 'Mumbai', 'Delhi', 54, '8:00', '8:00', '16:00', 18000, 32000, 'y'
);

/* INSERT QUERY NO: 11 */
INSERT INTO FlightDetails
VALUES
(
10011, 'Kolkata', 'Mumbai', 54, '5:30', '11:30', '18:00', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 12 */
INSERT INTO FlightDetails
VALUES
(
10012, 'Kolkata', 'Hyderabad', 54, '5:30', '13:45', '19:15', 16000, 30000, 'y'
);

/* INSERT QUERY NO: 13 */
INSERT INTO FlightDetails
VALUES
(
10013, 'Kolkata', 'Chennai', 54, '6:00', '14:00', '20:00', 18000, 32000, 'y'
);

/* INSERT QUERY NO: 14 */
INSERT INTO FlightDetails
VALUES
(
10014, 'Kolkata', 'Bengaluru', 54, '6:00', '12:30', '18:30', 16000, 30000, 'n'
);

/* INSERT QUERY NO: 15 */
INSERT INTO FlightDetails
VALUES
(
10015, 'Kolkata', 'Delhi', 54, '5:30', '16:00', '21:30', 12000, 20000, 'n'
);


ALTER SESSION SET  NLS_TIMESTAMP_FORMAT = 'MM-DD-YY HH24:MI';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE Ticket(
TicketId Number constraint pk_ticketid primary key,
seatNumber Number constraint check_seatnumber check(seatNumber between 1 and 54),
Price Number,
departure_date timestamp,
Return_date timestamp
);

/* INSERT QUERY NO: 1 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
103, 1, 12000, '1/14/21 12:00', '1/14/21 12:00'
);

/* INSERT QUERY NO: 2 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
104, 2, 12000, '12/11/20 9:30', '12/11/20 9:30'
);

/* INSERT QUERY NO: 3 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
105, 1, 18000, '1/13/21 12:00', '1/13/21 12:00'
);

/* INSERT QUERY NO: 4 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
106, 1, 20000, '1/14/21 21:00', '1/14/21 21:00'
);

/* INSERT QUERY NO: 5 */
INSERT INTO Ticket(TicketId, seatNumber, Price, departure_date, Return_date)
VALUES
(
107, 2, 20000, '1/14/21 17:00', '1/14/21 17:00'
);

ALTER SESSION SET  NLS_TIMESTAMP_FORMAT = 'MM-DD-YY HH24:MI';


/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE bookingDetails(
BookingId Number constraint pk_booking_id primary key,
FlightId Number ,
userid Number ,
ticketid Number ,
bookingtime timestamp,
status VARCHAR(50),
Departuredate timestamp,
constraint fk_flight_id foreign key(FlightId) references FlightDetails(FlightId),
constraint fk_user_id foreign key(userid) references UserDetails(userid),
constraint fk_ticket_id foreign key(ticketId) references Ticket(ticketid)
);

/* INSERT QUERY NO: 1 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
109, 10001, 101, 103, '1/14/21 12:00', 'active', '7/17/21 15:30'
);

/* INSERT QUERY NO: 2 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
110, 10001, 101, 104, '12/11/20 9:30', 'cancelled', '5/21/21 9:00'
);

/* INSERT QUERY NO: 3 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
111, 10010, 103, 105, '1/13/21 12:00', 'completed', '6/12/21 13:30'
);

/* INSERT QUERY NO: 4 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
112, 10005, 104, 106, '1/14/21 21:00', 'active', '5/5/21 11:00'
);

/* INSERT QUERY NO: 5 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status, Departuredate)
VALUES
(
113, 10005, 104, 107, '1/14/21 17:00', 'completed', '2/9/21 16:00'
);




