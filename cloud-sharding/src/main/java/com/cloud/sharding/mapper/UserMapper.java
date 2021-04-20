package com.cloud.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.sharding.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.mapper
 * @author: dd-cat
 * @createTime:2021/4/19 17:11
 * @version:1.0
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from db_user where id=1")
    User getUserById();
}
