package com.hibernate;

import junit.framework.TestCase;

public class UserManagerTest extends TestCase {

	public void testAdd(){
		UserManager userManager=new UserManager();
		userManager.add("Jack");
		System.out.println("UserManagerTest.testAdd()");
	}
	public void testDel(){
		UserManager userManager=new UserManager();
		userManager.del("Jack");
		System.out.println("UserManagerTest.testDel()");
	}
	public void testFindUserById() {
		UserManager userManager=new UserManager();
        String userName= userManager.findUserById("001");
        System.out.println(userName);
        String expected="Jack";
        this.assertEquals(expected, userName);//断言，预期值
	}
}
