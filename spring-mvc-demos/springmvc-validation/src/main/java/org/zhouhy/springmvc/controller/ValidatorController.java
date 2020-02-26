package org.zhouhy.springmvc.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.zhouhy.springmvc.model.User;

@Controller
@RequestMapping("/validator")
public class ValidatorController {
	
	/**
	 * errResult与user 必须挨到一块，否则无法让user的校验结果存入errResult
	 * */
	@RequestMapping(value="/valid",method=RequestMethod.POST)
	public String valid(@Valid User user,BindingResult errResult,Model model) {
		if(errResult.getFieldErrorCount()>0) {
			System.out.println("数据有误");
			for(FieldError fe:errResult.getFieldErrors()) {
				System.out.println(fe.getField()+":"+fe.getDefaultMessage());
			}
			model.addAttribute("command", new User());
			return "index";
		}
		return "success";
	}
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) throws Exception {  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		df.setLenient(false);
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);		
		binder.registerCustomEditor(Date.class, dateEditor);		
	}
	
}
