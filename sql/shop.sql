/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.20-log : Database - shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shop`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendor_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `content` varchar(400) DEFAULT NULL COMMENT '评论内容',
  `type` varchar(10) DEFAULT NULL COMMENT '发送人 1商户 2用户',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `product_type` */

DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `status` varchar(20) DEFAULT NULL COMMENT '状态 0禁用 1启用',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `sort` int(11) DEFAULT NULL COMMENT '排序权重',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_type` */

/*Table structure for table `sys_order` */

DROP TABLE IF EXISTS `sys_order`;

CREATE TABLE `sys_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendor_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_name` varchar(200) DEFAULT NULL COMMENT '商品名字',
  `product_cash` int(20) DEFAULT NULL COMMENT '商品金额(单位:分)',
  `product_num` int(11) DEFAULT NULL COMMENT '商品数量',
  `status` varchar(11) DEFAULT NULL COMMENT '订单状态 1交易成功 2交易关闭 3未付款 4配送中',
  `postage` int(20) DEFAULT NULL COMMENT '运费(单位:分)',
  `adress` varchar(100) DEFAULT NULL COMMENT '收货地址',
  `receiver_name` varchar(20) DEFAULT NULL COMMENT '收货人名字',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_order` */

/*Table structure for table `sys_pic` */

DROP TABLE IF EXISTS `sys_pic`;

CREATE TABLE `sys_pic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(200) DEFAULT NULL COMMENT '路径',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_pic` */

/*Table structure for table `sys_product` */

DROP TABLE IF EXISTS `sys_product`;

CREATE TABLE `sys_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) DEFAULT NULL COMMENT '商品名字',
  `product_price` int(20) DEFAULT NULL COMMENT '价格(单位:分)',
  `product_num` int(11) DEFAULT NULL COMMENT '库存数量',
  `product_desc` varchar(200) DEFAULT NULL COMMENT '商品描述',
  `product_pic_item` varchar(20) DEFAULT NULL COMMENT '商品图片id ,隔开',
  `vendor_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `postage` int(20) DEFAULT NULL COMMENT '运费(单位:分)',
  `status` varchar(10) DEFAULT NULL COMMENT '状态 0售罄 1在库 2下架',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_product` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `online_state` int(10) DEFAULT NULL COMMENT '是否禁用  0禁用 1启用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_permission` */

DROP TABLE IF EXISTS `sys_role_permission`;

CREATE TABLE `sys_role_permission` (
  `id` bigint(20) DEFAULT NULL,
  `permission` varchar(50) DEFAULT NULL COMMENT '后端接口',
  `url` varchar(100) DEFAULT NULL COMMENT '权限名称',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_permission` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `realname` varchar(20) DEFAULT NULL COMMENT '名字',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `pic_id` varchar(400) DEFAULT NULL COMMENT '头像图片路径',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `role_id` varchar(20) DEFAULT NULL COMMENT '角色id',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `desc` varchar(200) DEFAULT NULL COMMENT '个人描述',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

/*Table structure for table `user_vendor_conversation` */

DROP TABLE IF EXISTS `user_vendor_conversation`;

CREATE TABLE `user_vendor_conversation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendor_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `content` bigint(20) DEFAULT NULL COMMENT '对话内容',
  `sender_type` varchar(10) DEFAULT NULL COMMENT '发送人 1商户 2用户',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_vendor_conversation` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
