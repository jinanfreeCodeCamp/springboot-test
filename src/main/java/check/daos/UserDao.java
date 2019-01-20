package check.daos;

import check.entity.User;

public interface UserDao {
    User getUser();
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(String id);
}