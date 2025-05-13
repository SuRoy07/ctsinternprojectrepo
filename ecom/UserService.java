package com.ecp.service;
import java.util.ArrayList;
import java.util.List;

import com.ecp.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private ArrayList<User> userList=new ArrayList<User>();

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public UserService() {
		User obj1=new User("U201","sathya","haridhas","sathya@gmail.com");
		User obj2=new User("U202","rose","john","rose@gmail.com");
		User obj3=new User("U203","laya","vishal","laya@gmail.com");
		User obj4=new User("U204","adit","jagan","adit@gmail.com");
		User obj5=new User("U205","harshi","dhana","harshi@gmail.com");
		User obj6=new User("U206","jack","rose","jack@gmail.com");
		User obj7=new User("U207","priya","vish","priya@gmail.com");
		
		userList.add(obj1);
		userList.add(obj2);
		userList.add(obj3);
		userList.add(obj4);
		userList.add(obj5);
		userList.add(obj6);
		userList.add(obj7);
	}
	
	public boolean add(User userObj)
	{
        return userList.add(userObj);	
	    
	}
	public List<User> viewAll()
	{
		return userList;
	}

}
