package lti.project.backend.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lti.project.backend.Pojos.Userdetails;

@Repository
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Userdetails> getUsers() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery(" from Userdetails");
		@SuppressWarnings("unchecked")
		List<Userdetails> userslist = query.getResultList();
		return userslist;
	}

	@Override
	@Transactional
	public List<Userdetails> getUserbyId(int id) {
		// TODO Auto-generated method stub
		String queryString = "select u from Userdetails u where u.userid ="+id;
	    @SuppressWarnings("unchecked")
		List<Userdetails> list = entityManager.createQuery(queryString).getResultList();
	    return list;	
	}
 
	@Override
	@Transactional
	public List<Userdetails> getUserbyEmail(String mail) {
		// TODO Auto-generated method stub
		String queryString = "select u from Userdetails u where u.email=:emailid";
	    @SuppressWarnings("unchecked")
		List<Userdetails> list = entityManager.createQuery(queryString)
	    		.setParameter("emailid", mail)
	    		.getResultList();
	    return list;
	}

	@Override
	@Transactional
	public void addUsers(Userdetails u) {
		// TODO Auto-generated method stub
		entityManager.persist(u);
	}

	@Override
	@Transactional
	public void updateUsers(Userdetails u) {
		// TODO Auto-generated method stub
		entityManager.merge(u);
		
	}

	@Override
	@Transactional
	public void deleteUsers(int id) {
		// TODO Auto-generated method stub
		Userdetails u=entityManager.getReference(Userdetails.class, id);
		entityManager.remove(u);
		
	}
	
	

}
