package org.collegeServeur.service;

import java.util.List;

import org.collegeServeur.dao.DAOAdmin;
import org.collegeServeur.entities.Role;
import org.collegeServeur.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceAdmin")
public class ServiceAdmin implements IServiceAdmin {

	@Autowired
	private DAOAdmin dao;
	
	public void add(User u) {
		dao.add(u);
		
	}

	public void delete(User u) {
		dao.delete(u);
		
	}

	public void update(User u) {
		dao.update(u);
		
	}

	public List<User> show() {
		
		return dao.show();
	}

	public User getById(long id) {
		
		return dao.getById(id);
	}

	public void addR(Role r) {
		dao.addR(r);
		
	}

	public void deleteR(Role r) {
		dao.deleteR(r);
		
	}

	public void updateR(Role r) {
		dao.updateR(r);
		
	}

	public List<Role> showR() {
		
		return dao.showR();
	}

	public Role getByIdR(long id) {
		
		return dao.getByIdR(id);
	}

}
