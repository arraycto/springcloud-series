package com.cloud.sharding.dao;

import com.cloud.sharding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: dd-cat
 * @createTime:2021/4/19 17:11
 * @version:1.0
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
