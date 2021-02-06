package lti.project.backend.Repository;
import java.util.List;

import lti.project.backend.Exceptions.UserDetailsException;
import lti.project.backend.Pojos.Userdetails;
public interface UserDetailsRepository 
{
	List<Userdetails> getUsers() throws UserDetailsException;
	Userdetails getUserbyId(int id) throws UserDetailsException;
	List<Userdetails> getUserbyEmail(String mail) throws UserDetailsException;
	void addUsers(Userdetails u) throws UserDetailsException;
	void updateUsers(Userdetails u) throws UserDetailsException;
	void deleteUsers(int id) throws UserDetailsException;
	Userdetails getUserbyEmailIdAndPassword(String emailid, String password) throws UserDetailsException;
	List<Userdetails> getUsersSortedByEmail() throws UserDetailsException;
	List<Userdetails> getUserDetailsSortedById() throws UserDetailsException;
}
