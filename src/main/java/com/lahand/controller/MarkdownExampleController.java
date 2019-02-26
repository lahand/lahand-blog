package com.lahand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/markdownExample")
public class MarkdownExampleController {
	
    @RequestMapping(value = "/full")
    public ModelAndView full() {
        return new ModelAndView("/markdownExample/full");
    }
}
