package net.itxw.redis_springboot.controller;

import net.itxw.redis_springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/getName")
    public String getName(){
        return userService.getName();
    }
}
