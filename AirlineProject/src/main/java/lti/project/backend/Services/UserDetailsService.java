package lti.project.backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lti.project.backend.Pojos.Userdetails;
@Service
public interface UserDetailsService {
	
	List<Userdetails> getUsers();
	List<Userdetails> getUserbyId(int id);
	List<Userdetails> getUserbyEmail(String mail);
	void addUsers(Userdetails u);
	void updateUsers(Userdetails u);
	void deleteUsers(int id);

}
