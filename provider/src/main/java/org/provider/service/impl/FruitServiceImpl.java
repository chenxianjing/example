package org.provider.service.impl;

import org.api.entity.Fruit;
import org.api.service.FruitService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class FruitServiceImpl implements FruitService {

	public boolean addFruit(Fruit fruit) {
		System.out.println("测试添加水果成功");
		return false;
	}

}
