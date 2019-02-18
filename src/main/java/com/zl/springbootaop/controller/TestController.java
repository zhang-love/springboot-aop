package com.zl.springbootaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-18 10:53
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "aab";
    }
}
