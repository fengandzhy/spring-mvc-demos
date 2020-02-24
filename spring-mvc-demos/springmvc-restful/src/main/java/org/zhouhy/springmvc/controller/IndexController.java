package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	
	/**
	 * 这里是一个数组
	 * */
	@RequestMapping(value={"/","/index",""})
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/success")
	public String success(){
		return "success";
	}
}
