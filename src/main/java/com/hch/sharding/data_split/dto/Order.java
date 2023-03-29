package com.hch.sharding.data_split.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Order {
    
    private Integer id;

    private Date createTime;

    private String goodsName;
    private Integer goodsNum;
    private String goodsInfo;
    private BigDecimal orderAmt;
    private String buyer;

    
}
