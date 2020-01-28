package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/requesthead")
@Controller
public class RequestHeaderController {
	
	/**
	 * @RequestHeader 这个表示拿到请求头里的数据
	 * @RequestHeader("Accept-Encoding") String ec ec里面封装的是请求头里面Accept-Encoding的数据
	 * */
	@RequestMapping(value="/test")
	public String testRequestHeader(@RequestHeader("Accept-Encoding") String ec) {
		System.out.println(ec);
		return "success";
	}
}
