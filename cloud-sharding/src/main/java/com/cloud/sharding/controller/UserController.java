package com.cloud.sharding.controller;

import com.cloud.sharding.entity.User;
import com.cloud.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.controller
 * @author: dd-cat
 * @createTime:2021/4/19 17:14
 * @version:1.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("user")
    public User getUser(Integer id){
        User byId = userService.getById(id);
        System.out.println(byId);
        return byId;
    }

    @PostMapping("save")
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }
}
