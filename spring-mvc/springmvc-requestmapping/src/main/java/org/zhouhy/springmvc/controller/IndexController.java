package org.zhouhy.springmvc.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping(value="/demo01")
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
    public String getIdByValue(@RequestParam("id") String personId) {
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
    public String getId(@RequestParam String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL without value element";
    }

    @RequestMapping(value = "/person1")
    public String getPerson(@RequestParam(value="person",required = false) String name) {
        //log.info("name is " + name);
        log.info("abc");
        return "Get ID from query string of URL without value element";
    }

    @RequestMapping(value = "/person2")
    public String getName(@RequestParam(value = "person", defaultValue = "John") String personName) {
        log.info("name is "+personName);
        return "Required element of request param";
    }

    /**
     * 如果浏览器支持解析application/JSON 类型的数据, 则就转发
     * */
    @RequestMapping(value = "/prod", produces = {
            "application/JSON"
    })
    @ResponseBody
    public String getProduces() {
        return "Produces attribute";
    }

    
    /**
     * contentType 必须是application/JSON 和 application/XML 才会被这个方法受理
     * */
    @RequestMapping(value = "/cons", consumes = {
            "application/JSON",
            "application/XML"
    })
    public String getConsumes() {
        return "Consumes attribute";
    }

    /**
     * 请求参数必须包含personId,才会处理请求
     * */
    @RequestMapping(value = "/fetch", params = {
            "personId"
    })
    public String getParams(@RequestParam("personId") String id) {
        return "Fetched parameter using params attribute = " + id;
    }


    /**
     * 1. 引入这个RequestMappingHandlerMapping
     * 2. 定义一个name属性
     * 3. 前台写成${s:mvcUrl('getNames').arg(0,'3').arg(1,'5').build()}就可以访问到这个方法了
     * */
    @RequestMapping(value = "/name", name = "getNames")
    public String getNames(@RequestParam("personId") String id,@RequestParam("personName") String name) {
        return "Fetched parameter using params attribute = " + id+","+name;
    }
    
}
