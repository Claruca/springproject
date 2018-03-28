package com.projects;

import com.abc.foo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@ComponentScan({"com.abc.foo", "com.projects"})
//@EnableConfigurationProperties
@SpringBootApplication
public class SpringprojectApplication {

    /*public static void main(String[] args) {

        ApplicationContext cont = SpringApplication.run(SpringprojectApplication.class, args);

        MyApp config = (MyApp) cont.getBean("MyApp");
        System.out.println(config.toString());

    }*/


//    @Bean
//    public User user(){
//        return new User("Clara","Marti");
//    }

    public static void main(String[] args) {

        ApplicationContext cont = SpringApplication.run(SpringprojectApplication.class, args);

        System.out.println(cont.getBean("miapli").toString());

        /*String[] beanNames = cont.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }*/

//        System.out.println(cont.getBean("user").toString());
    }
}
