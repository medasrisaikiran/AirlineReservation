package lti.project.backend;

import java.sql.Timestamp;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lti.project.backend.layer2.Flightdetails;
import lti.project.backend.layer2.Userdetails;
import lti.project.backend.layer3.FlightDetailsRepositoryImpl;
import lti.project.backend.layer3.UserDetailsRepositoryImpl;

@SpringBootTest
class AirlineProjectApplicationTests {

	@Autowired
	EntityManager entityManager;
	@Autowired
	FlightDetailsRepositoryImpl fd;
	@Autowired
	UserDetailsRepositoryImpl ud;
	
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
		fd.deleteFlight(63);
	}
	@Test																										//3	
	void updateRowFromFlightDetails() 
	{
		Flightdetails f=new Flightdetails();
		f.setFlightid(63);
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
		fd.getFlightById(10001);
	}
	@Test																											//6
	void getFlightDetailsBySrcAndDest() 
	{
		fd.getFlightsBySrcAndDest("Kolkata","Delhi");
	}
	@Test																											//7
	void addRowIntoUserDetails() {
		Userdetails u=new Userdetails();
		u.setFirstname("rahul");
		u.setLastname("Dravid");
		u.setEmail("rd@gmail.com");
		u.setDob(new java.util.Date(999999999));
		u.setMobile("7330844694");
		u.setGender("m");
		u.setPassword("Rdravid@123");
		ud.addUser(u);
	}
}
