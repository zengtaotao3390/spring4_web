package com.peach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @RequestMapping("/setsession")
    @ResponseBody
    public void setSession(HttpSession session, String name) {
        session.setAttribute("name", name);
    }

    @RequestMapping(value = "/getsession",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getSession(HttpSession session, HttpServletRequest req) {
        return session.getAttribute("name").toString()+"-----"+"110" + "id:"  + session.getId();
    }
}