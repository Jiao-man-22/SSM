package entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable{
private String name;
private String pwd;
private Integer monery;
//private User user=null;
///**
// * @return the user
// */
//public User getUser() {
//	return user;
//}
///**
// * @param user the user to set
// */
//public void setUser(User user) {
//	this.user = user;
//}
private List<User> list;
private Map<String, User>map;

/**
 * @return the list
 */
public List<User> getList() {
	return list;
}
/**
 * @param list the list to set
 */
public void setList(List<User> list) {
	this.list = list;
}
/**
 * @return the map
 */
public Map<String, User> getMap() {
	return map;
}
/**
 * @param map the map to set
 */
public void setMap(Map<String, User> map) {
	this.map = map;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the pwd
 */
public String getPwd() {
	return pwd;
}
/**
 * @param pwd the pwd to set
 */
public void setPwd(String pwd) {
	this.pwd = pwd;
}
/**
 * @return the monery
 */
public Integer getMonery() {
	return monery;
}
/**
 * @param monery the monery to set
 */
public void setMonery(Integer monery) {
	this.monery = monery;
}
@Override
public String toString() {
	return "Account [name=" + name + ", pwd=" + pwd + ", monery=" + monery + ", list=" + list + ", map=" + map + "]";
}

}
