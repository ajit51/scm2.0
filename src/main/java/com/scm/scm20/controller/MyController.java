package com.scm.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Inside home Controller{}");
        return "home";
    }
    

}
