package com.hch.sharding.data_split.config.v4;
// package com.macro.mall.data_split.config;

// import java.util.Collection;

// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

// // 4.x.x实现使用
// public class PreciseShardingDBAlg implements PreciseShardingAlgorithm<Integer> {

//     @Override
//     public String doSharding(Collection<String> dbNames, PreciseShardingValue<Integer> shardingValue) {
//         for (String db : dbNames) {
//             if (db.endsWith(String.valueOf(shardingValue.getValue() % dbNames.size()))) {
//                 System.out.println("db name is : " + db);
//                 return db;
//             }
//         }
//         throw new UnsupportedOperationException();
//     }

    
// }
