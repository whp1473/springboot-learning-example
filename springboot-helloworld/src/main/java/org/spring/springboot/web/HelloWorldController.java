package org.spring.springboot.web;

import org.spring.springboot.ConfigureRunner;
import org.spring.springboot.ConfigureTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    private String a;

    private String b;

    private String c;

    @Autowired
    private ConfigureRunner configureRunner;

//    @Autowired
//    private ConfigureTest test;

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/abc")
    public String getABC() {
        return a + "," + b + "," + c;
    }

    @RequestMapping("/a")
    public String getA() {
//        return configureRunner.getA();
        return "";
    }

    @RequestMapping("/b")
    public String getB() {
//        return test.getB();
        return "";
    }

    /**
     * ConfigurationRunner
     * @return 容器方式
     */
    @RequestMapping("/a1")
    public String getAValue1() {
        return configureRunner.getAValue();
    }

    /**
     * ConfigureTest
     * @return 注解方式
     */
    @RequestMapping("/a2")
    public String getAValue2() {
//        return test.getAValue();
        return "";
    }
}
