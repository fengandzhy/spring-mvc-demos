package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/cookievalue")
@Controller
public class CookieValueController {
	
	/**
	 * @CookieValue �����ʾ�õ�cookie�����ֵ
	 * @CookieValue("JSESSIONID") String jSessionId 
	 * jSessionId�����װ����cookie����JSESSIONID������
	 * */
	@RequestMapping(value="/test")
	public String testCookieValue(@CookieValue("JSESSIONID") String jSessionId) {
		System.out.println(jSessionId);
		return "success";
	}
}
