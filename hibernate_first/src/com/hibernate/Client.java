package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		// org.hibernate.cfg.Configuration类的作用：
		// 读取hibernate配置文件(hibernate.cfg.xml或hiberante.properties)的.
		// new Configuration()默认是读取hibernate.properties
		// 所以使用new Configuration().configure();来读取hibernate.cfg.xml配置文件
		// 默认读取hibernate.cfg.xml文件
		Configuration cfg = new Configuration().configure();

		// 创建SessionFactory
		// 一个数据库对应一个SessionFactory
		// SessionFactory是线线程安全的(最好创建一次)
		SessionFactory factory = cfg.buildSessionFactory();

		// 创建session
		// 此处的session并不是web中的session
		// session只有在用时，才建立concation,session还管理缓存。
		// session用完后，必须关闭。
		// session是非线程安全，一般是一个请求一个session.
		Session session = null;
		try {
			session = factory.openSession();
			//手动开启事务(可以在hibernate.cfg.xml配置文件中配置自动开启事务) 
			session.beginTransaction();
			
			// 保存数据，此处的数据是保存对象，这就是hibernate操作对象的好处，
			// 我们不用写那么多的JDBC代码，只要利用session操作对象，至于hibernat如何存在对象，这不需要我们去关心它，
			// 这些都有hibernate来完成。我们只要将对象创建完后，交给hibernate就可以了。
			User user =new User();
			user.setName("Lee");
			user.setPassword("00");
			session.save(user);
			//提交事物
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			//回滚事物
			session.getTransaction().rollback();
		}finally{
			if (session!=null) {
				if(session.isOpen())
					//关闭session
				    session.close();
			}
		}
	}

}
