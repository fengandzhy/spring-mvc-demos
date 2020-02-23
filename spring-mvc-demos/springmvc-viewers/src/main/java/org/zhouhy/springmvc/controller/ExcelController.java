package org.zhouhy.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zhouhy.springmvc.beans.User;
import org.zhouhy.springmvc.web.ExcelView;

@RequestMapping(value="/excelviews")
@Controller
public class ExcelController {
	
	@RequestMapping(value="/excel1",method=RequestMethod.POST)
	public ModelAndView excelView1(User user) {
		Map<String,Object> map = new HashMap<>();
		List<User> users = new ArrayList<>();
		users.add(user);
		map.put("userList", users);
		ModelAndView modelAndView = new ModelAndView(new ExcelView(),map);
		return modelAndView;		
	}
	
	@RequestMapping(value="/excel2",method=RequestMethod.POST)
	public String excelView2(Model model,User user1) {
		User user = new User();
		user.setUsername("lvlv");
		user.setId(1);
		user.setPassword("123");
		user.setEmail("abc@def.com");
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		model.addAttribute("userList",users);		
		return "excelView";		
	}
}
