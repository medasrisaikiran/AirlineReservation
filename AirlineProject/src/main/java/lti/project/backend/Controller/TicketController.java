package lti.project.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import lti.project.backend.Pojos.Ticket;
import lti.project.backend.Services.TicketService;

@RestController
@CrossOrigin
public class TicketController 
{
	@Autowired
	TicketService ticketService;
	
	@GetMapping(path="/getAllTicket")
	public List<Ticket> getAllTicket() {
		return ticketService.getAllTicketService();
	}
	
	@GetMapping(path="/getTicketById/{tno}")
	public Ticket getTicket(@PathVariable("tno") int tno) {
		return ticketService.getTicketByIdService(tno);
	}
	
	@PostMapping(path="/addticket")
	public void addTicket(@RequestBody Ticket t) {
		ticketService.addTicketService(t);
	}
	@DeleteMapping(path="/deleteticket/{id}")
	public void deleteTicket(@PathVariable("id") int id) {
		ticketService.deleteTicketService(id);
	}
	@PutMapping(path="/updateticket")
	public void updateTicket(@RequestBody Ticket t) {
		ticketService.updateTicketService(t);
	}
	@GetMapping(path="/getTicketByUserId/{userid}")
	public List<Ticket> getTicketByUserId(@PathVariable("userid") int userid) {
		return ticketService.getTicketByUserId(userid);
	}

}
