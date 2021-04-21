package com.cloud.drools.entity;

import lombok.Data;

/**
 * 危险因素-总胆固醇规则
 *
 * @author 李磊
 * @since 1.0
 */
@Data
public class RiskFactors {
    /**
     * 总胆固醇
     */
    public Double tc;
    /**
     * 总胆固醇水平 0:正常 1:异常
     */
    public Integer tc_level;

    /**
     * 目标 action_id
     */
    public String target_action_ids;
    /**
     * 随访 action_id
     */
    public String follow_up_action_ids;
}