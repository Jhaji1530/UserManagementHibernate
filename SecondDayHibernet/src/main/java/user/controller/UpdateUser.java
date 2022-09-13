package user.controller;

import user.dao.UserDao;

public class UpdateUser 
{
	public static void main(String[] args) 
	{
		UserDao u = new UserDao();//dao means data access object and dto- data transfer object.
		u.updateUser(1);
	}
}
