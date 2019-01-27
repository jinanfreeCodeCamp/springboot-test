package check.daos;

import org.apache.ibatis.annotations.Mapper;

import check.entity.User;

import java.util.List;

@Mapper
public interface UserDao {
    User get();
    int insert(User user);
    int update(User user);
    int delete(String id);

    List<User> getPageUser();
}