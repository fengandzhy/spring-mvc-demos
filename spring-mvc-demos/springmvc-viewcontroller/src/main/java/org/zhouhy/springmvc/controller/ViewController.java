package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/requestparam")
@Controller
public class ViewController {
	
	@RequestMapping(value="/param4",method={RequestMethod.POST,RequestMethod.GET})
	public String testRequestParam4(@RequestParam(name="username") String name,
			@RequestParam(required=true) Integer age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
}
