package user.controller;

import java.util.List;

import user.dao.UserDao;
import user.dto.User;

public class FetchAllController 

{
	public static void main(String[] args) 
	{
		UserDao dao = new UserDao();
		List<User> user = dao.getAllUsers();
		
		for(User u : user)
		{
			System.out.println("Id:"+u.getId()+"\tName:"+u.getName()+"\tEmail:"+u.getEmail());
		}
	}
}
