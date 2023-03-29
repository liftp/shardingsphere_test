package com.hch.sharding.data_split.config.v4;
// package com.macro.mall.data_split.config;

// import java.util.Collection;
// import java.util.LinkedHashSet;
// import java.util.Set;

// import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
// import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

// 4.x.x实现使用
// public class RangeShardingDBAlg implements RangeShardingAlgorithm<Integer> {

//     @Override
//     public Collection<String> doSharding(Collection<String> dbNames,
//             RangeShardingValue<Integer> shardingValue) {
//         Set<String> result = new LinkedHashSet<>();
//         int lower = shardingValue.getValueRange().lowerEndpoint();
//         int upper = shardingValue.getValueRange().upperEndpoint();

//         for (int i = lower; i <= upper; i++) {
//             for (String db : dbNames) {
//                 if (db.endsWith(i % dbNames.size() + "")) {
//                     result.add(db);
//                 }
                
//             }
//         }
        
//         return null;
//     }
    
// }
