package com.peach.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zengtao on 2016/10/17.
 */
public class TestController {

    @RequestMapping(value = "peach", method = RequestMethod.POST)
    public String peach() throws Exception {
        return "123";
    }

}
