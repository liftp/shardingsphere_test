package com.hch.sharding.data_split.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hch.sharding.data_split.dto.Order;
import com.hch.sharding.data_split.dto.RequestIdsBody;
import com.hch.sharding.data_split.dto.RequestRangeSelect;
import com.hch.sharding.data_split.mapper.OrderMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController("order")
@Api(tags = "OrderController", description = "订单管理")
@Tag(name = "OrderController", description = "订单管理")
public class OrderController {


    // 简化操作直接暴力注入mapper
    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/selectOrderInIds")
    @ApiOperation("订单in查询")
    public String selectOrderInIds(@RequestBody RequestIdsBody body) {
        List<Order> list = orderMapper.findOrderInIds(body.getIds(), body.getBuyers().get(0));
        list.forEach(e -> System.out.println(e));
        return "ok";
    }    
    
    @PostMapping("/findOrderById")
    @ApiOperation("订单查询")
    public String findOrderById(@RequestBody RequestIdsBody body) {
        List<Order> list = orderMapper.findOrderById(body.getIds().get(0), body.getBuyers().get(0));
        list.forEach(e -> System.out.println(e));
        return "ok";
    }

    @PostMapping("/selectRangeByIds")
    @ApiOperation("范围查询")
    public String selectRangeByIds(@RequestBody RequestRangeSelect range) {
        orderMapper.findOrderByIdRange(range.getIdLow(), range.getIdHigh(), range.getBuyer());
        return "ok";
    }
    
}
