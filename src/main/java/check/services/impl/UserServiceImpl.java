package check.services.impl;

import org.springframework.stereotype.Service;

import check.entity.User;
import check.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        return new User();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }

}