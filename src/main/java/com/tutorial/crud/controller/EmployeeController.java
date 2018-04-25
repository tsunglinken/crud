package com.tutorial.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * 員工管理
 */
@Controller
@RequestMapping("/crud/employee")
public class EmployeeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 員工清單 - 查詢首頁
     * @return
     */
    @RequestMapping(value="queryEmployeeHome", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView queryEmployeeHome() {
        ModelAndView modelAndView = new ModelAndView("/employee/queryHome");
        modelAndView.addObject("message", "員工清單 - 查詢首頁");

        return modelAndView;
    }

    /**
     * 員工清單 - 執行查詢 (依條件查詢)
     * @return
     */
    @RequestMapping(value="doQueryEmployee")
    public ModelAndView doQueryEmployee() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    /**
     * 員工清單 - 新增員工資料首頁
     * @return
     */
    @RequestMapping(value="addEmployeeHome", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView addEmployeeHome() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    /**
     * 員工清單 - 執行新增員工資料
     * @return
     */
    @RequestMapping(value="addEmployeeSubmit", method = RequestMethod.POST)
    public ModelAndView addEmployeeSubmit() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    /**
     * 員工清單 - 修改員工資料首頁
     * @return
     */
    @RequestMapping(value="modifyEmployeeHome", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView modifyEmployeeHome() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    /**
     * 員工清單 - 執行修改員工資料
     * @return
     */
    @RequestMapping(value="modifyEmployeeSubmit", method = RequestMethod.POST)
    public ModelAndView modifyEmployeeSubmit() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    /**
     * 員工清單 - 執行刪除員工資料
     * @return
     */
    @RequestMapping(value="deleteEmployeeSubmit", method = RequestMethod.POST)
    public ModelAndView deleteWorkSubmit() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

}