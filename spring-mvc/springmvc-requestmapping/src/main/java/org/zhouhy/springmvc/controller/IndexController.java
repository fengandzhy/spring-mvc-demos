package org.zhouhy.springmvc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="demo01")
public class IndexController {

    @RequestMapping(value={"","/","index"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    
    /**
     * view/* 表示单层目录
     * */
    //**/msg 表示两层及以上目录
    @RequestMapping(value = {            
            "/page",
            "page*",
            "view/*",
            "**/msg"
    })
    public String indexMultipleMapping() {
        return "Hello from index multiple mapping.";
    }

    //
    /**
     * http://localhost:8080/demo01/id?id=3 这里的id=3就被映射到了personId上
     * 
     * 
     * */
    @RequestMapping(value = "/id")
    String getIdByValue(@RequestParam("id") String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL with value element";
    }

    /**
     * http://localhost:8080/demo01/personId?personId=3 这里的personId=3就被映射到了personId上
     * 由于这个地址栏里的参数名和这个函数的参数名相等,注解的 value 这个参数就可省掉了
     *
     *
     * */
    @RequestMapping(value = "/personId")
    String getId(@RequestParam String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL without value element";
    }

    
    
}
