package user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import user.dto.User;

public class UserDao//Deta access object layer 
{
	//create entity manager factory
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	//create entity manager
	EntityManager manager = factory.createEntityManager();
	//create entity transaction
	EntityTransaction transaction = manager.getTransaction();
	
	//method to insert object into database
	public void insertValue(User user)
	{
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}
	
	//method to fetch object based on primary key
	public User getUserById(int id)
	{
		User u = manager.find(User.class, id);
		return u;
		
	}
	//mehod to delete object based on primary key
	public void deleteUser(int id)
	{
		User u = manager.find(User.class, id);
		if(u != null)
		{
			transaction.begin();
			manager.remove(u);
			transaction.commit();
		}
		else
		{
			System.out.println("Id not found........");
		}
	}
	//method to update object based on id
	public void updateUser(int id)
	{
		User u = manager.find(User.class, id);
		if( u != null)
		{
			u.setName("Pintu");
			transaction.begin();
			manager.merge(u);
			transaction.commit();
		}
		else
		{
			System.out.println("Id not found");
		}
		
	}
	//method to fetch all objects from deta base for the we will use Hibernate query language(hql)
	public List<User> getAllUsers()
	{

		Query q=manager.createQuery("select u from User u");
		List<User> users = q.getResultList();
		return users;
	}
	
	
}
