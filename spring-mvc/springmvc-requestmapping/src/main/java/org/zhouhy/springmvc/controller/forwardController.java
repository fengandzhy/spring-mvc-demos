package org.zhouhy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class forwardController {
    
    @RequestMapping(value={"","/"})
    public String index(){
        return "index";
    }
}
