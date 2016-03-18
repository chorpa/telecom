package com.mkk.dao;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mkk.domain.User;

@Repository
public class UserDao {
	@Test
	public void testConnec(){
		/*System.out.println(user);
		user.setUserName("xiaowei");
		System.out.println(user.getUserName());*/
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(aContext);
		User user = aContext.getBean("user",User.class);
		user.setUserName("xiaowei");
		System.out.println(user.getUserName());
		System.out.println(user.getLoginLog().toString());
	
	}
	
}
