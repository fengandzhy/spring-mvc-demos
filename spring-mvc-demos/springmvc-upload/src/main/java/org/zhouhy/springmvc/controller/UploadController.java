package org.zhouhy.springmvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String upload(@RequestParam("mark") String mark,
			@RequestParam("file") MultipartFile file,
			HttpServletRequest request) throws IllegalStateException, IOException {
		if(!file.isEmpty()) {
			String path = request.getServletContext().getRealPath("/resources/uploadFiles/");
			//String path = request.getServletContext().getContextPath();
			System.out.println(path);
			String filename = file.getOriginalFilename();
			File filepath = new File(path,filename);
			if(!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			file.transferTo(filepath);			
		}
		return "redirect:/index";
	}
}
