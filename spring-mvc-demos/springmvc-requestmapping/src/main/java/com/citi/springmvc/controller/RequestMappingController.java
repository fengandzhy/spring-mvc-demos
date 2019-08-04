package com.citi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/requestmapping")
@Controller
public class RequestMappingController {
	
	/**
	 * consumes 请求的类型必须是application/json
	 * */
	@RequestMapping(value="/testConsume",method=RequestMethod.POST,consumes="application/json")
	public String consumesTest(){
		System.out.println("consumeTest 方法");
		return "success";
	}
	
	@RequestMapping(value="/testProduces",method=RequestMethod.POST,produces="application/json")
	public String producesTest(){
		System.out.println("producesTest 方法");
		return "success";
	}
	
	/**
	 * params指定request中必须包含某些参数值，才让该方法处理.
	 * 比如params={"username","age!=10"},意思就是请求中必须有参数名为username 和age 的这两个参数
	 * 而且age的值不能是10，这样的请求才会被处理
	 * 
	 * */
	@RequestMapping(value="/testParams",method=RequestMethod.POST,params={"username","age"})
	public String paramsTest(){
		System.out.println("paramsTest 方法");
		return "success";
	}
	
	/**
	 * headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求
	 * */
	@RequestMapping(value="/testHeaders",method=RequestMethod.GET,headers={"Accept-Language=zh-CN,zh;q=0.9,und;q=0.8,en;q=0.7,zh-TW;q=0.6"})
	public String headersTest(){
		System.out.println("testHeaders 方法");
		return "success";
	}
	
	/**
	 * name参数的值,如果没有配置指定,默认值是RMC#nameTest(类的大写字符+#+方法名)
	 * 
	 * */
	@RequestMapping(value="/testName",method=RequestMethod.GET,name="yyyy")
	public String nameTest(){
		System.out.println("nameTest 方法");
		return "success";
	}
}
