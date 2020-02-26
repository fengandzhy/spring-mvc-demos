package org.zhouhy.springmvc.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhouhy.springmvc.editor.CustomBigDecimalEditor;
import org.zhouhy.springmvc.model.Product;

@Controller
@RequestMapping(value="initbinder")
public class InitbinderController {
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) throws Exception {  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		df.setLenient(false);
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		CustomBigDecimalEditor bigDecimalEditor = new CustomBigDecimalEditor();
		binder.registerCustomEditor(Date.class, dateEditor);
		binder.registerCustomEditor(BigDecimal.class, bigDecimalEditor);
	}
	
	@RequestMapping(value="test",method=RequestMethod.POST)
	public String bindtest(Product product){
		System.out.print(product);
		return "index";
	}
}
