package com.lahand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class HomeController {
	
    @RequestMapping
    public ModelAndView index(ModelAndView modelAndView) {
        return new ModelAndView("/home/index");
    }
}
