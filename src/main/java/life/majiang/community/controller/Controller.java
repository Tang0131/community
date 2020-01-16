package life.majiang.community.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
    public String sayHello(){
        return "index";
    }





}
