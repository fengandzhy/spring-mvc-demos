package com.citi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/requestmapping")
@Controller
public class RequestMappingController {
	
	/**
	 * consumes ��������ͱ�����application/json
	 * */
	@RequestMapping(value="/testConsume",method=RequestMethod.POST,consumes="application/json")
	public String consumesTest(){
		System.out.println("consumeTest ����");
		return "success";
	}
	
	@RequestMapping(value="/testProduces",method=RequestMethod.POST,produces="application/json")
	public String producesTest(){
		System.out.println("producesTest ����");
		return "success";
	}
	
	/**
	 * paramsָ��request�б������ĳЩ����ֵ�����ø÷�������.
	 * ����params={"username","age!=10"},��˼���������б����в�����Ϊusername ��age ������������
	 * ����age��ֵ������10������������Żᱻ����
	 * 
	 * */
	@RequestMapping(value="/testParams",method=RequestMethod.POST,params={"username","age"})
	public String paramsTest(){
		System.out.println("paramsTest ����");
		return "success";
	}
	
	/**
	 * headers�� ָ��request�б������ĳЩָ����headerֵ�������ø÷�����������
	 * */
	@RequestMapping(value="/testHeaders",method=RequestMethod.GET,headers={"Accept-Language=zh-CN,zh;q=0.9,und;q=0.8,en;q=0.7,zh-TW;q=0.6"})
	public String headersTest(){
		System.out.println("testHeaders ����");
		return "success";
	}
	
	/**
	 * name������ֵ,���û������ָ��,Ĭ��ֵ��RMC#nameTest(��Ĵ�д�ַ�+#+������)
	 * 
	 * */
	@RequestMapping(value="/testName",method=RequestMethod.GET,name="yyyy")
	public String nameTest(){
		System.out.println("nameTest ����");
		return "success";
	}
}
