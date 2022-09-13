package user.dto;//data transfer Object

import javax.persistence.Entity;
import javax.persistence.Id;
//To make the class becomes Entity class after using Entity Annotation
@Entity
public class User 
{
	@Id
	private int id;//Because of Annotation the id became primary key
	private String name;
	private long phone;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
