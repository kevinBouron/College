package org.collegeServeur.dao;

import java.util.List;

import org.collegeServeur.entities.Role;
import org.collegeServeur.entities.User;

public interface IDAOAdmin {
	
	public void add(User u);
	public void delete(User u);
	public void update (User u);
	public List<User> show();
	public User getById(long id);
	
	public void addR(Role r);
	public void deleteR(Role r);
	public void updateR (Role r);
	public List<Role> showR();
	public Role getByIdR(long id);

}
