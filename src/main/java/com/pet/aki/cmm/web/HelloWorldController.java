package com.pet.aki.cmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }


    @RequestMapping("/hello")
    public String helloWorld() {

        return "/com/pet/aki/cmm/hello";
    }


    @RequestMapping("/admin")
    public String admin() {

        return "/com/pet/aki/cmm/admin";
    }


    @RequestMapping("/guest")
    public String guest() {

        return "/com/pet/aki/cmm/guest";
    }


    @RequestMapping("/manager")
    public String manager() {

        return "/com/pet/aki/cmm/manager";
    }
}
