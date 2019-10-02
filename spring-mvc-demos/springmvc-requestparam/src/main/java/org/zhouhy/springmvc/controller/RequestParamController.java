package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/requestparam")
@Controller
public class RequestParamController {
	
	/**
	 * ����name���Ե�ֵ������Ĳ������ֱ���һ�£������޷�ע��
	 * */
	@RequestMapping(value="/param",method=RequestMethod.POST)
	public String testRequestParam(@RequestParam String username,@RequestParam(required=true) String age){
		System.out.println("param");
		System.out.println("username="+username);
		System.out.println("age="+age);
		return "success";
	}
	
	/**
	 * ��name����ָ�����������Ϳ�������
	 * */
	@RequestMapping(value="/param2",method=RequestMethod.POST)
	public String testRequestParam2(@RequestParam(name="username") String name,@RequestParam String age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
	
	/**����Ĭ��ֵ*/
	@RequestMapping(value="/param3",method=RequestMethod.POST)
	public String testRequestParam3(@RequestParam(name="username") String name,
			@RequestParam(defaultValue="0") String age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
	
	/**��ʱ��age��int�����ǰ̨û�д�ֵ����ô����null��null�޷���ֵ��age,���Ա���
	 * ����������ò�Ҫ�û����������ͣ���Integer*/
	@RequestMapping(value="/param4",method={RequestMethod.POST,RequestMethod.GET})
	public String testRequestParam4(@RequestParam(name="username") String name,
			@RequestParam(required=true) Integer age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
}
