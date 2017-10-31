package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class MyController {

    @RequestMapping(value = "/hello")
    public String helloWorld(){
        return "Hello World!!!!";
    }
}
