package jiao.services;

import java.util.List;

import entity.Account;

public interface AccountService {
	//����
	public List<Account>findAll();
	//����
	public void saveAccount(Account account);

}
