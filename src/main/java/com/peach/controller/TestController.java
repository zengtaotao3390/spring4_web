package com.peach.controller;

import com.peach.service.PeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zengtao on 2016/10/17.
 */
@RestController
public class TestController {


    /**
     * 使用总结，必须要在这个rest接口中加入HttpSession那么才可以实现这个session共享
     */
    @Autowired
    PeachService peachService;

    @RequestMapping(value = "peach", method = RequestMethod.GET)
    public String peach(HttpSession session, @RequestParam("ip") String resIp) throws Exception {
        String ip = peachService.hello(resIp, "3456");
        System.out.println(ip);
        return ip + "=============123";
    }

       @RequestMapping(value = "peach1", method = RequestMethod.GET)
    public String peach1(HttpSession session) throws Exception {
        String ip = peachService.hello1("123", "3456");
        return ip + "=============123";
    }
    @RequestMapping(value = "testControllerError", method = RequestMethod.GET)
    public String testControllerError() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.get("123").toString();
        return "123";
    }


}
