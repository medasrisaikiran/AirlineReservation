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

import lti.project.backend.Exceptions.UserDetailsException;
import lti.project.backend.dto.UsersByEmailIdAndPasswordDto;
import lti.project.backend.Pojos.Userdetails;
import lti.project.backend.Services.UserDetailsService;

@RestController
@CrossOrigin
public class UserDetailsController {
	
	@Autowired
	UserDetailsService UserService; //controller is talking to service

	@GetMapping(path="/getAllUsers")
	public List<Userdetails> getAllUsers() throws UserDetailsException  {
		return UserService.getUsersService();
	}

	@GetMapping(path="/getUsersById/{Id}")
	public Userdetails getUsers(@PathVariable("Id") int id) throws UserDetailsException {
		return UserService.getUserbyIdService(id);
	}
	@PostMapping(path="/getUsersByEmailIdAndPassword")
	public Userdetails getUserByEmailIdAndPassword(@RequestBody UsersByEmailIdAndPasswordDto udto) throws UserDetailsException{
		return UserService.getUserbyEmailIdAndPasswordService(udto.getEmailId(),udto.getPassword());
	}
	@GetMapping(path="/getUsersByEmail/{id}")
	public List<Userdetails> getUserByEmail(@PathVariable("id") String udto) throws UserDetailsException{
		return UserService.getUserbyEmailService(udto);
	}
	@PostMapping(path="/addUser")
	public void addUsers(@RequestBody Userdetails f) throws UserDetailsException {
		UserService.addUsersService(f);
	}
	@DeleteMapping(path="/deleteUser/{id}")
	public void deleteUsers(@PathVariable("id") int id) throws UserDetailsException {
		UserService.deleteUsersService(id);
	}
	@PutMapping(path="/updateUser")
	public void updateUser(@RequestBody Userdetails f) throws UserDetailsException {
		UserService.updateUsersService(f);
	}
	@GetMapping(path="/sortUsersByEmail")
	public List<Userdetails> sortUsersBySource() throws UserDetailsException {
		return UserService.sortUsersByEmailService();
	}
	
	@GetMapping(path="/sortUsersById")
	public List<Userdetails> sortUsersById() throws UserDetailsException {
		return UserService.sortUsersByIdService();
	}
}
