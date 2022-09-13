package user.controller;

import user.dao.UserDao;
import user.dto.User;

public class FindController 
{
	public static void main(String[] args) 
	{ 
		UserDao dao = new UserDao();
		User u = dao.getUserById(1);
		if( u != null)
		{
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getEmail());
			System.out.println(u.getPhone());
		}
		else
			System.out.println("id not found....");
	}
}
