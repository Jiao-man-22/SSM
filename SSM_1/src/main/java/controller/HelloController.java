package controller;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@Controller
@RequestMapping(path = "/user")
public class HelloController {
	
	
	@RequestMapping(path = "/hello")
	public String sayHello() {
		System.out.println("���ų��������");
		return "success";
		
	}
	@RequestMapping(path = "/testRequestMApping")
	public String testRequestMApping() {
		System.out.println("RequestMapping���Գɹ�");
		return "success";
		
	}
	@RequestMapping(path="/userLogin")
	public String  Login() {
		System.out.println("Login����ִ��");
		return null;
	}
	

}
