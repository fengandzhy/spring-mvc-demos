package com.citi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(){
		
		//���ض�Ӧ����ͼ����
		return "index";
	}
	
	public String view(){
		return null;
	}
	
	
}
