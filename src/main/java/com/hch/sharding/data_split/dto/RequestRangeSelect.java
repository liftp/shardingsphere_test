package com.hch.sharding.data_split.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("范围查询")
public class RequestRangeSelect {
    
    private Integer idLow;

    private Integer idHigh;

    private Integer buyer;
}
