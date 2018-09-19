package net.itxw.redis_springboot.service.impl;

import net.itxw.redis_springboot.common.RedisUtils;
import net.itxw.redis_springboot.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserserviceImpl implements UserService {

    @Resource
    RedisUtils redisUtils;

    @Override
    @Cacheable(value="myCache",key="'userName'")
    public String getName() {
        System.out.println("看我会执行不？");
        return "itxw";
    }

}
