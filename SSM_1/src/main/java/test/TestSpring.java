package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jiao.services.AccountService;

public class TestSpring {
	@Test
	public void run() {
		//���������ļ�
		ApplicationContext atc=new ClassPathXmlApplicationContext("classpath:springContext.xml");
		//��ȡ����
		AccountService as = (AccountService) atc.getBean("accountService");
		as.findAll();
	}

}
