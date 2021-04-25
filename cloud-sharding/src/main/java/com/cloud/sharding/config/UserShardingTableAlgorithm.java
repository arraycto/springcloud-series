package com.cloud.sharding.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @description: db_user自定义分表策略
 * @author: dd-cat
 * @createTime:2021/4/16 14:14
 * @version:1.0
 */
public class UserShardingTableAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        StringBuilder sb = new StringBuilder();
        //分成5张表，根据id取余5
        Integer value = preciseShardingValue.getValue() % 5;
        //获取设置的虚拟表名称，这里获取到的logicTableName=db_user
        String logicTableName = preciseShardingValue.getLogicTableName();
        //拼接实际的表名称
        sb.append(logicTableName).append("_").append(value);
        return sb.toString();
    }
}
