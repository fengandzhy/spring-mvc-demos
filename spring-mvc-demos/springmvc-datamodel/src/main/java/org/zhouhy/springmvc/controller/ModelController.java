package org.zhouhy.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhouhy.springmvc.bean.User;

/**
 * 	�����controller�з������ݵ�JSPҳ��ʲô��
 * */
@Controller
@RequestMapping(value="/datamodel")
public class ModelController {
	
	/**
	 * 	���ص�JSPҳ������ݿ��Է�װ��ModelAndView
	 * */
	@RequestMapping("/modelandview")
	public ModelAndView modelAndViewMethod(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "xiaobai");
		modelAndView.setViewName("success");
		User user = new User();
		user.setUsername("lvlv");
		user.setId(1);
		user.setAge(10);
		modelAndView.addObject("user",user);
		
		
		User user1 = new User();
		user1.setUsername("benca");
		user1.setId(2);
		user1.setAge(10);
		
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);		
		modelAndView.addObject("userList",list);
		
		Map<String,User> map = new HashMap<>();
		map.put("user1", user);
		map.put("user2", user1);
		modelAndView.addObject("userMap",map);
		
		return modelAndView;
	}
	
	/**
	 * 	��һ�ַ����ı���
	 * */
	@RequestMapping("/map")
	public String mapMethod(Map<String,Object> map){
		
		map.put("name", "xiaobai");
		
		User user = new User();
		user.setUsername("lvlv");
		user.setId(1);
		user.setAge(10);
		map.put("user",user);
		
		
		User user1 = new User();
		user1.setUsername("benca");
		user1.setId(2);
		user1.setAge(10);
		
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);		
		map.put("userList",list);
		
		Map<String,User> map1 = new HashMap<>();
		map1.put("user1", user);
		map1.put("user2", user1);
		map.put("userMap",map1);
		
		return "success";
	}
	
	@RequestMapping("/model")
	public String modelMethod(Model model){
		
		model.addAttribute("name", "xiaobai");
		
		User user = new User();
		user.setUsername("lvlv");
		user.setId(1);
		user.setAge(10);
		model.addAttribute("user",user);
		
		
		User user1 = new User();
		user1.setUsername("benca");
		user1.setId(2);
		user1.setAge(10);
		
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);		
		model.addAttribute("userList",list);
		
		Map<String,User> map1 = new HashMap<>();
		map1.put("user1", user);
		map1.put("user2", user1);
		model.addAttribute("userMap",map1);
		
		return "success";
	}
}
