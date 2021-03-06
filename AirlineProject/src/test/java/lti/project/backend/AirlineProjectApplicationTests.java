package lti.project.backend;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.ParseException;

import lti.project.backend.Pojos.*;
import lti.project.backend.Repository.*;
import lti.project.backend.Exceptions.UserDetailsException;

@SpringBootTest
class AirlineProjectApplicationTests {

	@Autowired
	EntityManager entityManager;
	@Autowired
	FlightDetailsRepositoryImpl fd;
	@Autowired
	UserDetailsRepositoryImpl ud;
	@Autowired
	BookingDetailsRepositoryImpl bd;
	@Autowired
	TicketRepositoryImpl td;
	
	@Test																									//1
	void addRowIntoFlightDetails() {
		Flightdetails f=new Flightdetails();
		f.setSource("Bengaluru");
		f.setDestination("Kolkata");
		String as="2021-02-01 12:00:00";
		Timestamp ArrivalTime =Timestamp.valueOf(as);
		f.setArrivalTime(ArrivalTime);
		as="2021-02-01 12:00:00";
		Timestamp DepartureTime =Timestamp.valueOf(as);
		f.setDepartureTime(DepartureTime);
		as="2021-02-01 12:00:00";
		Timestamp Duration =Timestamp.valueOf(as);
		f.setDuration(Duration);
		f.setCapacity(54);
		f.setBusinessClassPrice(30000);
		f.setEconomyClassPrice(20000);
		f.setCabin("y");
		fd.addFlight(f);
	}
	@Test																										//2
	void deleteRowFromFlightDetails() 
	{
		fd.deleteFlight(1);
	}
	@Test																										//3	
	void updateRowFromFlightDetails() 
	{
		Flightdetails f=new Flightdetails();
		f.setFlightid(4);
		f.setSource("Bengaluru");
		f.setDestination("Kolkata");
		String as="2021-02-01 12:00:00";
		Timestamp DepartureTime =Timestamp.valueOf(as);
		f.setDepartureTime(DepartureTime);
		as="2021-02-01 18:00:00";
		Timestamp ArrivalTime =Timestamp.valueOf(as);
		f.setArrivalTime(ArrivalTime);
		as="2021-02-01 06:00:00";
		Timestamp Duration =Timestamp.valueOf(as);
		f.setDuration(Duration);
		f.setCapacity(54);
		f.setBusinessClassPrice(30000);
		f.setEconomyClassPrice(20000);
		f.setCabin("y");
		fd.updateFlight(f);
	}
	@Test																											//4
	void getAllFlightDetails() 
	{
		fd.getAllFlights();
	}
	@Test																											//5
	void getFlightDetailsById() 
	{
		Flightdetails f=fd.getFlightById(10005);
		System.out.println(f.getSource()+" "+f.getDestination());
	}
	@Test																											//6
	void getFlightDetailsBySrcAndDest() 
	{
		fd.getFlightsBySrcAndDest("Kolkata","Delhi");
	}
	@Test
	void getFlightDetailsBySrcAndDestAndDate() throws ParseException
	{
		String s="09-02-2021";
		Date d=null;
		System.out.println("java.util.Date: "+d.toString());
		List<Bookingdetails> l=fd.getFlightsBySrcAndDestAndDate("Hyderabad","Delhi",d);
		for(Bookingdetails fdd:l)
		{
			System.out.println("from testcases");
			System.out.println(fdd.getBookingid()+"\t"+fdd.getDeparturedate()+"\t"+fdd.getFlightdetail().getFlightid());
		}
	}
	
	/*
	 * =============================================================================
	 * =========================
	 */	
	
