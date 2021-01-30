/* Showing results for Booknew.xlsx */

ALTER SESSION SET NLS_DATE_FORMAT='MM-DD-RR';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE userDetails(
userid Number,
firstname VARCHAR(30),
lastname VARCHAR(30),
email VARCHAR(30),
gender VARCHAR(2),
mobile Number,
dob date,
add constraint pk_userid primary key(userid),
add constraint u_mobile unique(mobile),
add constraint nn_firstname not null(firstname),
add constraint nn_lastname not null(lastname),
add constraint u_email unique(email),
);

/* INSERT QUERY NO: 1 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
101, 'medasri', 'saikiran', 'ms@gmail.com', 'm', 7330844693, '3/12/99'
);

/* INSERT QUERY NO: 2 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
102, 'samanta', 'chauhan', 'sc@gmail.com', 'f', 8421014874, '3/12/99'
);

/* INSERT QUERY NO: 3 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
103, 'rachit', 'lalla', 'rl@gmail.com', 'm', 7030111718, '3/12/99'
);

/* INSERT QUERY NO: 4 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
104, 'sushma', 'sudam', 'ss@gmail.com', 'f', 9100652434, '3/12/99'
);

/* INSERT QUERY NO: 5 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
105, 'tony', 'stark', 'ts@gmail.com', 'm', 1331331331, '3/12/99'
);

/* INSERT QUERY NO: 6 */
INSERT INTO userDetails(userid, firstname, lastname, email, gender, mobile, dob)
VALUES
(
106, 'harvard', 'stark', 'hs@gmail.com', 'm', 2424242424, '3/12/99'
);


/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE userCredentials(
username VARCHAR(50),
password VARCHAR(50)
add constraint u_username unique(username)
);

/* INSERT QUERY NO: 1 */
INSERT INTO userCredentials(username, password)
VALUES
(
'medasrisaikiran', 'Saikiran987@'
);

/* INSERT QUERY NO: 2 */
INSERT INTO userCredentials(username, password)
VALUES
(
'samantachauhan', 'Samanta123@'
);

/* INSERT QUERY NO: 3 */
INSERT INTO userCredentials(username, password)
VALUES
(
'rachitlalla', 'Rachit123@'
);

/* INSERT QUERY NO: 4 */
INSERT INTO userCredentials(username, password)
VALUES
(
'sushmasudam', 'Sushma123@'
);

/* INSERT QUERY NO: 5 */
INSERT INTO userCredentials(username, password)
VALUES
(
'tonystark', 'Tony987@'
);

/* INSERT QUERY NO: 6 */
INSERT INTO userCredentials(username, password)
VALUES
(
'harvardstark', 'Harvard456@'
);



/* CREATE TABLE ADMIN CREDENTIALS*/

CREATE TABLE AdminDetails(
username VARCHAR(30),
password VARCHAR(30),
);

/* INSERT QUERY NO: 1 */
INSERT INTO AdminDetails(username, password)
VALUES
(
'admin', 'Airline123#'
);




ALTER SESSION SET  NLS_TIMESTAMP_FORMAT ='HH24:MI';



/* CREATE TABLE */
CREATE TABLE FlightDetails(
FlightId Number,
Source VARCHAR(20),
Destination VARCHAR(20),
Capacity Number,
Duration timestamp,
Departure_time timestamp,
Arrival_time timestamp,
Economy_class_price Number,
Business_class_price Number,
Available_seats Number,
Cabin VARCHAR(1)
add constraint pk_flightid primary key(FlightId),
add constraint nn_source not null(Source),
add constraint nn_destination not null(Destination),
add check check_capacity check(Capacity >0)
);

/* INSERT QUERY NO: 1 */
INSERT INTO FlightDetails
VALUES
(
10001, 'Hyderabad', 'Mumbai', 54, '4:00', '9:00','14:00', 12000, 20000, 54, 'y'
);

/* INSERT QUERY NO: 2 */
INSERT INTO FlightDetails
VALUES
(
10002, 'Hyderabad', 'Kolkata', 54,  '5:30','14:00','19:30', 16000, 30000, 54, 'n'
);

/* INSERT QUERY NO: 3 */
INSERT INTO FlightDetails
VALUES
(
10003, 'Hyderabad', 'Chennai', 54, '5:00', '17:00', '21:00', 10000, 18000, 54, 'n'
);

/* INSERT QUERY NO: 4 */
INSERT INTO FlightDetails
VALUES
(
10004, 'Hyderabad', 'Bengaluru', 54, '3:30', '10:00', '13:30', 14000, 26000, 54, 'y'
);

