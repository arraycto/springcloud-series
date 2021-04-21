package com.cloud.drools.controller;

import com.cloud.drools.entity.RiskFactors;
import com.cloud.drools.util.DroolsUtil;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dd-cat
 * @createTime:2021/4/19 14:26
 * @version:1.0
 */
@RestController
public class RuleController {

    @GetMapping("rule")
    public RiskFactors getRule() throws Exception {
        RiskFactors factors = new RiskFactors();
        factors.setTc(2.2);
        KieSession kieSession = DroolsUtil.getKieSessionFromXLS("decision/1.危险因素-总胆固醇规则.xlsx");
        // 将obj作为参数传入Drools执行
        kieSession.insert(factors);
        // 加载规则
        kieSession.fireAllRules();
        // 关闭会话
        kieSession.dispose();
        return factors;
    }
}
