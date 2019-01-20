package check.daos;

import check.entity.User;

public interface UserDao {
    User get();
    int insert(User user);
    int update(User user);
    int delete(String id);
}