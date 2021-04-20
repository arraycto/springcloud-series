package com.cloud.sharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.sharding.entity.User;
import com.cloud.sharding.mapper.UserMapper;
import com.cloud.sharding.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.service.impl
 * @author: dd-cat
 * @createTime:2021/4/19 17:12
 * @version:1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    public User getUserById() {
        return baseMapper.getUserById();
    }
}
