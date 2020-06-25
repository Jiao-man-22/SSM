package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jiao.services.AccountService;

@Controller
@RequestMapping("/AccountController")
public class AccountController {
@Autowired
public AccountService accountService=null;
@RequestMapping("/findAll")
public String findAll() {
	System.out.println("±Ìœ÷≤„=======");
	accountService.findAll();
	return "success";
	
}
}
