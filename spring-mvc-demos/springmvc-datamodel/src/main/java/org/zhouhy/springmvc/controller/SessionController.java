package org.zhouhy.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.zhouhy.springmvc.bean.User;


/**
 * 	@SessionAttributes ֻ�ܷ�����ļ����ϣ����ܷ�������ķ�����
 * 	value= {"name","user"} ��˼�ǰ�requestScope��������Ϊname �� user������attribute
 * 	���뵽sessionScope��
 * */
@SessionAttributes(value= {"name","user"})
@Controller
@RequestMapping(value="/session")
public class SessionController {
	
	@RequestMapping("/model")
	public String modelMethod(Model model){
		
		model.addAttribute("name", "xiaobai");
		
		User user = new User();
		user.setUsername("lvlv");
		user.setId(1);
		user.setAge(10);
		model.addAttribute("user",user);
		
		
//		User user1 = new User();
//		user1.setUsername("benca");
//		user1.setId(2);
//		user1.setAge(10);
//		
//		List<User> list = new ArrayList<>();
//		list.add(user);
//		list.add(user1);		
//		model.addAttribute("userList",list);
//		
//		Map<String,User> map1 = new HashMap<>();
//		map1.put("user1", user);
//		map1.put("user2", user1);
//		model.addAttribute("userMap",map1);
		
		return "success1";
	}
}
