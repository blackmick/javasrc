USE fsmdemo;

DROP TABLE IF EXISTS tbl_product;

CREATE TABLE tbl_product (
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  state INT NOT NULL DEFAULT '0',
  last_event INT NOT NULL DEFAULT '0',
  name VARCHAR(32) NOT NULL DEFAULT ''
)ENGINE = InnoDB CHAR SET = UTF8;

INSERT INTO tbl_product (`state`, `last_event`, `name`) VALUES ('0','0','test1');
INSERT INTO tbl_product (`state`, `last_event`, `name`) VALUES ('0', '0', 'test2');
