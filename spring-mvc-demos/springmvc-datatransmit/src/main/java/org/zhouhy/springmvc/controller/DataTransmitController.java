package org.zhouhy.springmvc.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zhouhy.springmvc.formbean.UserFormBean;

@RequestMapping(value="/datatransmit")
@Controller
public class DataTransmitController {
	
	@RequestMapping("/byreqandresp")
	public String transmitDataByReqAndResp(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
		System.out.println("username:"+username);
		System.out.println("age:"+age);
		
		return "success";
	}
	
	/**
	 * 	��������ֺ�����ķ���������һ�£�����ֱ��ȡ��
	 * */
	@RequestMapping("/byparamname")
	public String transmitDataByParamName(String username,String age){		
		System.out.println("username:"+username);
		System.out.println("age:"+age);
		
		return "success";
	}
	
	/**
	 * 	ͨ����ͨ��java bean������
	 * */
	@RequestMapping("/byformbean")
	public String transmitDataByFormBean(UserFormBean userFormBean){		
		System.out.println("username:"+userFormBean.getUsername());
		System.out.println("age:"+userFormBean.getAge());		
		return "success";
	}
	
	
}
