package check;

import org.springframework.web.bind.annotation.RestController;

import check.entity.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("user")
@RestController
public class UserController{

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("FCC");
        user.setPhone("156489");
        return user;
    }

    @RequestMapping(value="deleteUser", method=RequestMethod.DELETE)
    public String deleteUser(){
        return "delete success";
    }

    @RequestMapping(value="addUser", method=RequestMethod.POST)
    public String addUser(@RequestBody User user){
        return "add User success";
    }

    @RequestMapping(value="updateUser", method=RequestMethod.PUT)
    public String updateUser(@RequestBody User user){
        return "update User success";
    }
}