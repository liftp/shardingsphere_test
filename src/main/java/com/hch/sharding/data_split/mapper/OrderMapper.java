package com.hch.sharding.data_split.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hch.sharding.data_split.dto.Order;

@Mapper
public interface OrderMapper {

    // @Select("select id, create_time, goods_name, goods_num, order_amt, buyer from t_order " + 
    //     "where id in ")
    List<Order> findOrderInIds(@Param("list")List<Integer> list, @Param("buyer")Integer buyer);

    @Select("select id, create_time, goods_name, goods_num, order_amt, buyer " +
        " from t_order " + 
        " where id = #{id} and buyer=#{buyer}")
    List<Order> findOrderById(@Param("id") Integer id, @Param("buyer")Integer buyer);

    @Select("select id, create_time, goods_name, goods_num, order_amt, buyer " +
        " from t_order " + 
        " where id > #{idLow} and id < #{idHigh} and buyer=#{buyer}")
    List<Order> findOrderByIdRange(@Param("idLow") Integer idLow, @Param("idHigh") Integer idHigh, @Param("buyer")Integer buyer);

    
}
