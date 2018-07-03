package org.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by houping wang on 2018/6/8
 */
@Configuration
@EnableConfigurationProperties(ConfigurationRunner.class)
@ConditionalOnProperty(prefix = "spring.whp", name = "index", havingValue = "true", matchIfMissing = true)
public class ConfigureTest {

    private String b;

    @Autowired
    private ConfigurationRunner configurationRunner;

    public String getB() {
        return b;
    }

    public String getAValue() {
        return configurationRunner.getA();
    }
}
