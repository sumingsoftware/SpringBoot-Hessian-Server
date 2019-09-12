package com.huawei.hesian.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.hesian.client.HelloWorldService;

@RestController
public class HelloController {
	@Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String test() {
        return helloWorldService.sayHello("Spring boot with Hessian.");
    }
}
