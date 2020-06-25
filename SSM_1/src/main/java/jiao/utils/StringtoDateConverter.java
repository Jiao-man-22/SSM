package jiao.utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class StringtoDateConverter implements Converter<String,Date>{

	public Date convert(String source) {
		if(source==null) {
			throw new RuntimeException("sourcew==null");
		}
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		try {
			//将字符串转为日期
			return df.parse(source);
		} catch (Exception e) {
			throw new RuntimeException("格式转化异常");
		}

	}

	
}