	@Test																											//7
	void addRowIntoUserDetails() throws UserDetailsException {
		Userdetails u=new Userdetails();
		u.setFirstname("rahul");
		u.setLastname("Dravid");
		u.setEmail("rd@gmail.com");
		u.setDob(new java.util.Date(999999999));
		u.setMobile("7330844694");
		u.setGender("m");
		u.setPassword("Rdravid@123");
		ud.addUsers(u);
	}
	@Test																											//8
	void deleteRowFromUserDetails() throws UserDetailsException 
	{
		ud.deleteUsers(11);
	}
	@Test																											//9	
	void updateRowFromUserDetails() throws UserDetailsException 
	{
		Userdetails u=new Userdetails();
		u.setUserid(4);
		u.setFirstname("rahul");
		u.setLastname("Dravid");
		u.setEmail("r@gmail.com");
		u.setDob(new java.util.Date(999999999));
		u.setMobile("79311432");
		u.setGender("m");
		u.setPassword("Rdravid@123");
		ud.updateUsers(u);
	}
	@Test																											//10
	void getAllUserDetails() throws UserDetailsException 
	{
		ud.getUsers();
	}
	@Test																											//11
	void getUserDetailsById() throws UserDetailsException 
	{
		ud.getUserbyId(20);
	}
	@Test																											//12	
	void getUserDetailsByEmail() throws UserDetailsException 
	{
		ud.getUserbyEmail("ms@gmail.com");
	}
	
	/*
	 * =============================================================================
	 * =========================
	 */
	
	@Test																											//13
	void getAllTicket() 
	{
		td.getAllTicket();
	}
	@Test																											//14
	void getTicketById() 
	{
		td.getTicketById(105);
	}
	@Test																											//15
	void deleteRowFromTicket() 
	{
		td.deleteTicket(103);
	}
	@Test																											//16
	void addRowIntoTicket() {
		Ticket t=new Ticket();
		String as="2021-02-01 12:00:00";
		Timestamp departureDate =Timestamp.valueOf(as);
		t.setDepartureDate(departureDate);
		t.setPrice(12345);
		as="2021-02-01 12:00:00";
		Timestamp returnDate =Timestamp.valueOf(as);
		t.setReturnDate(returnDate);
		t.setSeatnumber(25);	
		td.addTicket(t);
	}
	@Test																											//17
	void updateRowIntoTicket() {
		Ticket t=new Ticket();
		t.setTicketid(66);
		String as="2021-02-01 12:00:00";
		Timestamp departureDate =Timestamp.valueOf(as);
		t.setDepartureDate(departureDate);
		t.setPrice(12345);
		as="2021-02-02 12:00:00";
		Timestamp returnDate =Timestamp.valueOf(as);
		t.setReturnDate(returnDate);
		t.setSeatnumber(25);	
		td.updateTicket(t);
	}
	
	/*
	 * =============================================================================
	 * =========================
	 */
	
	@Test
	void addRowIntoBookingDetails() {															//18
		Bookingdetails b=new Bookingdetails();
		Timestamp bookingtime=Timestamp.from(Instant.now());
		b.setBookingtime(bookingtime);
		b.setStatus("active");
//		String str="2021-02-03 11:30:00";
//		Timestamp departuretime=Timestamp.valueOf(str);
//		b.setDeparturedate(departuretime);
		bd.addBooking(b);
	}
	@Test																											//19
	void deleteRowFromBookingDetails() {
		bd.deleteBooking(109);
	}
	@Test																											//20
	void updateRowFromBookingDetails() {
		Bookingdetails b=new Bookingdetails();
		b.setBookingid(5);
		Timestamp bookingtime=Timestamp.from(Instant.now());
		b.setBookingtime(bookingtime);
		b.setStatus("active");
//		String str="2021-02-03 11:30:00";
//		Timestamp departuretime=Timestamp.valueOf(str);
//		b.setDeparturedate(departuretime);
		Flightdetails f=entityManager.find(Flightdetails.class,10001);
		Userdetails u=entityManager.find(Userdetails.class,106);
		Ticket t=entityManager.find(Ticket.class,7);
		b.setTicket(t);
		b.setFlightdetail(f);
		b.setUserdetail(u);
		bd.updateBooking(b);
	}
	@Test																											//21
	void getAllBookings() {
		bd.getAllBookings();
	}
	@Test																											//22
	void getBookingById() {
		bd.getBookingById(109);
	}
	@Test
	void getBookingsByFlightId() {
		bd.getBookingsbyFlightid(10005);
	}
}

