package com.funci.controller;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.alibaba.dubbo.config.annotation.Reference;
import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.common.domain.OrderExample;
import com.funci.demo.order.service.OrderService;
import com.ouyeel.xplat.i18n.util.I18nMessages;
import com.ouyeel.xplat.mvc.model.JQGridRequest;
import com.ouyeel.xplat.mvc.model.JQGridResponse;
import com.ouyeel.xplat.mvc.utils.JQGrid;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Reference
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.GET)
	public String query() {
		System.out.println("==========订单个数：" + orderService.findAll().size());
		return "demo/order";
	}
	
	
	@RequestMapping(value = "/pager",method = RequestMethod.GET)
	public String showOrder1() {
		System.out.println("==========订单个数：" + orderService.findAll().size());
		return "demo/order1";
	}
	
	

	public String update(Order order) {
		orderService.update(order);
		return "demo/order";
	}


	/** ==== DEMO ==== */

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public JQGridResponse queryCodeType(JQGridRequest request) {
		JQGrid.JQGridBuilder builder = JQGrid.of(request).withExampleType(OrderExample.class)
				.withTargetType(Order.class);
		OrderExample example = builder.buildExample();
		Integer count = orderService.getOrderCount(example);
		List<Order> result = orderService.getOrders(example, builder.getPage(), builder.getSize());
		return builder.buildResponse(result, count);
	}

	 /**
     * 测试用PageHelper插件实现分页
     * @param request
     * @return
     */
	@RequestMapping(value = "/queryPager", method = RequestMethod.GET)
	@ResponseBody
	public JQGridResponse queryForPager(JQGridRequest request) {
		JQGrid.JQGridBuilder builder = JQGrid.of(request).withExampleType(OrderExample.class)
				.withTargetType(Order.class);
		OrderExample example = builder.buildExample();
		Integer count = orderService.getOrderCount(example);
		List<Order> result = orderService.getOrdersForPage(example, builder.getPage(), builder.getSize());

		return builder.buildResponse(result, count);
	}

	/**
	 * 更新
	 */
	@RequestMapping(value = "/updateOneRow", method = RequestMethod.POST)
	@ResponseBody
	public int updateCodeTypeOneRow(@RequestBody Order order) {
		return orderService.updateOrderByOrder(order);
	}

	/**
	 * 删除单行
	 */
	@RequestMapping(value = "/delOneRow", method = RequestMethod.POST)
	@ResponseBody
	public int delCodeTypeOneRow(@RequestBody Map map) {
		String ename = (String) map.get("id");
		orderService.deleteOrderById(ename);
		return 1;
	}

	/**
	 * 删除多行
	 */
	@RequestMapping(value = "/delMultiRow", method = RequestMethod.POST)
	@ResponseBody
	public int delCodeTypeMultiRow(@RequestBody List<Map> list) {
		orderService.deleteOrdersById(list);
		return 1;
	}

	/**
	 * 新增单行
	 */
	@RequestMapping(value = "/addOneRow", method = RequestMethod.POST)
	@ResponseBody
	public int addCodeTypeOneRow(@RequestBody Order order) {
		return orderService.addOrder(order);
	}
	
	/**
	 * 国际化测试
	 * @return
	 */
	@RequestMapping(value = "/testI18n", method = RequestMethod.GET)
	public String testI18n() {
		System.out.println("=============I18nMessages.getText(String code, String defaultValue):"+I18nMessages.getText("hello", "未配置"));
		System.out.println("=============I18nMessages.getText(String code, String defaultValue):"+I18nMessages.getText("hello1", "未配置"));
		System.out.println("=============I18nMessages.getLocale():"+I18nMessages.getLocale());
		return "demo/testI18n";
	}



}
