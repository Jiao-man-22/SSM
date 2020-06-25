package jiao.exeception;
/**
 * 自定义异常类
 * 
 * */
public class SysExeception extends Exception {
	private String msessage;

	/**
	 * @return the msessage
	 */
	public String getMsessage() {
		return msessage;
	}

	/**
	 * @param msessage the msessage to set
	 */
	public void setMsessage(String msessage) {
		this.msessage = msessage;
	}

	public SysExeception(String message) {
		this.msessage= message;
		// TODO Auto-generated constructor stub
	}
	
	
	

}
