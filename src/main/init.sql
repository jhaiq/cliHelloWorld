// ssm.sql
/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2017-10-22 18:19:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'guo', '111');
INSERT INTO `user` VALUES ('2', 'root', 'aaa');
INSERT INTO `user` VALUES ('3', '11113', '22223');
INSERT INTO `user` VALUES ('4', '11114', '22224');
INSERT INTO `user` VALUES ('5', '11115', '22225');
INSERT INTO `user` VALUES ('6', '11116', '22226');
INSERT INTO `user` VALUES ('7', '11117', '22227');