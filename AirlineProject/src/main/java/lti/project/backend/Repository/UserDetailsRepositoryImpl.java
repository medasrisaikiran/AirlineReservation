package lti.project.backend.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.Exceptions.UserDetailsAlreadyPresentException;
import lti.project.backend.Exceptions.UserDetailsException;
import lti.project.backend.Exceptions.UserDetailsNotFoundException;
import lti.project.backend.Exceptions.UsersDetailsDeleteException;
import lti.project.backend.Pojos.Userdetails;

@Repository
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Userdetails> getUsers() throws UserDetailsException{
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery(" from Userdetails");
		@SuppressWarnings("unchecked")
		List<Userdetails> userslist = query.getResultList();
		return userslist;
	}

	@Override
	@Transactional
	public Userdetails getUserbyId(int id) throws UserDetailsException{
		// TODO Auto-generated method stub
		Userdetails u=entityManager.find(Userdetails.class,id);
		return u;
	    
	    //return list;	
	}@Override
    @Transactional
    public List<Userdetails> getUserbyEmail(String mail) throws UserDetailsException{
		String queryString = "select u from Userdetails u where u.email=:emailid";
        @SuppressWarnings("unchecked")
        List<Userdetails> ul = entityManager.createQuery(queryString)
                .setParameter("emailid", mail)
                .getResultList();
        if(ul==null) {throw new UserDetailsNotFoundException();}
        return ul;
        }
	
	@Override
	@Transactional
	public void addUsers(Userdetails u) throws UserDetailsException{
		
			entityManager.persist(u);
	}

	@Override
	@Transactional
	public void updateUsers(Userdetails u) throws UserDetailsException{
		// TODO Auto-generated method stub
		if(getUserbyEmail(u.getEmail())==null)
			throw new UserDetailsNotFoundException();
		entityManager.merge(u);
		
	}

	@Override
	@Transactional
	public void deleteUsers(int id) throws UserDetailsException{
		// TODO Auto-generated method stub
		
		Userdetails u=entityManager.getReference(Userdetails.class, id);
		
		if(u==null)
		{
			throw new UserDetailsNotFoundException();
		}
		try {
		entityManager.remove(u);
		}
		catch(Exception e)
		{
			throw new UsersDetailsDeleteException();
		}
	}

	
	@Override
	public Userdetails getUserbyEmailIdAndPassword(String emailid, String password)
			throws UserDetailsException {
		System.out.println(emailid+" "+password);
		Userdetails userDetails=(Userdetails) entityManager.createQuery("select u from Userdetails u where u.email=:emailid and u.password=:password").setParameter("password",password).setParameter("emailid", emailid).getResultList().get(0);
		if(userDetails==null)//casting to userdetails
		{
			throw new UserDetailsNotFoundException();
		}
		return userDetails;
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Userdetails> getUsersSortedByEmail() throws UserDetailsException {
		return entityManager.createQuery("select u from UserDetails u order by emailId").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Userdetails> getUserDetailsSortedById() throws UserDetailsException {
		return entityManager.createQuery("select u from UserDetails u order by id").getResultList();
	}
	

}
