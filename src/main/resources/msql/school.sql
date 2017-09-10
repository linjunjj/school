SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `usrTel` varchar(32) DEFAULT NULL,
  `userMail` varchar(64),
  `userPassword` varchar(64),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

drop TABLE IF EXISTS `t_userDetail`;
CREATE TABLE `t_userDetail`(
  `id` int(11) not NULL AUTO_INCREMENT,
  `sex` ENUM('man','woman') DEFAULT 'man',
  `birthday` datetime,
  `integrity` int(11),
  `qq` varchar(64),
  `weixin` varchar(64),
  `weibo` varchar(64),
  `userID` int(11),
  PRIMARY KEY (`id`),
  KEY `userdetail` (`userID`),
  CONSTRAINT `userdetail` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_thirdParty`;
CREATE TABLE `t_thirdParty`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`userID` int(11),
	`accountTypeKey` varchar(64),
	`identification` varchar(64),
	`accesstoken` varchar(64),
	PRIMARY KEY (`id`),
	KEY `third` (`userID`),
	CONSTRAINT `third` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_attentionUser`;
CREATE TABLE `t_attentionUser`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`userID` int(11),
	`followUserID` int(11),
	`isMutal` ENUM('1','0') DEFAULT '1',
	`dataCreate` datetime,
	PRIMARY KEY (`id`),
	KEY `attention` (`userID`),
	CONSTRAINT `attention` FOREIGN KEY (`userID`) REFERENCES `t_user`(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`commentType` varchar(10),
	`parentID` int(11),
	`commentObjectID` int(11),
	`ownerID` int(11),
	`userID` int(11),
	`author` varchar(64),
	`subject` varchar(64),
	`body` varchar(2000),
	`isPrivate` ENUM('1','0') DEFAULT '1',
	`ip` varchar(32),
	`dataCreate` datetime,
	PRIMARY KEY (`id`),
	KEY `commment` (`userID`),
	CONSTRAINT `commment` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_attitude`;
CREATE TABLE `t_attitude`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`objectID` int(11),
	`userID` int(11),
	PRIMARY KEY (`id`),
	KEY `attitude` (`userID`),
	CONSTRAINT `attitude` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_attitudeRecord`;
CREATE TABLE `t_attitudeRecord`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`objectID` int(11),
	`userID` int(11),
	`attitudeID` int(11),
	PRIMARY KEY (`id`),
	KEY `recorduser` (`userID`),
	KEY `recorda` (`attitudeID`),
	CONSTRAINT `recorduser` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`),
	CONSTRAINT `recorda` FOREIGN KEY (`attitudeID`) REFERENCES `t_attitude` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE if EXISTS `t_rank`;
CREATE TABLE `t_rank`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`pointLower` bigint,
	`rank` bigint,
	`userID` int(11),
	`rankName` varchar(32),
	PRIMARY KEY (`id`),
	KEY `rank` (`userID`),
	CONSTRAINT `rank` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE if EXISTS `t_point`;
CREATE TABLE `t_point`(
	`id` int(11) not NULL AUTO_INCREMENT,
	`userID` int(11),
	`description` varchar(64),
	`time` datetime,
	`pointSum` bigint,
	PRIMARY KEY (`id`),
	KEY `point` (`userID`),
	CONSTRAINT `point` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_siglns`;
CREATE TABLE `t_siglns`(
	`id` int(11) not null AUTO_INCREMENT,
	`userID` int(11),
	`experSum` bigint,
	`tradePoint` bigint,
	`monthSignCount` int,
	`lastSiglns` datetime,
	PRIMARY KEY (`id`),
	KEY `siglns` (`userID`),
CONSTRAINT `siglns` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_siglnDetail`;
CREATE TABLE `t_siglnDetail`(
	`id` int(11) not null AUTO_INCREMENT,
	`userID` int(11),
	`expencePiont` int,
	`tradePoint` int,
	`dataCreate` datetime,
	PRIMARY KEY (`id`),
	KEY `siglndatail` (`userID`),
	CONSTRAINT `siglndatail` FOREIGN KEY (`userID`) REFERENCES `t_user` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_reprot`;
CREATE TABLE `t_reprot`(
	`id` int(11) not null AUTO_INCREMENT,
	`userID` int(11),
	`reason` varchar(64),
	`title` varchar(32),
	`description` varchar(128),
	`statul` varchar(32),
	`dataCreate` datetime,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_plate`;
CREATE TABLE `t_plate`(
	`id` int(11) not null AUTO_INCREMENT,
	`ownerID` int(11),
	`name` varchar(32),
	`description` varchar(64),
	`featuredmageattachId` bigint,
	`isEnable` ENUM('1','0') DEFAULT '1',
	`displayOlder`  bigint,
	`dataCreate` datetime,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


DROP TABLE if EXISTS `t_theme`;
CREATE TABLE `t_theme`(
	`id` int(11) not null AUTO_INCREMENT,
	`sectionID` int(11),
	`ownerID` int(11),
	`author` varchar(11),
	`subject` varchar(64),
	`body` varchar(2000),
	`isLocked` ENUM('1','0') DEFAULT '1',
	`isStiky` ENUM('1','0') DEFAULT '1',
	`approvalstatul` int(11),
	`ip` varchar(32),
	`dataCreate` datetime,
	`lastMontime` datetime,
	PRIMARY KEY (`id`),
	KEY `theme` (`sectionID`),
	CONSTRAINT `theme` FOREIGN KEY (`sectionID`) REFERENCES `t_plate` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_categroy`;
CREATE TABLE `t_categroy`(
	`id` int(11) not null AUTO_INCREMENT,
	`parentID` int(11),
	`ownerID` int(11),
	`categroyName` varchar(64),
	`description` varchar(128),
	`displayOlder` int,
	`childCount` int,
	`lastModifed` datetime,
	`dataCreate` datetime,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_ltemlncategroy`;
CREATE TABLE `t_ltemlncategroy`(
	`categroyID` int(11),
	`itemID` int(11)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE `t_ltemlncategroy` ADD CONSTRAINT ic_pk PRIMARY KEY(`categroyID`,`itemID`);
ALTER TABLE `t_ltemlncategroy` ADD CONSTRAINT ic_pk1 FOREIGN KEY (`categroyID`) REFERENCES `t_categroy` (`id`);
ALTER TABLE `t_ltemlncategroy` ADD CONSTRAINT ic_pk2  FOREIGN KEY (`itemID`) REFERENCES `t_theme` (`id`);
ALTER TABLE `t_ltemlncategroy` DROP FOREIGN KEY ic_pk1;
ALTER TABLE `t_ltemlncategroy` drop FOREIGN KEY ic_pk2;

DROP TABLE IF EXISTS `t_plateAdmin`;
CREATE TABLE `t_plateAdmin`(
	`id` int(11) not null AUTO_INCREMENT,
	`categroyID` int(11),
	`referencategroyID` int(11),
	`userID` int(11),
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_colum`;
CREATE TABLE `t_colum`(
	`id` int(11) not null AUTO_INCREMENT,
	`columName` varchar(32),
	`description` varchar(64),
	`parentID` int(11),
	`parentList` varchar(32),
	`childCount`  int(11),
	`dataCreate` datetime,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_contentItem`;
CREATE TABLE `t_contentItem`(
	`id` int(11) not null AUTO_INCREMENT,
	`contentCategroyID` int(11),
	`contentModelID` int(11),
	`subject` varchar(64),
	`body` varchar(2000),
	`featuredmageattachId` bigint,
	`userID` int(11),
	`author` varchar(64),
	`summary` varchar(64),
	`ip` varchar(32),
	`datePuished` datetime,
	`dataCreate` datetime,
	`lastModifed` datetime,
	PRIMARY KEY (`id`),
	KEY `content` (`contentCategroyID`),
	CONSTRAINT `content` FOREIGN KEY (`contentCategroyID`) REFERENCES `t_colum` (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_columAdmin`;
CREATE TABLE `t_columAdmin`(
	`id` int(11) not null AUTO_INCREMENT,
	`categroyID` int(11),
	`referencategroyID` int(11),
	`userID` int(11),
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_Advertsing`;
CREATE TABLE `t_Advertsing` (
	`id` int(11) not null AUTO_INCREMENT,
	`name` varchar(32),
	`body` varchar(500),
	`linkUrl` varchar(32),
	`imageId` bigint,
	`stardate` datetime,
	`enddate` datetime,
	`dataCreate` datetime,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE if EXISTS `t_AdvertsingPosing`;
CREATE TABLE `t_AdvertsingPosing`(
	`id` int(11) not null AUTO_INCREMENT,
	`description` varchar(64),
	`imageId` bigint,
	`isEnable` ENUM('1','0') DEFAULT '1',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE if EXISTS `t_AdvertsinglnPosing`;
CREATE TABLE `t_AdvertsinglnPosing`(
	`advertsingID` int(11),
	`postingID` int(11),
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
ALTER TABLE `t_AdvertsinglnPosing` ADD CONSTRAINT ap_pk PRIMARY KEY(`advertsingID`,`postingID`);
ALTER TABLE `t_AdvertsinglnPosing` ADD CONSTRAINT ap_pk1 FOREIGN KEY (`advertsingID`) REFERENCES `t_Advertsing` (`id`);
ALTER TABLE `t_AdvertsinglnPosing` ADD CONSTRAINT ap_pk2  FOREIGN KEY (`postingID`) REFERENCES `t_AdvertsingPosing` (`id`);
ALTER TABLE `t_AdvertsinglnPosing` DROP FOREIGN KEY ap_pk1;
ALTER TABLE `t_AdvertsinglnPosing` drop FOREIGN KEY ap_pk2;



DROP TABLE if EXISTS `t_admin`;
CREATE TABLE `t_admin`(
	`id` int(11) not null AUTO_INCREMENT,
	`ip` varchar(32),
	`buildTime` datetime,
	`signinTime` datetime,
	`signoutTime` datetime,
	`sigTime` datetime,
	`adminaccount` varchar(64),
	`adminPassword` varchar(64),
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;





