USE asset_management;

DROP TABLE IF EXISTS tbl_asset_manager;

CREATE TABLE tbl_asset_manager(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '资产管理人名称',
  `bank_name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '资产管理人银行名称',
  `branch_bank_name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '资产管理人银行分行名称',
  `bank_card` VARCHAR(45) NOT NULL DEFAULT ''COMMENT '资产管理人银行账号',
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
DROP TABLE IF EXISTS tbl_asset_plan;
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
#   `stage_id` VARCHAR(64) NOT NULL COMMENT '分期借据号',
  `period` INT(11) NOT NULL DEFAULT '1' COMMENT '分期期数',
  `payment_periods` INT(11) NOT NULL DEFAULT '1' COMMENT '分期计划',
  `account_type` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '账户类型:',
  `repay_duration` DATETIME NOT NULL COMMENT '还款期限',
  `recevable_amount` DECIMAL(10,2) DEFAULT '0.00' COMMENT '应还金额',
  `repaid` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '已还金额',
  `unrepaid` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '未还金额',
  `amount_for_period` DECIMAL(10,2) DEFAULT '0.00' COMMENT '期供金额',
  `principle_for_period` DECIMAL(10,2) DEFAULT '0.00' COMMENT '期供本金',
  `repaid_principle` DECIMAL(10,2) DEFAULT '0.00' COMMENT '已还本金',
  `cost_for_period` DECIMAL(10,2) DEFAULT '0.00' COMMENT '期供费用',
  `repaid_cost` DECIMAL(10,2) DEFAULT '0.00' COMMENT '已还费用',
  `interest_for_period` DECIMAL(10,2) DEFAULT '0.00' COMMENT '期供利息',
  `repaid_interest` DECIMAL(10,2) DEFAULT '0.00' COMMENT '已还利息',
  `fee` DECIMAL(10,2) DEFAULT '0.00' COMMENT '罚息',
  `repaid_fee` DECIMAL(10,2) DEFAULT '0.00' COMMENT '已还罚息',
  `compound_interest` DECIMAL(10,2) DEFAULT '0.00' COMMENT '复利',
  `repay_type` INT(11) NOT NULL DEFAULT '0' COMMENT '还款方式:0-等额本息,1-等额本金,2-先高后低',
#   `corp_name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '合作机构',
  `c_id` BIGINT(20) NOT NULL COMMENT '客户id',
  `corp_id` BIGINT(20) NOT NULL COMMENT '商户id',
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
  `over_due_principle` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '逾期本金金额',
  `over_due_interest` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '逾期利息金额',
  `account_age` INT NOT NULL DEFAULT '0' COMMENT '五级分类状态',
  `transfer_status` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '转让状态:0-未转让;1-以转让',
  `asset_type` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '资产状态:0-表内;1-表外',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;


-- 客户信息
DROP TABLE IF EXISTS tbl_asset_customer;
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
DROP TABLE IF EXISTS tbl_merchant;
CREATE TABLE tbl_merchant(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(120) NOT NULL DEFAULT '' COMMENT '商户总公司名称',
  `branch_name` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '商户分公司名称',
  `create_time` DATETIME NOT NULL,
  `update_time` DATETIME NOT NULL,
  `status` INT(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

-- 合作机构表
-- 出表方
DROP TABLE IF EXISTS tbl_corp;
CREATE TABLE tbl_corp(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '合作机构名',
  `create_time` DATETIME NOT NULL,
  `update_time` DATETIME NOT NULL,
  `status` INT(11) NOT NULL DEFAULT '0',
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

