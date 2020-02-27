package org.zhouhy.springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhouhy.springmvc.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value="json")
public class JsonController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public void getJson1(HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json;charset=utf-8");
		resp.setHeader("pragma","no-cache");
		resp.setHeader("cache-control","no-cache");
		List<User> users = getUsers();
		ObjectMapper mapper = new ObjectMapper();
		String strJson = mapper.writeValueAsString(users);
		System.out.println(strJson);
		PrintWriter out = resp.getWriter();
		out.write(strJson);
	}
	
	/**
	 * 这种方法传过去，返回端必须要有接收的东西
	 * */
	@ResponseBody
	@RequestMapping(value="/test2",method=RequestMethod.POST)
	public List<User> getJson2(HttpServletResponse resp) throws IOException  {
//		resp.setContentType("application/json;charset=utf-8");
//		resp.setHeader("pragma","no-cache");
//		resp.setHeader("cache-control","no-cache");
		List<User> users = getUsers();
//		ObjectMapper mapper = new ObjectMapper();
//		String strJson = mapper.writeValueAsString(users);
//		System.out.println(strJson);
//		PrintWriter out = resp.getWriter();
//		out.write(strJson);
		return users;
	}
	
	private List<User> getUsers(){
		List<User> users = new ArrayList<>();
		User user1 = new User(1,"sam","123","as@123.com");
		User user2 = new User(2,"frank","456","bb@123.com");
		users.add(user1);
		users.add(user2);
		return users;
	}
}
