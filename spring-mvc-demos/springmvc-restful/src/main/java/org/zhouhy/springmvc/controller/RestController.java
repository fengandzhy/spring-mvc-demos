package org.zhouhy.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhouhy.springmvc.model.User;
import org.zhouhy.springmvc.service.UserService;

@RequestMapping(value="/restfultest")
@Controller
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/testPut",method=RequestMethod.PUT)
	public String testPut() {
		System.out.println("In testPut");
		return "redirect:/success";
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String getAllUsers(Model model) {
		List<User> users = userService.getAll();
		model.addAttribute("users", users);
		return "users";
		
	}
}
