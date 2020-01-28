package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/cookievalue")
@Controller
public class CookieValueController {
	
	/**
	 * @CookieValue 这个表示拿到cookie里面的值
	 * @CookieValue("JSESSIONID") String jSessionId 
	 * jSessionId里面封装的是cookie里面JSESSIONID的数据
	 * */
	@RequestMapping(value="/test")
	public String testCookieValue(@CookieValue("JSESSIONID") String jSessionId) {
		System.out.println(jSessionId);
		return "success";
	}
}
