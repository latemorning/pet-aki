package com.pet.aki.cmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String index() {
		System.out.println("@RequestMapping(\"/\")");
		return "index";
	}

	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("@RequestMapping(\"/hello\")");
		return "/com/pet/aki/cmm/hello";
	}
}
