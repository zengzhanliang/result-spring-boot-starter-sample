package com.zeng.result.controller;

import com.zeng.annotation.NonResultCovert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 * @author zengzhanliang
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test() {
        return "sss";
    }

    @NonResultCovert
    @RequestMapping(value = "/testAnnotation",method = RequestMethod.GET)
    @ResponseBody
    public Object testAnnotation() {
        return "sss";
    }

    @RequestMapping(value = "/testError",method = RequestMethod.GET)
    @ResponseBody
    public Object testError() {

        int a = 1/0;

        return "sss" + a;
    }

    @NonResultCovert
    @RequestMapping(value = "/testErrorAnnotation",method = RequestMethod.GET)
    @ResponseBody
    public Object testErrorAnnotation() {

        int a = 1/0;

        return "sss" + a;
    }
}
