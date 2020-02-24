package org.zhouhy.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhouhy.springmvc.model.Department;
import org.zhouhy.springmvc.model.User;
import org.zhouhy.springmvc.service.DepartmentService;
import org.zhouhy.springmvc.service.UserService;

@RequestMapping(value="/restfultest")
@Controller
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService departmentService;
	
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
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public String updateUserView(@PathVariable("id") Integer id,Model model) {
		if(id!=null) {
			User user = userService.getOneById(id);
			model.addAttribute("user",user);
		}
		List<Department> dList = departmentService.getAll();
		model.addAttribute("dpts",dList);//与页面当中的变量一致items="${dpts}"
		return "updateUser";
	}
	
	@RequestMapping(value="/users",method=RequestMethod.PUT)
	public String updateUser(User user) {
		System.out.println(user);
		User ouser = userService.getOneById(user.getId());
		Department department = departmentService.getOneById(user.getDpt().getId());
		
		ouser.setPassword(user.getPassword());
		ouser.setDpt(department);
		
		userService.update(ouser);
		return "redirect:/restfultest/users";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String createUserView(Model model) {
		model.addAttribute("command", new User());
		List<Department> dList = departmentService.getAll();
		model.addAttribute("dpts",dList);//与页面当中的变量一致items="${dpts}"
		return "addUser";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String createUser(User user) {
		userService.add(user);
		return "redirect:/restfultest/users";
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id") Integer id) {
		if(id!=null) {
			userService.delete(id);
		}
		return "redirect:/restfultest/users";
	}
}
