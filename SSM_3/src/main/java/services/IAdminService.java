package services;
import entity.Admin;

import java.util.List;
import java.util.Map;

public interface IAdminService {
    public int create(Admin admin);

    public int delete(Integer id);

    public int update(Admin admin);

    public List<Admin> queryAll();

    public Admin detail(Integer id);
}
