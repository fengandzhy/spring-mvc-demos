package org.zhouhy.springmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhouhy.springmvc.editor.SpecialDateEditor;

import java.util.Date;

@Slf4j
@RestController
public class DataBindingController {
    
    @RequestMapping("/bindingDate1")
    public String bindingDate(Date date,Date dateTime){
        log.info(date.toString());
        log.info(dateTime.toString());
        return "success";
    }

    @RequestMapping("/bindingDate2")
    public String bindingDate(String date, String dateTime){
        log.info(date);
        log.info(dateTime);
        return "success";
    }

    @InitBinder
    public void initBinder(WebDataBinder b) {
        b.registerCustomEditor(Date.class, new SpecialDateEditor());
    }
}
