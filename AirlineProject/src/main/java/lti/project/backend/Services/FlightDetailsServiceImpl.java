package lti.project.backend.Services;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.project.backend.Exceptions.EmptyFlightDetailsException;
import lti.project.backend.Exceptions.FlightDetailsNotFoundException;
import lti.project.backend.Exceptions.FlightDetailsUpdateException;
import lti.project.backend.Pojos.Bookingdetails;
import lti.project.backend.Pojos.Flightdetails;
import lti.project.backend.Repository.FlightDetailsRepository;

@Service
public class FlightDetailsServiceImpl implements FlightDetailsService
{
	@Autowired
	FlightDetailsRepository fd;

	@Override
	public List<Flightdetails> getAllFlightsService() {
		List<Flightdetails> l=fd.getAllFlights();
		try {
			if(l==null)
				throw new EmptyFlightDetailsException("no flights");	
		}
		catch(EmptyFlightDetailsException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public Flightdetails getFlightByIdService(int id) {
		Flightdetails l=fd.getFlightById(id);
		try {
			if(l==null)
				throw new FlightDetailsNotFoundException("no flights");	
		}
		catch(FlightDetailsNotFoundException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public List<Flightdetails> getFlightsBySrcAndDestService(String src, String dest) {
		List<Flightdetails> l=fd.getFlightsBySrcAndDest(src, dest);
		try {
			if(l==null)
				throw new FlightDetailsNotFoundException("no flights");	
		}
		catch(FlightDetailsNotFoundException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public void addFlightService(Flightdetails f) {
		try {
			fd.addFlight(f);	
		}	
		catch(Exception e) {
			System.out.println("error in adding flightdetails"+e);
		}
	}

	@Override
	public void deleteFlightService(int n) {
		try 
		{
			fd.deleteFlight(n);
		}
		catch(Exception e)
		{
			try {
				throw new FlightDetailsNotFoundException("flight not found");
			}
			catch(FlightDetailsNotFoundException fe)
			{
				System.out.println("error"+e);	
			};
		}		
	}
	
	@Override
	public void updateFlightService(Flightdetails f) {
		try 
		{
			fd.updateFlight(f);
		}
		catch(Exception e)
		{
			try {
				throw new FlightDetailsUpdateException("invalid flight details");
			}
			catch(FlightDetailsUpdateException fe) 
			{
			System.out.println("error");
			}
		}
	}

	@Override
	public List<Flightdetails> sortFlightsBySourceService() {
		List<Flightdetails> l=fd.sortFlightsBySource();
		try {
			if(l==null)
				throw new EmptyFlightDetailsException("no flights");	
		}
		catch(EmptyFlightDetailsException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public List<Flightdetails> sortFlightsByDestinationService() {
		List<Flightdetails> l=fd.sortFlightsByDestination();
		try {
			if(l==null)
				throw new EmptyFlightDetailsException("no flights");	
		}
		catch(EmptyFlightDetailsException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public List<Flightdetails> sortFlightsByIdService() {
		List<Flightdetails> l=fd.sortFlightsById();
		try {
			if(l==null)
				throw new EmptyFlightDetailsException("no flights");	
		}
		catch(EmptyFlightDetailsException e)
		{
			System.out.println("no flights");
		}
		return l;
	}

	@Override
	public List<Bookingdetails> getFlightsBySrcAndDestAndDateService(String src, String dest, Date t) {
		List<Bookingdetails> l=fd.getFlightsBySrcAndDestAndDate(src, dest,t);
		try {
			if(l==null)
				throw new FlightDetailsNotFoundException("no flights");	
		}
		catch(FlightDetailsNotFoundException e)
		{
			System.out.println("no flights");
		}
		return l;
	}
}
