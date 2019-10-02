package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/requestparam")
@Controller
public class RequestParamController {
	
	/**
	 * 表单中name属性的值和这里的参数名字必须一致，否则无法注入
	 * */
	@RequestMapping(value="/param",method=RequestMethod.POST)
	public String testRequestParam(@RequestParam String username,@RequestParam(required=true) String age){
		System.out.println("param");
		System.out.println("username="+username);
		System.out.println("age="+age);
		return "success";
	}
	
	/**
	 * 用name属性指定，参数名就可以随意
	 * */
	@RequestMapping(value="/param2",method=RequestMethod.POST)
	public String testRequestParam2(@RequestParam(name="username") String name,@RequestParam String age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
	
	/**设置默认值*/
	@RequestMapping(value="/param3",method=RequestMethod.POST)
	public String testRequestParam3(@RequestParam(name="username") String name,
			@RequestParam(defaultValue="0") String age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
	
	/**此时的age是int，如果前台没有传值，那么就是null，null无法赋值给age,所以报错
	 * 所以这里最好不要用基本数据类型，用Integer*/
	@RequestMapping(value="/param4",method={RequestMethod.POST,RequestMethod.GET})
	public String testRequestParam4(@RequestParam(name="username") String name,
			@RequestParam(required=true) Integer age){
		System.out.println("username="+name);
		System.out.println("age="+age);
		return "success";
	}
}
