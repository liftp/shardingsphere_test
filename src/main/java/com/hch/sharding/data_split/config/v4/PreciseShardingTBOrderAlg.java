package com.hch.sharding.data_split.config.v4;
// package com.macro.mall.data_split.config;

// import java.util.Collection;

// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

// 4.x.x实现使用
// public class PreciseShardingTBOrderAlg implements PreciseShardingAlgorithm<Integer> {

//     @Override
//     public String doSharding(Collection<String> tableNames, PreciseShardingValue<Integer> shardingValue) {
        
//         for (String table : tableNames) {
//             if (table.endsWith(String.valueOf(shardingValue.getValue() % tableNames.size()))) {
//                 System.out.println("table name is : " + table);
//                 return table;
//             }
//         }
//         throw new UnsupportedOperationException();
//     }
    
// }
