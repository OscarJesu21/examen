/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50617
 Source Host           : localhost:3306
 Source Schema         : app_web

 Target Server Type    : MySQL
 Target Server Version : 50617
 File Encoding         : 65001

 Date: 26/05/2020 03:38:42
*/

Create database app_web
use app_web
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for catalogo_usuarios
-- ----------------------------
DROP TABLE IF EXISTS `catalogo_usuarios`;
CREATE TABLE `catalogo_usuarios`  (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of catalogo_usuarios
-- ----------------------------
INSERT INTO `catalogo_usuarios` VALUES (1, 'Jesus', 'Vargas', 25);
INSERT INTO `catalogo_usuarios` VALUES (2, 'Oscar', 'Romero', 25);

SET FOREIGN_KEY_CHECKS = 1;
