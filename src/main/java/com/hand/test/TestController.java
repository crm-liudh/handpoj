package com.hand.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dinghuai.liu
 */
@Controller
public class TestController {

    @RequestMapping("/api/v1/test1")
    public String test1(HttpServletRequest request){
        request.setAttribute("a", "hello hand!");
        return "index";
    }

    @RequestMapping("/api/v1/test2")
    @ResponseBody
    public Object test2(HttpServletRequest request){
        String a = "1";
        return a;
    }
}
