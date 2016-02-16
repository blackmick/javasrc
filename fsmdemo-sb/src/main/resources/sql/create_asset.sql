USE fsmdemo;

DROP TABLE IF EXISTS tbl_asset_manager;

CREATE TABLE tbl_asset_manager(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL DEFAULT '',
  `bank_name` VARCHAR(45) NOT NULL DEFAULT '',
  `branch_bank_name` VARCHAR(45) NOT NULL DEFAULT '',
  `bank_card` VARCHAR(45) NOT NULL DEFAULT '',
  `bank_card_type` INT(11) NOT NULL DEFAULT '0',
  `create_time` DATETIME DEFAULT NULL,
  `update_time` DATETIME DEFAULT NULL,
  `status` INT(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO tbl_asset_manager (`name`, `bank_name`, `branch_bank_name`, `bank_card`, `create_time`, `update_time`)
    VALUES ('AM TEST1', 'AM BANK 1', 'AM BRANCH 1', '1234555665544',NOW(), NOW());

INSERT INTO tbl_asset_manager (`name`, `bank_name`, `branch_bank_name`, `bank_card`, `create_time`, `update_time`)
VALUES ('AM TEST2', 'AM BANK 2', 'AM BRANCH 2','1344555665544', NOW(), NOW());

INSERT INTO tbl_asset_manager (`name`, `bank_name`, `branch_bank_name`, `bank_card`, `create_time`, `update_time`)
VALUES ('AM TEST3', 'AM BANK 3', 'AM BRANCH 3', '12543555665544', NOW(), NOW());


-- 资产管理计划

CREATE TABLE tbl_asset_plan(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `am_id` BIGINT(20) NOT NULL COMMENT '资产管理人id',
  `name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '资产管理计划名称',
  `contract` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '资产管理计划合同号',
  `protocol` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '资产管理协议号',
  `transfer_time` DATETIME DEFAULT NULL COMMENT '转让时间',
  `create_time` DATETIME DEFAULT NULL,
  `update_time` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

-- 资产管理计划明细
-- 以核心的分期借据为维度整合核心的数据,此表将作为资产明细查询,标注,导出,导入核心的主要数据模型

DROP TABLE IF EXISTS tbl_asset_detail;

CREATE TABLE tbl_asset_detail(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `ap_id` BIGINT(20) NOT NULL COMMENT '资产管理计划id',
  `core_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '核心id,标识该资产明细属于哪个核心,适配多核心使用,当前使用一期核心,值为"core_v1"',
  `loan_id` VARCHAR(64) NOT NULL COMMENT '核心借据号',
  `stage_id` VARCHAR(64) NOT NULL COMMENT '分期借据号',
  `stage_no` INT(11) NOT NULL DEFAULT '1' COMMENT '分期期数',
  `account_type` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '账户类型:',
  `due_date` DATETIME NOT NULL COMMENT '还款期限',
  `repaid` DOUBLE NOT NULL DEFAULT '0.0' COMMENT '已还金额',
  `unrepay` DOUBLE NOT NULL DEFAULT '0.0' COMMENT '未还金额',
  `repay_type` INT(11) NOT NULL DEFAULT '0' COMMENT '还款方式:0-等额本息,1-等额本金,2-先高后低',
#   `corp_name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '合作机构',
  `c_id` BIGINT(20) NOT NULL DEFAULT '' COMMENT '客户id',
  `corp_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '商户id',
  `scene` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '场景',
  `loan_time` DATETIME NOT NULL COMMENT '放款时间',
  `loan_amount` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '贷款金额',
  `interest_rate` DOUBLE NOT NULL DEFAULT '0.0' COMMENT '贷款利率(月)',
  `loan_duration` DECIMAL(10,2) NOT NULL COMMENT '贷款期限',
  `due_date` DATETIME NOT NULL COMMENT '到期日',
  `credit_amount` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '授信额度',
  `loan_blance` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '贷款余额',
  `insurance_type` INT NOT NULL DEFAULT '0' COMMENT '担保类型',
  `over_due` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逾期标记',
  `over_due_time` INT(11) NOT NULL DEFAULT '0' COMMENT '累计逾期次数',
  `over_due_day` INT(11) NOT NULL DEFAULT '0' COMMENT '累计逾期天数',
  `max_over_due_day` INT(11) NOT NULL DEFAULT '0' COMMENT '历史最高逾期天数',
  `history_max_amount` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '历史最高金额',
  `over_due_capital` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '逾期本金金额',
  `over_due_interest` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '逾期利息金额',
  ``
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;


-- 客户信息
CREATE TABLE tbl_asset_customer(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '客户名称',
  `gender` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '客户性别:0-女;1-男',
  `age` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '客户年龄',
  `degree` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '客户学历:',
  `profession` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '客户职业',
  `create_time` DATETIME DEFAULT NULL,
  `update_time` DATETIME DEFAULT NULL,
  `status` INT(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;


-- 商户信息
CREATE TABLE tbl_corp(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

/*
核心客户信息
 */

/*
核心借据信息
 */

/*
核心分期计划
 */

