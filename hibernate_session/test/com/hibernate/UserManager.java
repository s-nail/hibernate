package com.hibernate;

public class UserManager {
	
	public void add(String username){
		System.out.println("UserManager.add()");
	}

	public void del(String username){
		System.out.println("UserManager.del()");
	}
	public String findUserById(String userId){
		return "Tom";
	}
}
