package services.servicesImpl;

import entity.Admin;
import mapper.IAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import services.IAdminService;
import utils.BeanMapUtil;
import utils.MapParameter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private IAdminMapper iAdminMapper;

    @Override
    public int create(Admin admin) {
        if (iAdminMapper!=null){
            iAdminMapper.create(admin);
            return 1;
        }else {
            System.out.println("iAdminMapper="+iAdminMapper);
        }
        return 0;

    }

    @Override
    public int delete(Integer id) {
        Map<String,Object>paramMap=new HashMap<String, Object>();
        try {
            paramMap.put("id",id);
            iAdminMapper.delete(paramMap);
        } catch (Exception e){
            System.out.println("try语句块有问题");
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public int update(Admin admin) {
//      Map<String, Object> map = MapParameter.getInstance().put(BeanMapUtil.beanToMapUpdate(admin)).add("id", admin.getId()).getMap();
        HashMap<String, Object> map = new HashMap<String,Object>();
        map.put("updateAccount",admin.getAccount());
        map.put("updateName",admin.getName());
        map.put("updatePassword",admin.getPassword());
        map.put("id",admin.getId());
        System.out.println(map);
        iAdminMapper.update(map);
        return 1;
    }

    @Override
    public List<Admin> queryAll() {
        List<Admin> query = iAdminMapper.queryAll();
        for (Admin a:query) {
            System.out.println(a.toString());
        }
        return query;
    }

    @Override
    public Admin detail(Integer id) {
        Admin admin = new Admin();
        admin.setId(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("admin",admin);
        map.put("id",admin.getId());
        Admin a = iAdminMapper.detail(map);
        System.out.println(a.toString());
        return a;
    }


}
