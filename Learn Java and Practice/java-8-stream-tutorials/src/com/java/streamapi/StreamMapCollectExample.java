package com.java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		List<User> arrausers=new ArrayList<>();
		arrausers.add(new User("Manideep","Secret","saimanideep159@gmail.com",1));
		arrausers.add(new User("bokka","Secret","bokka@gmail.com",2));
		arrausers.add(new User("Chandra","Secret","chandra159@gmail.com",3));
		arrausers.add(new User("Vamsi","Secret","vamsi159@gmail.com",4));
		
		List<UserDTO> newarrusers=new ArrayList<>();
		for(User a:arrausers)
		{
			newarrusers.add(new UserDTO(a.getUsername(),a.getEmail(),a.getId()));	
		}
		for(UserDTO a:newarrusers)
		{
			System.out.println(a.getId()+"  "+a.getUsername()+"  "+a.getEmail());
		}
		arrausers.stream().map((User t)->new UserDTO(t.getUsername(),t.getEmail(),t.getId()))
		.forEach((userdto)->System.out.println(userdto));
	}
}
class UserDTO
{
	private String username;
	private String email;
	private int id;
	
	public UserDTO(String username, String email, int id) {
		this.username = username;
		this.email = email;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", email=" + email + ", id=" + id + "]";
	}
	
}
class User
{
	private String username;
	private String password;
	private String email;
	private int id;
	
	public User(String username, String password, String email, int id) {

		this.username = username;
		this.password = password;
		this.email = email;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", id=" + id + "]";
	}
	
}