package cn.chuanyu.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.chuanyu.domain.User;
import cn.chuanyu.service.UserService;

public class UserTest {
	private UserService userService;
	
	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"classpath:conf/spring-service.xml", "classpath:conf/spring-mybatis.xml"});
		userService = (UserService) context.getBean("userServiceImpl");
	}
	
	@Test
	public void addUser() {
		User user = new User();
		user.setNickname("你好");
		user.setState(2);
		System.out.println(userService.insertUser(user));
	}
}
