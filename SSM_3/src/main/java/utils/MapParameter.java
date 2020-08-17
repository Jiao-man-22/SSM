package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 对map集合进行封装
 * 实现链式调用
 * */
public class MapParameter {
    private Map<String,Object> parameterMap=new HashMap<String, Object>();
    public MapParameter() {
    }
    public static MapParameter getInstance(){
        return new MapParameter();
    }
    public Map<String,Object> getMap(){
        return parameterMap;
    }
    //支持放入map
    public MapParameter put(Map<String,Object> map){
        for (Map.Entry<String,Object> entry:map.entrySet()) {
            parameterMap.put(entry.getKey(),entry.getValue());
        }
        return this;
    }
    public MapParameter put(String key,Object val){
        parameterMap.put(key, val);
        return this;
    }
    public MapParameter add(String key,Object val){
        return  this.put(key,val);
    }
}
