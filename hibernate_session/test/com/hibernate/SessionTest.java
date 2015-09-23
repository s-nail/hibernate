package com.hibernate;


import org.hibernate.Session;
import org.hibernate.Transaction;

import junit.framework.TestCase;

public class SessionTest extends TestCase {
	public void testSave1() {
		Session session=null;
		try {
			session=HibernateUtils.getSession();
			Transaction tx=session.beginTransaction();
		} catch (Exception e) {
		}
		
	}

}
