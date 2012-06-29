/*
MySQL Data Transfer
Source Host: localhost
Source Database: logistics
Target Host: localhost
Target Database: logistics
Date: 2012/6/29 15:18:02
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for t_carschedule
-- ----------------------------
CREATE TABLE `t_carschedule` (
  `carSchedule_id` int(10) NOT NULL AUTO_INCREMENT,
  `vehicleID` int(10) NOT NULL DEFAULT '0',
  `startTime` time NOT NULL DEFAULT '00:00:00',
  PRIMARY KEY (`carSchedule_id`),
  KEY `FK_veSchedule` (`vehicleID`),
  CONSTRAINT `FK_veSchedule` FOREIGN KEY (`vehicleID`) REFERENCES `t_vehicle` (`vehicleID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_distrpoint
-- ----------------------------
CREATE TABLE `t_distrpoint` (
  `distrPoint_id` int(10) NOT NULL AUTO_INCREMENT,
  `distrPoint_name` varchar(20) NOT NULL DEFAULT '',
  `distrPoint_province` varchar(20) NOT NULL DEFAULT '',
  `distrPoint_city` varchar(20) NOT NULL,
  PRIMARY KEY (`distrPoint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_dpaccount
-- ----------------------------
CREATE TABLE `t_dpaccount` (
  `dpAccount_id` int(10) NOT NULL AUTO_INCREMENT,
  `month` int(10) NOT NULL DEFAULT '0',
  `totalFee` double NOT NULL DEFAULT '0',
  `totalCost` double NOT NULL DEFAULT '0',
  `distributionPointID` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dpAccount_id`),
  KEY `FK_distributionPointID` (`distributionPointID`),
  CONSTRAINT `FK_distributionPointID` FOREIGN KEY (`distributionPointID`) REFERENCES `t_distrpoint` (`distrPoint_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_headaccount
-- ----------------------------
CREATE TABLE `t_headaccount` (
  `headAccountID` int(11) NOT NULL AUTO_INCREMENT,
  `month` int(11) NOT NULL DEFAULT '0',
  `totalFee` double NOT NULL DEFAULT '0',
  `totalCost` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`headAccountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_jointable
-- ----------------------------
CREATE TABLE `t_jointable` (
  `joinTable_id` int(10) NOT NULL AUTO_INCREMENT,
  `fromStationID` int(10) NOT NULL DEFAULT '0',
  `toStationIdD` int(10) NOT NULL DEFAULT '0',
  `loadUsername` varchar(20) DEFAULT NULL,
  `loadTime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `carScheduleID` int(10) NOT NULL DEFAULT '0',
  `vehicleOwnerName` varchar(20) NOT NULL DEFAULT '',
  `unloadTime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `unloadUsername` varchar(20) NOT NULL DEFAULT '',
  `joinTableStatus` varchar(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`joinTable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_jointabledistritable
-- ----------------------------
CREATE TABLE `t_jointabledistritable` (
  `jointableDistripoint_id` int(10) NOT NULL AUTO_INCREMENT,
  `joinTableId` int(10) NOT NULL,
  `distriPointId` int(10) NOT NULL,
  PRIMARY KEY (`jointableDistripoint_id`),
  KEY `FK_joint` (`joinTableId`),
  KEY `FK_dis` (`distriPointId`),
  CONSTRAINT `FK_joint` FOREIGN KEY (`joinTableId`) REFERENCES `t_jointable` (`joinTable_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_dis` FOREIGN KEY (`distriPointId`) REFERENCES `t_distrpoint` (`distrPoint_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
CREATE TABLE `t_order` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `goodsSize` double NOT NULL DEFAULT '0',
  `goodsWeight` double NOT NULL DEFAULT '0',
  `goodsDesc` varchar(255) NOT NULL DEFAULT '',
  `toUserName` varchar(255) NOT NULL DEFAULT '',
  `toUserAddress` varchar(255) NOT NULL DEFAULT '',
  `toUserTel` varchar(10) NOT NULL DEFAULT '',
  `orderStatus` int(10) NOT NULL DEFAULT '0',
  `price` double NOT NULL DEFAULT '0',
  `isUrgency` bit(1) NOT NULL DEFAULT b'0',
  `userId` int(11) NOT NULL DEFAULT '0',
  `orderTime` datetime NOT NULL,
  `fromCity` varchar(20) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `toCity` varchar(20) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK_orderStatus` (`orderStatus`),
  KEY `FK_userId` (`userId`),
  CONSTRAINT `FK_orderStatus` FOREIGN KEY (`orderStatus`) REFERENCES `t_orderstatus` (`status_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_userId` FOREIGN KEY (`userId`) REFERENCES `t_user` (`uid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_orderjointable
-- ----------------------------
CREATE TABLE `t_orderjointable` (
  `orderJointable_id` int(10) NOT NULL AUTO_INCREMENT,
  `orderId` int(10) NOT NULL DEFAULT '0',
  `joinTableId` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`orderJointable_id`),
  KEY `FK_orderId` (`orderId`),
  KEY `FK_joinTableId` (`joinTableId`),
  CONSTRAINT `FK_orderId` FOREIGN KEY (`orderId`) REFERENCES `t_order` (`order_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_joinTableId` FOREIGN KEY (`joinTableId`) REFERENCES `t_jointable` (`joinTable_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_orderstatus
-- ----------------------------
CREATE TABLE `t_orderstatus` (
  `status_id` int(10) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT '',
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
CREATE TABLE `t_role` (
  `role_id` int(10) NOT NULL AUTO_INCREMENT,
  `limitDesc` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_route
-- ----------------------------
CREATE TABLE `t_route` (
  `routeID` int(11) NOT NULL AUTO_INCREMENT,
  `fromStationID` int(11) NOT NULL DEFAULT '0',
  `toStationID` int(11) NOT NULL DEFAULT '0',
  `price` double NOT NULL DEFAULT '0',
  `time` time NOT NULL DEFAULT '00:00:00',
  PRIMARY KEY (`routeID`),
  KEY `FK_ToStationID` (`toStationID`),
  CONSTRAINT `FK_FromStationID` FOREIGN KEY (`routeID`) REFERENCES `t_distrpoint` (`distrPoint_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_ToStationID` FOREIGN KEY (`toStationID`) REFERENCES `t_distrpoint` (`distrPoint_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_routediatrpoint
-- ----------------------------
CREATE TABLE `t_routediatrpoint` (
  `routeDistripoint_id` int(10) NOT NULL AUTO_INCREMENT,
  `distrPointId` int(10) NOT NULL,
  `routeId` int(10) NOT NULL,
  PRIMARY KEY (`routeDistripoint_id`),
  KEY `FK_distri` (`distrPointId`),
  KEY `FK_route` (`routeId`),
  CONSTRAINT `FK_distri` FOREIGN KEY (`distrPointId`) REFERENCES `t_distrpoint` (`distrPoint_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_route` FOREIGN KEY (`routeId`) REFERENCES `t_route` (`routeID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_staff
-- ----------------------------
CREATE TABLE `t_staff` (
  `staff_id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(20) NOT NULL DEFAULT '',
  `tel` varchar(20) NOT NULL DEFAULT '',
  `roleID` int(10) NOT NULL DEFAULT '0',
  `distrPointID` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`staff_id`),
  KEY `FK_roleId` (`roleID`),
  KEY `FK_distrPoint` (`distrPointID`),
  CONSTRAINT `FK_distrPoint` FOREIGN KEY (`distrPointID`) REFERENCES `t_role` (`role_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_roleId` FOREIGN KEY (`roleID`) REFERENCES `t_role` (`role_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
CREATE TABLE `t_user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `email` varchar(255) NOT NULL DEFAULT '',
  `address` varchar(255) NOT NULL DEFAULT '',
  `tel` varchar(11) NOT NULL DEFAULT '',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_vehicle
-- ----------------------------
CREATE TABLE `t_vehicle` (
  `vehicleID` int(10) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL DEFAULT '',
  `vehicleOwnerName` varchar(20) NOT NULL DEFAULT '',
  `routeId` int(10) NOT NULL,
  PRIMARY KEY (`vehicleID`),
  KEY `FK_vehicleRoute` (`routeId`),
  CONSTRAINT `FK_vehicleRoute` FOREIGN KEY (`routeId`) REFERENCES `t_route` (`routeID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
