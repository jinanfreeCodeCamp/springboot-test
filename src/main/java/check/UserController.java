package check;

import org.springframework.web.bind.annotation.RestController;

import check.entity.User;
import check.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("user")
@RestController
public class UserController{

    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public User getUser(){
        User user = userService.getUser();
        user.setName("FCC");
        user.setPhone("156489");
        return user;
    }

    @RequestMapping(value="deleteUser", method=RequestMethod.DELETE)
    public String deleteUser(){
        userService.delete("123");
        return "delete success";
    }

    @RequestMapping(value="addUser", method=RequestMethod.POST)
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "add User success";
    }

    @RequestMapping(value="updateUser", method=RequestMethod.PUT)
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "update User success";
    }
}