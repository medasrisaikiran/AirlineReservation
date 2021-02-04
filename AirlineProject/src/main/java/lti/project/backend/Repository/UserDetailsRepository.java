package lti.project.backend.Repository;

import java.util.ArrayList;
import java.util.List;

import lti.project.backend.Pojos.Userdetails;

public interface UserDetailsRepository {
	
	List<Userdetails> getUsers();
	List<Userdetails> getUserbyId(int id);
	List<Userdetails> getUserbyEmail(String mail);
	void addUsers(Userdetails u);
	void updateUsers(Userdetails u);
	void deleteUsers(int id);

}
