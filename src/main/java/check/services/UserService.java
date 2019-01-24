package check.services;

import check.entity.User;

/**
 * wangjun 2019-01-20
 * 
 */

public interface UserService{
   User getUser();
   int addUser(User user);
   int updateUser(User user);
   int delete(String id);
   int getCredit(int id);
}