package com.qf.api.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.api.IHelloService;
@Component
@Service(interfaceClass = IHelloService.class)
public class HelloService implements IHelloService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello,"+name;
	}

}
