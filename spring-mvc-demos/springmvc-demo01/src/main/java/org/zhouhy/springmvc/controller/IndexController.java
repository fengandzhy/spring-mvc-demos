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
		//���ض�Ӧ����ͼ����
		System.out.println("ids="+ids);
		return "index";
	}
	
	@RequestMapping(value="/index/{id}")
	public String view(@PathVariable(value="id")int ids){
		System.out.println("ids="+ids);
		return "index";
	}
	
	/**
	 * �����ַ�ʹ������г�ͻ�������������,�����ֱַ����/2����������/{id}
	 * ���Ե������������http://localhost:8080/springmvc-demo01/2��ʱ��
	 * ��Ȼ��������������������ѡ����
	 * */
	@RequestMapping(value="/2")
	public String test(){		
		System.out.println("ӳ�䵽1.jsp");
		return "1";
	}
	
	/**
	 * �����ַ�ʹ������г�ͻ�������������,�����ֱַ����/indexPost�����Ǹ�������ͬ,����method=RequestMethod.POST
	 * ���Ե������������http://localhost:8080/springmvc-demo01/indexPost��ʱ��
	 * �������GET,�����������棬������
	 * �����post��������ģ�����postman���������,�������
	 * */
	@RequestMapping(value="/indexPost",method=RequestMethod.POST)
	public String methodLimit(){
		System.out.println("post �������ӳ�䵽��");
		return "index";
	}
	
}
