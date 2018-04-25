package com.tutorial.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首頁管理
 */
@Controller
@RequestMapping("/")
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 首頁
     * @return
     */
    @RequestMapping(value="index", method = {RequestMethod.GET})
    public ModelAndView queryEmployeeHome() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("message", "Good morning !");

        return modelAndView;
    }
}
