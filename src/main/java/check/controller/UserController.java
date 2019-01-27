package check.controller;

import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import check.entity.User;
import check.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        User user = userService.getUser();
        user.setName("FCC");
        user.setPhone("156489");
        return user;
    }

    @RequestMapping(value = "deleteUser", method = RequestMethod.DELETE)
    public String deleteUser() {
        userService.delete("123");
        return "delete success";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "add User success";
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "update User success";
    }

    @RequestMapping(value = "getPageUser", method = RequestMethod.POST)
    public List<User> getPageUser(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        //为了程序的严谨性，判断非空：
        if (page == null) {
            page = 1;   //设置默认当前页
        }
        if (page <= 0) {
            page = 1;
        }
        if (rows == null) {
            rows = 10;    //设置默认每页显示的条数
        }
        //1、设置分页信息，包括当前页数和每页显示的总计数
        PageHelper.startPage(page, rows);
        List<User> list = userService.getPageUser();
        return list;
    }
}