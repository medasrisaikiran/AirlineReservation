package lti.project.backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lti.project.backend.Exceptions.UserDetailsException;
import lti.project.backend.Pojos.Userdetails;
import lti.project.backend.Repository.UserDetailsRepositoryImpl;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepositoryImpl userDetailsRepository;
	
	

	@Override
	@Transactional
	public List<Userdetails> getUsersService() throws UserDetailsException{
		
		List<Userdetails> userDetails;
		
		
		 userDetails=userDetailsRepository.getUsers(); 
		 
		
		
		return userDetails;
	}

	@Override
	public Userdetails getUserbyEmailIdAndPasswordService(String emailid, String password)
			throws UserDetailsException {
		
		return userDetailsRepository.getUserbyEmailIdAndPassword(emailid, password);

		
	}

	
	@Override
	@Transactional
	public List<Userdetails> getUserbyIdService(int id) throws UserDetailsException{
		
		List<Userdetails> list = userDetailsRepository.getUserbyId(id);
	    return list;	
	}
 
	@Override
	@Transactional
	public List<Userdetails> getUserbyEmailService(String mail) throws UserDetailsException{
		List<Userdetails> list = userDetailsRepository.getUserbyEmail(mail);
	    return list;
	}

	@Override
	@Transactional
	public void addUsersService(Userdetails u) throws UserDetailsException{
		// TODO Auto-generated method stub
		userDetailsRepository.addUsers(u);
	}

	@Override
	@Transactional
	public void updateUsersService(Userdetails u) throws UserDetailsException{
		userDetailsRepository.updateUsers(u);
	}

	@Override
	@Transactional
	public void deleteUsersService(int id) throws UserDetailsException{
		userDetailsRepository.deleteUsers(id);
	}

	@Override
	public List<Userdetails> sortUsersByEmailService() throws UserDetailsException {
		
		return userDetailsRepository.getUsersSortedByEmail();
	}

	@Override
	public List<Userdetails> sortUsersByIdService() throws UserDetailsException {
		return userDetailsRepository.getUserDetailsSortedById();
	}
	
	

}