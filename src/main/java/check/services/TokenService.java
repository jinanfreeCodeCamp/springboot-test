package check.services;

import java.util.Map;

import check.entity.User;

public interface TokenService {

    Map<String, Object> createToken(User user);
    void checkExpire();
}