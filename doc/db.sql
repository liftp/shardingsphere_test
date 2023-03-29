CREATE DATABASE ds0
    DEFAULT CHARACTER SET = 'utf8mb4';

CREATE DATABASE ds1
    DEFAULT CHARACTER SET = 'utf8mb4';

-- 两个库ds0,ds1,每个库中order为两份t_order0和t_order1
use ds0;
CREATE TABLE t_order0 (  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    goods_name VARCHAR(25) COMMENT '商品名称',
    goods_num  BIGINT COMMENT '商品数量',
    goods_info VARCHAR(100) COMMENT '商品详情',
    order_amt DECIMAL(10, 2) COMMENT '订单金额',
    buyer VARCHAR(20) COMMENT '采购人'
) COMMENT '';

CREATE TABLE t_order1 (  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    goods_name VARCHAR(25) COMMENT '商品名称',
    goods_num  BIGINT COMMENT '商品数量',
    goods_info VARCHAR(100) COMMENT '商品详情',
    order_amt DECIMAL(10, 2) COMMENT '订单金额',
    buyer VARCHAR(20) COMMENT '采购人'
) COMMENT '';

use ds1;
CREATE TABLE t_order0 (  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    goods_name VARCHAR(25) COMMENT '商品名称',
    goods_num  BIGINT COMMENT '商品数量',
    goods_info VARCHAR(100) COMMENT '商品详情',
    order_amt DECIMAL(10, 2) COMMENT '订单金额',
    buyer VARCHAR(20) COMMENT '采购人'
) COMMENT '';

CREATE TABLE t_order1 (  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary Key',
    create_time DATETIME COMMENT 'Create Time',
    goods_name VARCHAR(25) COMMENT '商品名称',
    goods_num  BIGINT COMMENT '商品数量',
    goods_info VARCHAR(100) COMMENT '商品详情',
    order_amt DECIMAL(10, 2) COMMENT '订单金额',
    buyer VARCHAR(20) COMMENT '采购人'
) COMMENT '';