package MTVA.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.event.ActionEvent;

@RestController
public class HelloController {


    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/")
    public String index() {

        return "Greetings from Spring Boot!";
    }



}
