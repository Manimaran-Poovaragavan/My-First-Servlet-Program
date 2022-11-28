package com.servlet.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.servlet.dto.User;

public class Databaseutil {
	
	private static List<User>userList = new ArrayList<User>();

	public static void save(User user) {
		userList.add(user);
	}
	
	public static List<User> getAllUsers(){
		return userList;
	}
	
	public static User getUser(UUID id) {
		
		User userObj = null;
		
		for (User user : userList) {
			
			if(user.getId().equals(id)) {
				userObj = user;
				break;
			}
		}
		
		return userObj;
		
	}
	
}
