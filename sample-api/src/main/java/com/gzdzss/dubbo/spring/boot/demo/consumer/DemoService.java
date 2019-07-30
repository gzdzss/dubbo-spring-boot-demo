package com.gzdzss.dubbo.spring.boot.demo.consumer;

/**
 * @author <a href="mailto:zhouyanjie666666@gmail.com">zyj</a>
 * @date 2019/7/29
 */

public interface DemoService {

    /**
     *  demo
     * @param name
     * @return
     */
    String sayHello(String name);

}
