/**
 * Author: hjw
 * Data: 2018/4/18 16:01
 * Description: 测试导出数据库信息到Excel表格中
 */
package easypoi.demo.controller;

import easypoi.demo.entity.User;
import easypoi.demo.entity.Zsj;
import easypoi.demo.service.UserService;
import easypoi.demo.service.ZsjService;
import easypoi.demo.until.ExcelImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class ExcelController {

    @Autowired
    private UserService userService;
    @Autowired
    private ZsjService zsjService;

    @RequestMapping("export")
    public void export (HttpServletResponse response){
        User user = new User();
        user.setName("hjw");
        //从数据库获取需要导出的数据
        List<User> userList = userService.findUsername(user.getName());
        //导出操作
        ExcelImport.exportExcel(userList,"User表","信息",User.class,"User.xls",response);

    }
    @RequestMapping("list")
    @ResponseBody
    public List<User> list(HttpServletResponse response){
        User user = new User();
        //从数据库获取需要导出的数据
        List<User> userList = userService.findAll(user);
        ExcelImport.exportExcel(userList,"userTest表","user",User.class,"USerTest.xls",response);
        return userList;
    }

    @RequestMapping("select")
    @ResponseBody
    public User seclectTest(){
        User user = userService.selectByPrimaryKey(2);
        return user;
    }

    @RequestMapping("selectZ")
    @ResponseBody
    public Zsj seclectZsj(){
        Zsj zsj = zsjService.selectByPrimaryKey(2);
        return zsj;
    }

}
