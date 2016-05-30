package com.funci.demo.order.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.common.domain.OrderExample;
import com.funci.demo.order.common.mapper.OrderMapper;
import com.funci.demo.order.service.OrderService;
import com.github.pagehelper.PageHelper;

/**
 * 实现api定义的查询接口
 */
@Service(protocol = {"dubbo"})
@Transactional
@Path("order")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Path("query")
    public List<Order> findAll() {
        OrderExample oe = new OrderExample();
        oe.createCriteria().andOrderIdEqualTo("001");
        List<Order> orders = orderMapper.selectByExample(oe);
        return orders;
    }

    @Path("create")
    @Override
    public int create(Order order) {
        return orderMapper.insert(order);
    }

//    @Path("update")
    @Override
    public int update(Order order) {
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Path("delete")
    @Override
    public int deleteById(String orderId) {
        return orderMapper.deleteByPrimaryKey(orderId);
    }


    /**
     * 查询订单总量
     * @param example
     * @return
     */
    @Override
    public int getOrderCount(OrderExample example) {
        return orderMapper.countByExample(example);
    }

    /**
     * 分页查询
     * @param example
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<Order> getOrders(OrderExample example, int page, int size) {
        RowBounds rowBounds = new RowBounds(page * size, size);
        return orderMapper.selectByExampleWithRowbounds(example, rowBounds);
    }
    
    /**
     * 使用PageHelper进行分页查询
     * @param example
     * @param page
     * @param size
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<Order> getOrdersForPage(OrderExample example, int page, int size) {
      List<Order> list1 = orderMapper.selectByExample(example);
      PageHelper.startPage(page+1, size);//pageNum,pageSize,
      List<Order> list = orderMapper.selectByExample(example);
      return list;

    }

    @Path("update")
    @Override
    public int updateOrderByOrder(Order order) {
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Path("delete")
    @Override
    public int deleteOrderById(String orderId) {
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    @Path("delete")
    @Override
    public int deleteOrdersById(List<Map> list) {
        for (int i = 0; i < list.size(); i++) {
            String ename = (String) list.get(i).get("orderId");
            orderMapper.deleteByPrimaryKey(ename);
        }

        return 0;
    }

    @Override
    public int addOrder(Order order) {
//        return orderMapper.insertSelective(order);
        return orderMapper.insert(order);
    }

    

    /**
     * 事务提交-成功
     */
    @Override
    public void transaction1() {
      Order order = new Order();
      order.setOrderId("1-0");
      order.setName("事务1");
      this.addOrder(order);
      
      order.setOrderId("1-1");
      order.setName("事务2");
      this.addOrder(order);
    }
    
    /**
     * 事务提交-不成功
     */
    @Override
    public void transaction2() {
      Order order = new Order();
      order.setOrderId("2-0");
      order.setName("事务1");
      this.addOrder(order);
      
      order.setOrderId("2-0");
      order.setName("事务2");
      this.addOrder(order);
    }
    
    /**
     * 不需要事务提交
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void transaction3() {
    	 Order order = new Order();
         order.setOrderId("3-0");
         order.setName("事务1");
         this.addOrder(order);
         
         order.setOrderId("3-0");
         order.setName("事务2");
         this.addOrder(order);
    }

}
