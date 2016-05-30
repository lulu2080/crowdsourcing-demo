package com.funci.demo.order.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Path;

import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.common.domain.OrderExample;

@Path("order")
//@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface OrderService {
	
	List<Order> findAll();

    
	int create(@BeanParam Order order);
    
    
    int update(Order order);
    
    
    int deleteById(String orderId);


    public int getOrderCount(OrderExample example);

    public List<Order> getOrders(OrderExample example, int page, int size);
    public List<Order> getOrdersForPage(OrderExample example, int page, int size);

    int updateOrderByOrder(Order order);

    int deleteOrderById(String orderId);

    int deleteOrdersById(List<Map> list);

    int addOrder(Order order);
    
    void transaction1();
    
    void transaction2();
    
    void transaction3();


}
