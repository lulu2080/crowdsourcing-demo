package com.funci.demo.order.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.common.domain.OrderExample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Tag;

@Path("order")
@Api(value = "/order", description = "订单管理服务")
public interface OrderService {
	
    @ApiOperation(value = "分页查找指定条件的订单", notes = "使用PageHelper进行分页查询", response = Tag.class, responseContainer = "List")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "符合条件的订单列表")})
    @RequestMapping(value = "/{id}/list", method = RequestMethod.GET)	
    public List<Order> getOrdersForPage(OrderExample example, int page, int size);
	
	List<Order> findAll();

    
	int create(@BeanParam Order order);
    
    
    int update(Order order);
    
    
    int deleteById(String orderId);


    public int getOrderCount(OrderExample example);

    public List<Order> getOrders(OrderExample example, int page, int size);

    int updateOrderByOrder(Order order);

    int deleteOrderById(String orderId);

    int deleteOrdersById(List<Map> list);

    int addOrder(Order order);
    
    void transaction1();
    
    void transaction2();
    
    void transaction3();


}
