package lti.project.backend.Services;

import java.util.List;


import lti.project.backend.Exceptions.UserDetailsException;
import lti.project.backend.Pojos.Userdetails;
public interface UserDetailsService {
	
	List<Userdetails> getUsersService() throws UserDetailsException;
	List<Userdetails> getUserbyIdService(int id) throws UserDetailsException;
	List<Userdetails> getUserbyEmailService(String mail) throws UserDetailsException;
	void addUsersService(Userdetails u) throws UserDetailsException;
	void updateUsersService(Userdetails u) throws UserDetailsException;
	void deleteUsersService(int id) throws UserDetailsException;
	Userdetails getUserbyEmailIdAndPasswordService(String emailid, String password) throws UserDetailsException;
	List<Userdetails> sortUsersByEmailService() throws UserDetailsException;
	List<Userdetails> sortUsersByIdService() throws UserDetailsException;


}
