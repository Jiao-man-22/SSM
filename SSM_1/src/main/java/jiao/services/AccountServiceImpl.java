package jiao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Account;
/**
 * 生成accountService对象注入ioc容器
 * */
@Controller
@Service("accountService")

public class AccountServiceImpl implements AccountService{
	@Autowired
	public AccountService accountService=null;
	@RequestMapping("/findAll")
	public List<Account> findAll() {
		System.out.println("findAll方法译掉用==========业务层");
		accountService.findAll();
		return null;
	}

	public void saveAccount(Account account) {
		System.out.println("saveAccount方法译掉用==========业务层");
		
	}

}
