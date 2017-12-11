package org.cc.controller;

import org.api.entity.Fruit;
import org.api.service.FruitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class TestController {
	@Reference(version="1.0.0")
	private FruitService fruitService;
	
	@RequestMapping(value="/test")
	public String test() {
		fruitService.addFruit(new Fruit());
		return "成功";
	}
}
