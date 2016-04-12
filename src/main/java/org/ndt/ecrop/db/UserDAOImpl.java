package org.ndt.ecrop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ndt.ecrop.model.User;
import org.ndt.ecrop.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private DBConnectionManager dBManager;

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean userLogin(String userName, String password) 
	{
		String query = "select * from user1 where userName=? and password=?";
		 Connection conn=dBManager.getConnection();
		 PreparedStatement ps;
		 
		 try 
		 {
			ps = conn.prepareStatement(query);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs!=null && rs.next())
			{
				conn.close();
				return true;
			}
			else
			{
				return false;
			}
			
		} 
		 catch (SQLException e)
		 {
			
			e.printStackTrace();
			return false;
		}
			}

	@Override
	public User1 getuserByname(String username) {
		// TODO Auto-generated method stub
		
		String query = "select * from user1 where userName=?";
		 Connection conn=dBManager.getConnection();
		 PreparedStatement ps;
		 String usrname;
		 String paswd;
		 String rol;
		 User1 u=null;
		 
		 try {
			 
			ps =conn.prepareStatement(query);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			while(rs!= null && rs.next())
			{
				usrname=rs.getString(1);
				paswd=rs.getString(2);
				rol=rs.getString(3);
				u=new User1(usrname, paswd, rol);
				//System.out.println(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(u);
		tx.commit();
		session.close();
		
	}

	
}
