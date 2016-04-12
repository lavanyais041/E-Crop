package org.ndt.ecrop.service;

import java.util.List;

import org.ndt.ecrop.db.UserDAO;
import org.ndt.ecrop.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService
{
    @Autowired 
	private UserDAO userLoginDAO;	
    
    public boolean userLogin(String userName,String password)
	{
		
		return userLoginDAO.userLogin(userName,password);
		
	}

	public User1 getuser(String usrname)
	{
		return userLoginDAO.getuserByname(usrname);
		
	}
	
	
}
