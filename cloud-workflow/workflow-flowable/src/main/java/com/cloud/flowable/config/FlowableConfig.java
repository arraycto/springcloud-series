package com.cloud.flowable.config;

/**
 * @description:
 * @author: dd-cat
 * @date:2021/4/22 16:01
 * @version:1.0
 */

import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * @author haiyangp
 * date:  2018/4/7
 * desc: flowable配置----为放置生成的流程图中中文乱码
 */
@Configuration
public class FlowableConfig implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    @Override
    public void configure(SpringProcessEngineConfiguration engineConfiguration) {
        engineConfiguration.setActivityFontName("宋体");
        engineConfiguration.setLabelFontName("宋体");
        engineConfiguration.setAnnotationFontName("宋体");
    }
}
