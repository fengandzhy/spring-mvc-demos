package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zhouhy.springmvc.model.User;


@Controller
public class IndexController {
	
	/**
	 * ������һ������
	 * */
	@RequestMapping(value={"/","/index",""})
	public String index(Model model){
		model.addAttribute("command", new User());
		return "index";
	}
	
	@RequestMapping(value="/success")
	public String success(){
		return "success";
	}
}
