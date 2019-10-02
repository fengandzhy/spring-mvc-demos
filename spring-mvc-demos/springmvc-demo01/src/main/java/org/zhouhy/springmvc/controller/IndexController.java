package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class IndexController {
	
	@RequestMapping(value="/{id}")
	public String index(@PathVariable(value="id")String ids){		
		//返回对应的视图名字
		System.out.println("ids="+ids);
		return "index";
	}
	
	@RequestMapping(value="/index/{id}")
	public String view(@PathVariable(value="id")int ids){
		System.out.println("ids="+ids);
		return "index";
	}
	
	/**
	 * 如果地址和带参数有冲突，例如这个例子,这个地址直接是/2，而上面是/{id}
	 * 所以当浏览器里输入http://localhost:8080/springmvc-demo01/2的时候
	 * 虽然都符合两个，但是优先选这里
	 * */
	@RequestMapping(value="/2")
	public String test(){		
		System.out.println("映射到1.jsp");
		return "1";
	}
	
	/**
	 * 如果地址和带参数有冲突，例如这个例子,这个地址直接是/indexPost，但是跟上例不同,它的method=RequestMethod.POST
	 * 所以当浏览器里输入http://localhost:8080/springmvc-demo01/indexPost的时候
	 * 请求的是GET,所以满足上面，走上面
	 * 如果是post请求过来的，例如postman发起的请求,先走这个
	 * */
	@RequestMapping(value="/indexPost",method=RequestMethod.POST)
	public String methodLimit(){
		System.out.println("post 请求过来映射到此");
		return "index";
	}
	
}
