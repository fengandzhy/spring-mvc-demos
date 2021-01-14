package org.zhouhy.springmvc.demo01.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class IndexController {
    
    @RequestMapping(value={"","/","/index"})
    public String index(){
        return "index";
    }
}
