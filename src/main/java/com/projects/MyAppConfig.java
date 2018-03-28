package com.projects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by clara.marti on 28/03/2018.
 */

@Configuration
public class MyAppConfig {

    @Bean(name="miapli")
    @Profile("proftest")
    MyApp miapli() {
        return new MyApp("Spring Example", 971456748);
    }
}
