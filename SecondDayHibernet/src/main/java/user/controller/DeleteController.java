package user.controller;

import user.dao.UserDao;

public class DeleteController 
{
	public static void main(String[] args) 
	{
		UserDao dao = new UserDao();
		 dao.deleteUser(2);
	}
}
