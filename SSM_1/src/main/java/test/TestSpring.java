package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jiao.services.AccountService;

public class TestSpring {
	@Test
	public void run() {
		//加载配置文件
		ApplicationContext atc=new ClassPathXmlApplicationContext("classpath:springContext.xml");
		//获取对象
		AccountService as = (AccountService) atc.getBean("accountService");
		as.findAll();
	}

}
