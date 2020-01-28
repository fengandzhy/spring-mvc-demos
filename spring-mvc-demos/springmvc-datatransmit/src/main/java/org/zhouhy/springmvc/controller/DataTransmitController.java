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
	 * 	表单里的名字和这里的方法参数名一致，可以直接取到
	 * */
	@RequestMapping("/byparamname")
	public String transmitDataByParamName(String username,String age){		
		System.out.println("username:"+username);
		System.out.println("age:"+age);
		
		return "success";
	}
	
	/**
	 * 	通过普通的java bean来访问
	 * */
	@RequestMapping("/byformbean")
	public String transmitDataByFormBean(UserFormBean userFormBean){		
		System.out.println("username:"+userFormBean.getUsername());
		System.out.println("age:"+userFormBean.getAge());		
		return "success";
	}
	
	
}
