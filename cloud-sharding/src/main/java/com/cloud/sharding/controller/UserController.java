package com.cloud.sharding.controller;

import com.cloud.sharding.dao.UserRepository;
import com.cloud.sharding.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dd-cat
 * @createTime:2021/4/19 17:14
 * @version:1.0
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("user")
    public User getUser(Integer id) {
        User byId = userRepository.getOne(id);
        System.out.println(byId);
        return byId;
    }

    @PostMapping("save")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
