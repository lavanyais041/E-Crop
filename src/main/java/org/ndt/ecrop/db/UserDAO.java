package org.ndt.ecrop.db;

import java.util.List;

import org.ndt.ecrop.model.User;
import org.ndt.ecrop.model.User1;

public interface UserDAO 
{
	public boolean userLogin(String userName,String password);	
	
	public void create(User u);
	public User1 getuserByname(String username);
	
}
