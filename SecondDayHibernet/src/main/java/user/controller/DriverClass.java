package user.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import user.dao.UserDao;
import user.dto.User;

public class DriverClass 
{
	public static void main(String[] args) 
	{
		User u = new User();
		u.setId(2);
		u.setName("dingi");
		u.setPhone(123456789);
		u.setEmail("dingi@gmail.com");
		
		UserDao dao = new UserDao();
		dao.insertValue(u);
		
		
	}
}
