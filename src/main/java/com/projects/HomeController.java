package com.projects;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//
//*
// * Created by clara.marti on 28/03/2018.
//
//
@RestController
public class HomeController {

    //notificationService
    private NotificationService notServ;

    /*@Autowired
    public HomeController(NotificationService notServ) {
        this.notServ = notServ;
    }*/

    private MyApp prueba;

    @Autowired
    public void setPrueba(MyApp prueba) {
        this.prueba = prueba;
    }

    @Value("${homeController.msg}")
    private String homecont;

    @Value("${my.secret}")
    private String mySecret;

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${msg}")
    private String msg;

    @RequestMapping("/")
    public String Home() {
//        return "<h1>" + "Hola Spriiiing!" + "</h1>";
//        return notServ.toString()
//        return homecont + "<br>" + mySecret;
        return prueba.toString();
    }
}