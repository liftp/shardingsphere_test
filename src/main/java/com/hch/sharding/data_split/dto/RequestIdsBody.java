package com.hch.sharding.data_split.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ids请求实体")
public class RequestIdsBody {
    
    @ApiModelProperty(value = "ids", notes = "需要转为Integer求模")
    private List<Integer> ids;

    @ApiModelProperty(value = "buyers", notes = "需要转为Integer求模")
    private List<Integer> buyers;
}
