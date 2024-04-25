package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: administrator
 * @Date: 2024/4/16 11:07
 */
@Configuration
public class FeignConfig {
//    @Bean
//    public Retryer myRetryer()
//    {
////        return Retryer.NEVER_RETRY; //Feign默认配置是不走重试策略的
//
//        //最大请求次数为3(1+2)，初始间隔时间为100ms，重试间最大间隔时间为1s
//        return new Retryer.Default(100,1,3);
//    }

    @Bean
    Logger.Level feginLoggerLevel()  {
        return Logger.Level.FULL;
    }
}
