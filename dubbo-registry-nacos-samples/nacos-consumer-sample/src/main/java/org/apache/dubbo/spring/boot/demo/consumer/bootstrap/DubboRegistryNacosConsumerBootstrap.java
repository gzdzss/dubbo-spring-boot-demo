package org.apache.dubbo.spring.boot.demo.consumer.bootstrap;

import com.gzdzss.dubbo.spring.boot.demo.consumer.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author <a href="mailto:zhouyanjie666666@gmail.com">zyj</a>
 * @date 2019/7/29
 */

@EnableAutoConfiguration
public class DubboRegistryNacosConsumerBootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboRegistryNacosConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(demoService.sayHello("gzdzss"));
    }
}
