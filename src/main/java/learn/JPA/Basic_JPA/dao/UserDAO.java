package learn.JPA.Basic_JPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import learn.JPA.Basic_JPA.model.User;


@Repository("Bean2")
public class UserDAO {

	@PersistenceContext
    private EntityManager entityManager;
	
    @Transactional
	public long insert(User user) {
		System.out.println(user);
		entityManager.persist(user);
		return user.getId();
	}
    public User insertWithoutTransaction(User user) {
        entityManager.persist(user);
        return user;
    }
    
    public User find(long id) {
        return entityManager.find(User.class, id);
    }
}
