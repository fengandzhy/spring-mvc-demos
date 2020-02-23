package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/restfultest")
@Controller
public class RestController {
	
	@RequestMapping(value="/testPut",method=RequestMethod.PUT)
	public String testPut() {
		System.out.println("In testPut");
		return "redirect:/success";
	}
}
