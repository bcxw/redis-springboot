package net.itxw.redis_springboot;

import net.itxw.redis_springboot.common.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.connection.RedisServer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisSpringbootApplicationTests {

    @Resource
    RedisUtils redisUtils;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Test
    public void contextLoads() {

    }

    @Test
    public void test(){

        redisUtils.set("newKey","newValue");
    }


}
