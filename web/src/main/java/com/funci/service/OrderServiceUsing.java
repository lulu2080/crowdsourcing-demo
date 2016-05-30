package com.funci.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.service.OrderService;

@Service
public class OrderServiceUsing {
	@Reference
	private OrderService orderService;
	
	public void test() {
		List<Order> orders = orderService.findAll();
		System.out.println();
		System.out.println("======test start=====");
		System.out.println("======test value:" + orders.size());
		System.out.println("======test end=====");
		System.out.println();

	}
}