/* INSERT QUERY NO: 5 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10005, 'Hyderabad', 'Delhi', 54, '10:00', '11:30', '21:30', 20000, 36000, 54, 'n'
);

/* INSERT QUERY NO: 6 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10006, 'Mumbai', 'Hyderabad', 54, '5:00', '11:00', '16:00', 12000, 20000, 54, 'y'
);

/* INSERT QUERY NO: 7 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10007, 'Mumbai', 'Kolkata', 54, '5:30', '12:00', '17:30', 16000, 30000, 54, 'y'
);

/* INSERT QUERY NO: 8 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10008, 'Mumbai', 'Chennai', 54, '5:00', '13:00', '18:00', 12000, 20000, 54, 'n'
);

/* INSERT QUERY NO: 9 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10009, 'Mumbai', 'Bengaluru', 54, '4:00', '13:30', '17:30', 10000, 18000, 54, 'n'
);

/* INSERT QUERY NO: 10 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10010, 'Mumbai', 'Delhi', 54, '8:00', '8:00', '16:00', 18000, 32000, 54, 'y'
);

/* INSERT QUERY NO: 11 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10011, 'Kolkata', 'Mumbai', 54, '5:30', '11:30', '18:00', 16000, 30000, 54, 'n'
);

/* INSERT QUERY NO: 12 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10012, 'Kolkata', 'Hyderabad', 54, '5:30', '13:45', '19:15', 16000, 30000, 54, 'y'
);

/* INSERT QUERY NO: 13 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10013, 'Kolkata', 'Chennai', 54, '6:00', '14:00', '20:00', 18000, 32000, 54, 'y'
);

/* INSERT QUERY NO: 14 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10014, 'Kolkata', 'Bengaluru', 54, '6:00', '12:30', '18:30', 16000, 30000, 54, 'n'
);

/* INSERT QUERY NO: 15 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10015, 'Kolkata', 'Delhi', 54, '5:30', '16:00', '21:30', 12000, 20000, 54, 'n'
);

/* INSERT QUERY NO: 16 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10016, 'Chennai', 'Hyderabad', 54, '5:00', '9:00', '14:00', 10000, 18000, 54, 'y'
);

/* INSERT QUERY NO: 17 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10017, 'Chennai', 'Mumbai', 54, '5:00', '13:15', '18:15', 14000, 26000, 54, 'n'
);

/* INSERT QUERY NO: 18 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10018, 'Chennai', 'Kolkata', 54, '6:00', '17:00', '23:00', 12000, 20000, 54, 'y'
);

/* INSERT QUERY NO: 19 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10019, 'Chennai', 'Bengaluru', 54, '5:00', '15:45', '20:45', 10000, 18000, 54, 'y'
);

/* INSERT QUERY NO: 20 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10020, 'Chennai', 'Delhi', 54, '10:00', '13:00', '23:00', 20000, 36000, 54, 'n'
);

/* INSERT QUERY NO: 21 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10021, 'Bengaluru', 'Hyderabad', 54, '5:00', '11:45', '16:45', 14000, 26000, 54, 'n'
);

/* INSERT QUERY NO: 22 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10022, 'Bengaluru', 'Mumbai', 54, '4:00', '12:00', '16:00', 10000, 18000, 54, 'y'
);

/* INSERT QUERY NO: 23 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10023, 'Bengaluru', 'Kolkata', 54, '6:00', '13:30', '19:30', 16000, 30000, 54, 'n'
);

/* INSERT QUERY NO: 24 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10024, 'Bengaluru', 'Chennai', 54, '5:00', '17:15', '22:15', 10000, 18000, 54, 'y'
);

/* INSERT QUERY NO: 25 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUESt
(
10025, 'Bengaluru', 'Delhi', 54, '8:00', '13:00', '21:00', 18000, 18000, 54, 'y'
);

/* INSERT QUERY NO: 26 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10026, 'Delhi', 'Hyderabad', 54, '10:00', '10:00', '20:00', 20000, 36000, 54, 'n'
);

/* INSERT QUERY NO: 27 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10027, 'Delhi', 'Mumbai', 54, '10:00', '11:15', '21:15', 18000, 32000, 54, 'n'
);

/* INSERT QUERY NO: 28 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10028, 'Delhi', 'Kolkata', 54, '5:30', '16:00', '21:15', 12000, 20000, 54, 'y'
);

/* INSERT QUERY NO: 29 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10029, 'Delhi', 'Chennai', 54, '10:00', '13:00', '23:00', 20000, 36000, 54, 'n'
);

/* INSERT QUERY NO: 30 */
INSERT INTO FlightDetails(FlightId, FromDate, To, Capacity, Duration, Departure_time, Arrival_time, Economy_class_price, Business_class_price, Available_seats, Cabin)
VALUES
(
10030, 'Delhi', 'Bengaluru', 54, '8:00', '14:00', '22:00', 18000, 32000, 54, 'y'
);




ALTER SESSION SET  NLS_TIMESTAMP_FORMAT = 'MM-DD-YY HH24:MI';

