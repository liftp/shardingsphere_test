package com.hch.sharding.data_split.config.v5;

import java.util.Collection;
import java.util.Properties;

import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyShardingAlg implements StandardShardingAlgorithm<Integer> {

    @Override
    public Properties getProps() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(Properties props) {
        // TODO Auto-generated method stub
        
    }

    /**
     * 精确值分片+in
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        Integer val = shardingValue.getValue();
        String mod = String.valueOf(val%availableTargetNames.size());
        for (String name : availableTargetNames) {
            if (name.endsWith(mod)) {
                log.info("取表名：%s", name);
                return name;
            }
        }
        throw new UnsupportedOperationException();
    }

    /**
     * 实现between and (>、>=、<、<=)
     */
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames,
            RangeShardingValue<Integer> shardingValue) {
        // 全部表查询
        return availableTargetNames;
    }
    
}
