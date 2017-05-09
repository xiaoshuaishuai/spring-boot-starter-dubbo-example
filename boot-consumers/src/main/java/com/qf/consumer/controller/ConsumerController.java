package com.qf.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.qf.api.IHelloService;

@RestController
public class ConsumerController {
	// timeout表示dubbo超时时间，单位为ms
    @DubboConsumer(timeout = 1000)
	IHelloService hello;
	
	@RequestMapping(value="/h")
	@ResponseBody
	public String hello()
	{
		return hello.sayHello("shuaishuai");
	}
}
