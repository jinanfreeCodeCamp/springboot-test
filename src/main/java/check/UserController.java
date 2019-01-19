package check;

import org.springframework.web.bind.annotation.RestController;

import check.entity.User;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
@RestController
public class UserController{

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setMame("FCC");
        user.setPhone("156489");
        return user;
    }
}