/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE Ticket(
TicketId Number,
seatNumber Number,
Price Number,
departure_date timestamp,
Return_date timestamp
add constraint pk_ticketid primary key(TicketId),
add check_seatnumber check(seatNumber between 1 and 54)
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
BookingId Number,
FlightId Number,
userid Number,
ticketid Number,
bookingtime timestamp,
status VARCHAR(50),
add constraint pk_bookingid primary key(BookingId),
add constraint fk_flightid foreign key(FlightId) references FlightDetails(FlightId),
add constraint fk_userid foreign key(userid) references UserDetails(userid),
add constraint fk_ticketid foreign key(ticketId) references Ticket(ticketid),
);

/* INSERT QUERY NO: 1 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status)
VALUES
(
109, 10001, 101, 103, '1/14/21 12:00', 'active'
);

/* INSERT QUERY NO: 2 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status)
VALUES
(
110, 10001, 101, 104, '12/11/20 9:30', 'cancelled'
);

/* INSERT QUERY NO: 3 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status)
VALUES
(
111, 10010, 103, 105, '1/13/21 12:00', 'completed'
);

/* INSERT QUERY NO: 4 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status)
VALUES
(
112, 10005, 104, 106, '1/14/21 21:00', 'active'
);

/* INSERT QUERY NO: 5 */
INSERT INTO bookingDetails(BookingId, FlightId, userid, ticketid, bookingtime, status)
VALUES
(
113, 10005, 104, 107, '1/14/21 17:00', 'completed'
);


/* Showing results for Booknew.xlsx */

/* CREATE TABLE */
CREATE TABLE FlightAvailability(
flightid Number,
Monday VARCHAR(2),
Tuesday VARCHAR(2),
Wednesday VARCHAR(2),
Thursday VARCHAR(2),
Friday VARCHAR(2),
Saturday VARCHAR(2),
Sunday VARCHAR(2)
add constraint fk_flightid foreign key(flightid) references FlightDetails(FlightId)
);

/* INSERT QUERY NO: 1 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10001, 'y', 'n', 'y', 'n', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 2 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10002, 'n', 'y', 'y', 'y', 'y', 'y', 'n'
);

/* INSERT QUERY NO: 3 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10003, 'y', 'y', 'y', 'n', 'n', 'y', 'y'
);

/* INSERT QUERY NO: 4 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10004, 'y', 'n', 'n', 'n', 'y', 'y', 'y'
);

/* INSERT QUERY NO: 5 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10005, 'n', 'n', 'n', 'n', 'y', 'y', 'n'
);

/* INSERT QUERY NO: 6 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10006, 'n', 'n', 'n', 'y', 'n', 'n', 'y'
);

/* INSERT QUERY NO: 7 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10007, 'n', 'y', 'y', 'y', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 8 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10008, 'y', 'y', 'y', 'y', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 9 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10009, 'n', 'y', 'y', 'n', 'n', 'n', 'n'
);

/* INSERT QUERY NO: 10 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10010, 'y', 'n', 'n', 'n', 'y', 'y', 'y'
);

/* INSERT QUERY NO: 11 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10011, 'y', 'n', 'n', 'y', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 12 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10012, 'y', 'y', 'y', 'n', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 13 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10013, 'n', 'y', 'y', 'n', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 14 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10014, 'y', 'n', 'y', 'y', 'y', 'y', 'y'
);

/* INSERT QUERY NO: 15 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10015, 'n', 'y', 'n', 'y', 'n', 'n', 'y'
);

/* INSERT QUERY NO: 16 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10016, 'y', 'y', 'y', 'y', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 17 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10017, 'n', 'y', 'n', 'y', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 18 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10018, 'n', 'y', 'n', 'n', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 19 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10019, 'n', 'n', 'n', 'n', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 20 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10020, 'y', 'y', 'y', 'y', 'n', 'n', 'n'
);

/* INSERT QUERY NO: 21 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10021, 'y', 'y', 'n', 'y', 'y', 'n', 'y'
);

/* INSERT QUERY NO: 22 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10022, 'n', 'y', 'y', 'n', 'y', 'y', 'y'
);

/* INSERT QUERY NO: 23 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10023, 'n', 'n', 'y', 'y', 'n', 'y', 'n'
);

/* INSERT QUERY NO: 24 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10024, 'y', 'n', 'n', 'n', 'y', 'y', 'n'
);

/* INSERT QUERY NO: 25 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10025, 'y', 'n', 'y', 'y', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 26 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10026, 'y', 'n', 'n', 'n', 'y', 'n', 'n'
);

/* INSERT QUERY NO: 27 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10027, 'n', 'y', 'n', 'n', 'n', 'y', 'y'
);

/* INSERT QUERY NO: 28 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10028, 'n', 'n', 'y', 'n', 'y', 'n', 'y'
);

/* INSERT QUERY NO: 29 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10029, 'y', 'y', 'y', 'y', 'y', 'y', 'y'
);

/* INSERT QUERY NO: 30 */
INSERT INTO FlightAvailability(flightid, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)
VALUES
(
10030, 'y', 'n', 'n', 'y', 'y', 'n', 'y'
);


