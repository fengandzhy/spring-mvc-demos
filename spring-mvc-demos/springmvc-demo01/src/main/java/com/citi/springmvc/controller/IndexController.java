package com.citi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(){
		
		//返回对应的视图名字
		return "index";
	}
	
	public String view(){
		return null;
	}
	
	
}
