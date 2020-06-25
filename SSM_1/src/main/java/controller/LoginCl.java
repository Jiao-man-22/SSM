package controller;


import java.util.Date;
import java.util.Map;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import entity.Account;
import entity.User;

@SessionAttributes(value= {"msg"})//把美美存到session域中
@Controller
@RequestMapping(path = "/LoginCl")
public class LoginCl {
	@RequestMapping(path = "/userLogin")
	public String Login(String name, String pwd) {
		if (name != null && pwd != null) {
			System.out.println("Login方法执行");
			System.out.print("name:" + name + "pwd:" + pwd);
			return "success";
		}
		return "";
	}

	@RequestMapping("/saveAccount")
	public String saveAccount(Account account) {
		System.out.println(account);

		return "success";

	}

	/**
	 * 自动类型转换
	 */
	@RequestMapping("/saveUser")
	public String saveUser(User user) {
		System.out.println(user);
		return "success";

	}

	/**
	 * 获取原生的servlet
	 */
	@RequestMapping("/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("执行了。。。。。");
		System.out.println(request);
		HttpSession session = request.getSession();
		System.out.println(session);
		ServletContext context = session.getServletContext();
		System.out.println(context);
		return "success";
	}
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(name="name")String username) {
		System.out.println(username);
		return "success";
		
	}
	@RequestMapping("/testRequestBody")
	public String testRequestBody(@RequestBody String body) {
		System.out.println(body);
		return "success";
	}
	/**PathVariable注解测试
	 * 
	 * */
	@RequestMapping("/testPathVariable/{sid}")
	public String testPathVariable(@PathVariable(name="sid") String id) {
		System.out.println(id);
		return "success";
	}
	/**
	 * 测试RequestHeader
	 * 获得请求头的值
	 * */
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept")String header ) {
		System.out.println(header);
		return "success";
	}
	/**
	 * 测试Cookie
	 * 获得请求头的值
	 * */
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID")String cookie ) {
		System.out.println(cookie);
		return "success";
	}
	/**
	 * 测试
	 * ModelAttribute
	 * */
	@RequestMapping(value="/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("abc")User user ) {
		System.out.println("testModelAttribute执行了/。。。。。");
		System.out.println(user);
		return "success";
	}
	/**
	 * 测试
	 * ModelAttribute
	 * 此注解修饰的方法优于控制器的方法执行
	 * */
	@ModelAttribute
	public String showUser(String name,Map<String,User> map) {
		//模拟数据库数据
		User user = new User();
		user.setName(name);
		user.setAge(20);
		user.setDate(new Date());
		map.put("abc", user);
		return "success";
	}
	/**
	 * 测试
	 * testSessionAttribute
	 * 使用Model进行操作，便于解耦
	 * */
	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(Model model) {
		System.out.println("testSessionAttribute/。。。。。");
		model.addAttribute("msg","美美");
		return "success";
		
	}
	/**
	 * 测试
	 * testSessionAttribute
	 * 使用Model进行操作，便于解耦
	 * */
	@RequestMapping("/setSessionAttribute")
	public String setSessionAttribute(Model model) {
		System.out.println("setSessionAttribute/。。。。。");
		model.addAttribute("msg","美美");
		return "success";
		
	}
	/**
	 * 测试
	 * testSessionAttribute
	 * 使用Model进行操作，便于解耦
	 * */
	@RequestMapping("/getSessionAttribute")
	public String getSessionAttribute(ModelMap modelMap) {
		System.out.println("getSessionAttribute/。。。。。");
		String msg=(String) modelMap.get("msg");
		System.out.println(msg);
		return "success";
		
	}
	/**
	 * 清除session
	 * */
	public String delSessionAttribute(SessionStatus status) {
		System.out.println("getSessionAttribute/。。。。。");
		status.setComplete();
		return "success";
	}
	/**
	 * 测试ajax
	 * 返回json数据
	 * 
	 * */
	@RequestMapping("/testAjax")
	public @ResponseBody User testAjax(@RequestBody User user) {
		System.out.println("testAjax/。。。。。");
		System.out.println(user);
		user.setName("jiao");
		user.setAge(50);
		user.setDate(new Date());
		return user;
		
		
		
	}



}
