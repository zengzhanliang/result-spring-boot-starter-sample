package com.zeng.result.controller;

import com.zeng.annotation.NonResultCovert;
import com.zeng.result.model.Args;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/testArgs",method = RequestMethod.GET)
    @ResponseBody
    public Object testArgs( String id, String name ) {
        return "id : " + id + ", name: " + name;
    }

    @RequestMapping(value = "/testArgsObject",method = RequestMethod.POST)
    @ResponseBody
    public Object testArgsObject(@RequestBody Args args) {
        return "id : " + args.getId() + ", name: " + args.getName();
    }
}
