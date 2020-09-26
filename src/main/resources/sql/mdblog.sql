/*
 Navicat Premium Data Transfer

 Source Server         : 个人用数据库
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : mdblog

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 21/09/2020 14:51:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mb_admin
-- ----------------------------
DROP TABLE IF EXISTS `mb_admin`;
CREATE TABLE `mb_admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `adminname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员登录名',
  `adminpassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员密码',
  `adminnick` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员昵称',
  `adminemail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员邮箱',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_blog
-- ----------------------------
DROP TABLE IF EXISTS `mb_blog`;
CREATE TABLE `mb_blog`  (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `html_material` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'HTML内容',
  `md_material` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'MD格式内容',
  `imgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片链接',
  `info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '博客介绍',
  `member_id` int(11) NULL DEFAULT NULL COMMENT '所属用户',
  `hits` int(11) NULL DEFAULT NULL COMMENT '博客点击量',
  `top` int(11) NULL DEFAULT NULL COMMENT '是否参与排行 0 不参与 1 参与',
  `type` int(11) NULL DEFAULT NULL COMMENT '博客类别 0 公开 1 保护 2 私有',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`blog_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_comment
-- ----------------------------
DROP TABLE IF EXISTS `mb_comment`;
CREATE TABLE `mb_comment`  (
  `coment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论主键',
  `member_id` int(11) NULL DEFAULT NULL COMMENT '评论用户',
  `blog_id` int(11) NULL DEFAULT NULL COMMENT '评论博客',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论内容',
  `imgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论图片',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`coment_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_member
-- ----------------------------
DROP TABLE IF EXISTS `mb_member`;
CREATE TABLE `mb_member`  (
  `member_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户登录名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `level` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户级别',
  `qq` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户QQ',
  `status` int(11) NULL DEFAULT NULL COMMENT '用户状态 0 未激活 1 激活',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`member_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_resume
-- ----------------------------
DROP TABLE IF EXISTS `mb_resume`;
CREATE TABLE `mb_resume`  (
  `resume_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '简历主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`resume_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_tag
-- ----------------------------
DROP TABLE IF EXISTS `mb_tag`;
CREATE TABLE `mb_tag`  (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签主键',
  `tag_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标签名称',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_tag_blog
-- ----------------------------
DROP TABLE IF EXISTS `mb_tag_blog`;
CREATE TABLE `mb_tag_blog`  (
  `tag_blog_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签博客主键',
  `tag_id` int(11) NULL DEFAULT NULL COMMENT '标签主键',
  `blog_id` int(11) NULL DEFAULT NULL COMMENT '博客主键',
  `create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改用户',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`tag_blog_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mb_update_recod
-- ----------------------------
DROP TABLE IF EXISTS `mb_update_recod`;
CREATE TABLE `mb_update_recod`  (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录主键',
  `blog_id` int(11) NULL DEFAULT NULL COMMENT '博客主键',
  `mb_blog_create_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '博客创建用户',
  `mb_blog_create_time` datetime(0) NULL DEFAULT NULL COMMENT '博客创建时间',
  `mb_blog_update_member` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '博客修改用户',
  `mb_blog_update_time` datetime(0) NULL DEFAULT NULL COMMENT '博客修改时间',
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
