package check.daos;

import org.apache.ibatis.annotations.Mapper;

import check.entity.User;

@Mapper
public interface UserDao {
    User get();
    int insert(User user);
    int update(User user);
    int delete(String id);
}