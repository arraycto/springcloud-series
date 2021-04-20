package com.cloud.sharding.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @description:
 * @projectName:dd-cat-cloud
 * @see:com.cloud.sharding.config
 * @author: dd-cat
 * @createTime:2021/4/20 9:56
 * @version:1.0
 */
public class UserTableAlgorithm implements PreciseShardingAlgorithm<Integer> {
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        StringBuilder sb = new StringBuilder();
        Integer value = preciseShardingValue.getValue();
        //获取设置的虚拟表名称，这里获取到的logicTableName=t_order
        String logicTableName = preciseShardingValue.getLogicTableName();
        //拼接实际的表名称，value为carParkId字段的值
        sb.append(logicTableName).append(value);
        return sb.toString();
    }
}
