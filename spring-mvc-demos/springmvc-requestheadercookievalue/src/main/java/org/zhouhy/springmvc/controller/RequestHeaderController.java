package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/requesthead")
@Controller
public class RequestHeaderController {
	
	/**
	 * @RequestHeader �����ʾ�õ�����ͷ�������
	 * @RequestHeader("Accept-Encoding") String ec ec�����װ��������ͷ����Accept-Encoding������
	 * */
	@RequestMapping(value="/test")
	public String testRequestHeader(@RequestHeader("Accept-Encoding") String ec) {
		System.out.println(ec);
		return "success";
	}
}
