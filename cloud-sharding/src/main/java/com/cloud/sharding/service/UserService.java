package com.cloud.sharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.sharding.entity.User;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.service
 * @author: dd-cat
 * @createTime:2021/4/19 17:11
 * @version:1.0
 */
public interface UserService extends IService<User> {
    User getUserById();
}
