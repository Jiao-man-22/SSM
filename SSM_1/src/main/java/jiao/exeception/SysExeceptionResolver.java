package jiao.exeception;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExeceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		//��ȡ���쳣����
		SysExeception e=null;
		if(ex instanceof SysExeception) {
			e=(SysExeception) ex;
		}else {
			e=new SysExeception("�����쳣");
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.getMsessage());
		mv.setViewName("error");
		return mv;
	}

}
