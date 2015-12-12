package com.samao.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by samao on 12/12/15.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String showMessage(){
        return "main";
    }
}
