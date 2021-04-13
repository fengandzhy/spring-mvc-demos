package org.zhouhy.springmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class DataBindingController {
    
    @RequestMapping("/bindingDate1")
    public String bindingDate(@DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date dateTime){
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
}
