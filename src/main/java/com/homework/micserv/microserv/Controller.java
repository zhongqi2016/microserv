package com.homework.micserv.microserv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public @ResponseBody
    FindDay256 mycontroller(@RequestParam String year){
        return  new FindDay256(year);
    }
}
