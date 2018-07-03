package org.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by houping wang on 2018/6/8
 */
@Component
public class ConfigureRunner {

    @Autowired
    private ConfigurationRunner configurationRunner;

    private String a;

    public String getA() {
        return a;
    }

    public String getAValue() {
        return configurationRunner.getA();
    }

}
