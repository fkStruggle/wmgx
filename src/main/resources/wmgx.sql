/*
Navicat MySQL Data Transfer

Source Server         : wmgx
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : wmgx

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-07-09 23:53:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `wg_anonymous_dynamic`
-- ----------------------------
DROP TABLE IF EXISTS `wg_anonymous_dynamic`;
CREATE TABLE `wg_anonymous_dynamic` (
  `dynamicId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '匿名动态id',
  `userLoginName` varchar(10) NOT NULL COMMENT '用户登录名',
  `dynamicInfo` varchar(140) NOT NULL COMMENT '动态内容',
  `dynamicImg` varchar(250) DEFAULT NULL COMMENT '匿名动态图片',
  `releaseTime` datetime NOT NULL COMMENT '动态发布时间',
  PRIMARY KEY (`dynamicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='匿名动态信息';

-- ----------------------------
-- Records of wg_anonymous_dynamic
-- ----------------------------

-- ----------------------------
-- Table structure for `wg_user`
-- ----------------------------
DROP TABLE IF EXISTS `wg_user`;
CREATE TABLE `wg_user` (
  `userId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `loginName` varchar(10) NOT NULL,
  `loginPass` varchar(15) NOT NULL,
  `anonymousName` varchar(6) NOT NULL,
  `email` varchar(20) NOT NULL,
  `telphone` varchar(15) NOT NULL,
  `registerTime` datetime NOT NULL,
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of wg_user
-- ----------------------------

-- ----------------------------
-- Table structure for `wg_anonymous_comment`
-- ----------------------------
DROP TABLE IF EXISTS `wg_anonymous_comment`;
CREATE TABLE `wg_anonymous_comment` (
  `aCommentId` bigint(20) NOT NULL AUTO_INCREMENT,
  `aParentComId` bigint(20) DEFAULT NULL,
  `dynamicId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `cConten` varchar(250) NOT NULL,
  `amousName` varchar(6) DEFAULT NULL,
  `cTime` datetime DEFAULT NULL,
  PRIMARY KEY (`aCommentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wg_anonymous_comment
-- ----------------------------
