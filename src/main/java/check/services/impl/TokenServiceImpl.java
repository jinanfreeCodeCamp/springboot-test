package check.services.impl;

import check.entity.Token;
import check.entity.User;
import check.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class TokenServiceImpl implements TokenService{

    private static final int Expire = 3600*25;

   
    @Override
    public Map<String, Object> createToken(User user) {
        //User user = new User();
        //创建TokenEntity参数
        String newtoken = UUID.randomUUID().toString();
        Date updateTime = new Date();
        Date expireTime = new Date(updateTime.getTime()+Expire*1000);

        Token token = new Token(newtoken,user.getName(),updateTime,expireTime);
       
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("token",token);
        return map;
    }

    @Override
    public void checkExpire() {
        Date now = new Date();
        
    }
}