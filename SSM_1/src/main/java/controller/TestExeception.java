package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jiao.exeception.SysExeception;
@Controller
@RequestMapping("/Exeception")
public class TestExeception {
	/**
	 * 测试异常类
	 * @return 
	 * @throws SysExeception 
	 * 
	 * */
	@RequestMapping("/testExeception")
	public  String testExeception() throws SysExeception {
		//模拟异常
		try {
			int j=10/0;
			
		}catch (Exception e) {
			// TODO: handle exception\
			throw new SysExeception("出现错误");
		}
		
		return "success";
	}

}
