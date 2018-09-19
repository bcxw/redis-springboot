package net.itxw.redis_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringbootApplication.class, args);
    }
}
