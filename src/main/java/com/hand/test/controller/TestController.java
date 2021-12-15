package com.hand.test.controller;

import com.hand.test.dto.People;
import com.hand.test.service.PeopleService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dinghuai.liu
 */
@Controller
public class TestController {

    @Autowired
    private PeopleService peopleService;

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

    @RequestMapping("/api/v1/test3")
    @ResponseBody
    public String test3(HttpServletRequest request){
        People people = peopleService.initUser();
        Map<String, Object> result = new HashMap<>(16);
        result.put("name", people.getUserName());
        result.put("password", people.getPassword());
        JSONObject JSONObj = JSONObject.fromObject(result);
        return JSONObj.toString();

    }
}
