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
  `vendorid` bigint(20) DEFAULT NULL COMMENT '商户id',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `productid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `content` varchar(400) DEFAULT NULL COMMENT '评论内容',
  `senderType` varchar(10) DEFAULT NULL COMMENT '发送人 1商户 2用户',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `conversation` */

DROP TABLE IF EXISTS `conversation`;

CREATE TABLE `conversation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendorid` bigint(20) DEFAULT NULL COMMENT '商户id',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `content` bigint(20) DEFAULT NULL COMMENT '对话内容',
  `sendertype` varchar(10) DEFAULT NULL COMMENT '发送人 1商户 2用户',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `conversation` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendorid` bigint(20) DEFAULT NULL COMMENT '商户id',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `productid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `productname` varchar(200) DEFAULT NULL COMMENT '商品名字',
  `product_cash` int(20) DEFAULT NULL COMMENT '商品金额(单位:分)',
  `product_num` int(11) DEFAULT NULL COMMENT '商品数量',
  `status` varchar(11) DEFAULT NULL COMMENT '订单状态 1交易成功 2交易关闭 3未付款 4配送中',
  `postage` int(20) DEFAULT NULL COMMENT '运费(单位:分)',
  `adress` varchar(100) DEFAULT NULL COMMENT '收货地址',
  `receiver` varchar(20) DEFAULT NULL COMMENT '收货人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `pic` */

DROP TABLE IF EXISTS `pic`;

CREATE TABLE `pic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(200) DEFAULT NULL COMMENT '路径',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pic` */

/*Table structure for table `productinfo` */

DROP TABLE IF EXISTS `productinfo`;

CREATE TABLE `productinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productname` varchar(100) DEFAULT NULL COMMENT '商品名字',
  `price` int(20) DEFAULT NULL COMMENT '价格(单位:分)',
  `number` int(11) DEFAULT NULL COMMENT '库存数量',
  `product_desc` varchar(200) DEFAULT NULL COMMENT '商品描述',
  `product_pic_id` varchar(20) DEFAULT NULL COMMENT '商品图片id ,隔开',
  `vendorid` bigint(20) DEFAULT NULL COMMENT '商户id',
  `postage` int(20) DEFAULT NULL COMMENT '运费(单位:分)',
  `status` varchar(10) DEFAULT NULL COMMENT '状态 0售罄 1在库 2下架',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `commentid` bigint(20) DEFAULT NULL COMMENT '评价id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `productinfo` */

/*Table structure for table `productype` */

DROP TABLE IF EXISTS `productype`;

CREATE TABLE `productype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `typename` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `status` varchar(20) DEFAULT NULL COMMENT '状态 0禁用 1启用',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `productype` */

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '名字',
  `account` varchar(20) DEFAULT NULL COMMENT '用户名',
  `pwd` varchar(20) DEFAULT NULL COMMENT '密码',
  `headpic` varchar(400) DEFAULT NULL COMMENT '头像图片路径',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `accountType` varchar(20) DEFAULT NULL COMMENT '账号属性 1管理员 2学生 3教职工 ',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `desc` varchar(200) DEFAULT NULL COMMENT '个人描述',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `userinfo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
