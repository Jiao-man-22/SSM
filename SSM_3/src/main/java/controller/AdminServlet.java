package controller;
import entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import services.IAdminService;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminServlet {
    //自动装配需要的是实现类而非接口 spring 会根据实现类创建实例
    @Autowired
    private IAdminService iAdminService;
    @GetMapping("/create")
    @ResponseBody
    public  String create(HttpServletResponse response) {
        Admin admin = new Admin();
        admin.setAccount("13645865");
        admin.setName("jiaorongjin");
        admin.setPassword("123456");
        int result = iAdminService.create(admin);
        if (result<=0){
            return "error";
        }
        return "createSuccess";
    }
    @GetMapping("/delete")
    @ResponseBody
    public String delete(HttpServletResponse response,Integer id){
        int result = iAdminService.delete(id);
        if (result<=0){
           return "error";
        }else {
            return "deleteSuccess";
        }

    }
    @GetMapping("/update")
    @ResponseBody
    public String update(HttpServletResponse response){
        Admin admin = new Admin();
        admin.setAccount("2935996123");
        admin.setName("rong");
        admin.setPassword("123456");
        admin.setId(7);
        int result = iAdminService.update(admin);
        if (result<=0){
            return "error";
        }else{
            return "updateSuccess";
        }

    }
    @GetMapping("/queryAll")
    @ResponseBody
    public List<Admin> queryAll (){
        List<Admin> adminList = iAdminService.queryAll();
        return  adminList;
    }
    @GetMapping("/detail")
    @ResponseBody
    public Admin detail(HttpServletResponse response,Integer id){
        Admin admin = iAdminService.detail(id);
        admin.setDate(new Date());
       // System.out.println(admin.toString());
        return  admin;
    }
}
