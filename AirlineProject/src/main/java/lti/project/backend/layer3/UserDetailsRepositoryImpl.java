package lti.project.backend.layer3;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lti.project.backend.layer2.Userdetails;
@Repository
public class UserDetailsRepositoryImpl {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public void addUser(Userdetails u) {
		// TODO Auto-generated method stub
		entityManager.persist(u);
	}

}
