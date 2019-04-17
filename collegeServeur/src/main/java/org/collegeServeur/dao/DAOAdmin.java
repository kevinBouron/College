package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Role;
import org.collegeServeur.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoAdmin")
public class DAOAdmin implements IDAOAdmin{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void add(User u) {
		sessionFactory.getCurrentSession().merge(u);
		
	}

	public void delete(User u) {
		sessionFactory.getCurrentSession().delete(u);
		
	}

	public void update(User u) {
		sessionFactory.getCurrentSession().update(u);
		
	}

	public List<User> show() {
		
		return sessionFactory.getCurrentSession().createQuery("from User u").list();
	}

	public User getById(long id) {
		
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void addR(Role r) {
		sessionFactory.getCurrentSession().merge(r);
		
	}

	public void deleteR(Role r) {
		sessionFactory.getCurrentSession().delete(r);
		
	}

	public void updateR(Role r) {
		sessionFactory.getCurrentSession().update(r);
		
	}

	public List<Role> showR() {
		
		return sessionFactory.getCurrentSession().createQuery("from Role r").list();
	}

	public Role getByIdR(long id) {
		
		return (Role) sessionFactory.getCurrentSession().get(Role.class, id);
	}

}
