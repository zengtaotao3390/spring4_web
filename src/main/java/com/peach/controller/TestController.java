package com.peach.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by zengtao on 2016/10/17.
 */
@RestController
public class TestController {


    /**
     * 使用总结，必须要在这个rest接口中加入HttpSession那么才可以实现这个session共享
     *
     */
    @RequestMapping(value = "peach", method = RequestMethod.GET)
    public String peach(HttpSession session) throws Exception {
        return "123";
    }

}
