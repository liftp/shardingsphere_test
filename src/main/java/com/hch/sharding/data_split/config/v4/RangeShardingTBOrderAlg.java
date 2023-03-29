package com.hch.sharding.data_split.config.v4;
// package com.macro.mall.data_split.config;

// import java.util.Collection;
// import java.util.LinkedHashSet;
// import java.util.Set;

// import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
// import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

// import com.google.common.collect.Range;

// import ch.qos.logback.classic.db.names.TableName;

// 4.x.x实现使用
// public class RangeShardingTBOrderAlg implements RangeShardingAlgorithm<Integer>{

//     @Override
//     public Collection<String> doSharding(Collection<String> tableNames,
//             RangeShardingValue<Integer> shardingValue) {
//         Set<String> result = new LinkedHashSet<>();
//         int lower = shardingValue.getValueRange().lowerEndpoint();
//         int upper = shardingValue.getValueRange().upperEndpoint();
//         // 20w范围查询
//         if (upper - lower > 200000) {
//             return tableNames;
//         }
//         // 超过查询范围不支持
//         throw new UnsupportedOperationException();
//     }
    
// }
