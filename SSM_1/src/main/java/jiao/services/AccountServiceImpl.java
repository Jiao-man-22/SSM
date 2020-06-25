package jiao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Account;
/**
 * ����accountService����ע��ioc����
 * */
@Controller
@Service("accountService")

public class AccountServiceImpl implements AccountService{
	@Autowired
	public AccountService accountService=null;
	@RequestMapping("/findAll")
	public List<Account> findAll() {
		System.out.println("findAll���������==========ҵ���");
		accountService.findAll();
		return null;
	}

	public void saveAccount(Account account) {
		System.out.println("saveAccount���������==========ҵ���");
		
	}

}
