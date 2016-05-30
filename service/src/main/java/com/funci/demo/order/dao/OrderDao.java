package com.funci.demo.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.funci.demo.order.common.domain.Order;
import com.funci.demo.order.common.mapper.OrderMapper;

public interface OrderDao extends OrderMapper {

    @Select({
            "SELECT o.`ID`,o.`NAME` FROM t_order o"
    })
    @Results({
            @Result(column = "ID", property = "id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR)
    })
    List<Order> getAllOrders();

}
