package com.gzdzss.dubbo.spring.boot.demo.provider.bootstrap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author <a href="mailto:zhouyanjie666666@gmail.com">zyj</a>
 * @date 2019/7/29
 */

@EnableAutoConfiguration
public class DubboAutoConfigurationProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboAutoConfigurationProviderBootstrap.class)
                .run(args);
    }
}
