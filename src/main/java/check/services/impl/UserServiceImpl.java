package check.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import check.daos.UserDao;
import check.entity.User;
import check.services.CreditSystemService;
import check.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired 
    CreditSystemService creditSystemService; 
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser() {
        return userDao.get();
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

    @Override
    public int getCredit(int userid) {
        return creditSystemService.getUserCredit(userid) ; 
    }

}