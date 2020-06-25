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

@SessionAttributes(value= {"msg"})//�������浽session����
@Controller
@RequestMapping(path = "/LoginCl")
public class LoginCl {
	@RequestMapping(path = "/userLogin")
	public String Login(String name, String pwd) {
		if (name != null && pwd != null) {
			System.out.println("Login����ִ��");
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
	 * �Զ�����ת��
	 */
	@RequestMapping("/saveUser")
	public String saveUser(User user) {
		System.out.println(user);
		return "success";

	}

	/**
	 * ��ȡԭ����servlet
	 */
	@RequestMapping("/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ִ���ˡ���������");
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
	/**PathVariableע�����
	 * 
	 * */
	@RequestMapping("/testPathVariable/{sid}")
	public String testPathVariable(@PathVariable(name="sid") String id) {
		System.out.println(id);
		return "success";
	}
	/**
	 * ����RequestHeader
	 * �������ͷ��ֵ
	 * */
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept")String header ) {
		System.out.println(header);
		return "success";
	}
	/**
	 * ����Cookie
	 * �������ͷ��ֵ
	 * */
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue(value="JSESSIONID")String cookie ) {
		System.out.println(cookie);
		return "success";
	}
	/**
	 * ����
	 * ModelAttribute
	 * */
	@RequestMapping(value="/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("abc")User user ) {
		System.out.println("testModelAttributeִ����/����������");
		System.out.println(user);
		return "success";
	}
	/**
	 * ����
	 * ModelAttribute
	 * ��ע�����εķ������ڿ������ķ���ִ��
	 * */
	@ModelAttribute
	public String showUser(String name,Map<String,User> map) {
		//ģ�����ݿ�����
		User user = new User();
		user.setName(name);
		user.setAge(20);
		user.setDate(new Date());
		map.put("abc", user);
		return "success";
	}
	/**
	 * ����
	 * testSessionAttribute
	 * ʹ��Model���в��������ڽ���
	 * */
	@RequestMapping("/testSessionAttribute")
	public String testSessionAttribute(Model model) {
		System.out.println("testSessionAttribute/����������");
		model.addAttribute("msg","����");
		return "success";
		
	}
	/**
	 * ����
	 * testSessionAttribute
	 * ʹ��Model���в��������ڽ���
	 * */
	@RequestMapping("/setSessionAttribute")
	public String setSessionAttribute(Model model) {
		System.out.println("setSessionAttribute/����������");
		model.addAttribute("msg","����");
		return "success";
		
	}
	/**
	 * ����
	 * testSessionAttribute
	 * ʹ��Model���в��������ڽ���
	 * */
	@RequestMapping("/getSessionAttribute")
	public String getSessionAttribute(ModelMap modelMap) {
		System.out.println("getSessionAttribute/����������");
		String msg=(String) modelMap.get("msg");
		System.out.println(msg);
		return "success";
		
	}
	/**
	 * ���session
	 * */
	public String delSessionAttribute(SessionStatus status) {
		System.out.println("getSessionAttribute/����������");
		status.setComplete();
		return "success";
	}
	/**
	 * ����ajax
	 * ����json����
	 * 
	 * */
	@RequestMapping("/testAjax")
	public @ResponseBody User testAjax(@RequestBody User user) {
		System.out.println("testAjax/����������");
		System.out.println(user);
		user.setName("jiao");
		user.setAge(50);
		user.setDate(new Date());
		return user;
		
		
		
	}



}
