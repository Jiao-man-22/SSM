package utils;
import com.google.common.base.CaseFormat;
import com.google.common.collect.Maps;
import org.springframework.cglib.beans.BeanMap;
import java.util.Map;

/**
 * 处理实体类和map集合之间的转换
 * */
public class BeanMapUtil{
    //bean封装成map的方法
    public static <T>Map<String,Object> beanToMap(T bean){
        //创建map
        Map<String,Object> map= Maps.newHashMap();
        if (bean!=null){
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key :beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }
    public static  <T>Map<String,Object> beanToMapUpdate(T bean){
        Map<String,Object> map=Maps.newHashMap();
        if (bean!=null){
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key:beanMap.keySet()) {
                map.put(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,"update_"+key),beanMap.get(key));
            }
        }
        return null;
    }
    public static void main(String[] args){
//        Admin admin = new Admin();
//        admin.setAccount("10001");
//        admin.setName("ding");
//        Map<String, Object> map = BeanMapUtil.beanToMap(admin);
//        System.out.println(map);
    }
}
