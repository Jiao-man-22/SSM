package mapper;

import entity.Admin;

import java.util.List;
import java.util.Map;


public interface IAdminMapper {
    /**
     * dao层的增删改查
     */
    public int create(Admin admin);

    public int delete(Map<String, Object> paramMap);

    public int update(Map<String, Object> paramMap);

    public List<Admin> queryAll();

    public Admin detail(Map<String, Object> paramMap);


}
