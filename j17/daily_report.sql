DROP TABLE IF EXISTS wf_report_daily;

CREATE TABLE wf_report_daily (
    id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    report_date date NOT NULL DEFAULT '1970-01-01' COMMENT '日期',
    batch_no varchar(128) NOT NULL DEFAULT '' COMMENT '生产批号',
    process_name varchar(128) NOT NULL DEFAULT '' COMMENT '工序名称',
    product_spec varchar(128) NOT NULL DEFAULT '' COMMENT '产品规格',
    raw_spec varchar(128) NOT NULL DEFAULT '' COMMENT '原料规格',
    picking decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '领料',
    order_in_process decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '上单在制',
    feeding decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '投料',
    genuine_daily decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '当日正品',
    genuine_total decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '累计正品',
    defective_daily decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '当日次品',
    defective_total decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '累计次品',
    genuine_storage decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '入库正品',
    genuine_storage_total decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '累计入库正品',
    loss_daily decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '当日损耗(kg)',
    loss_total decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '累计损耗(kg)',
    unit decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '单位',
    raw_in_process decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '原料在制品(kg)',
    semi_in_process decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '半成品在制品',
    memo varchar(128) NOT NULL DEFAULT '' COMMENT '备注',
    deleted tinyint(1) NOT NULL DEFAULT '0' COMMENT '归档状态(0未删除，1删除)',
    creator_id bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
    create_time datetime(6) NOT NULL DEFAULT '1970-01-01' COMMENT '创建时间',
    last_modify_time datetime(6) NOT NULL DEFAULT '1970-01-01' COMMENT '修改人',
    last_modify_user_id bigint(20) NOT NULL DEFAULT '0' COMMENT '修改时间',
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = COMPACT COMMENT = '纺纱日报';

DROP TABLE IF EXISTS wf_product_spec;

CREATE TABLE wf_product_spec (
    id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    name varchar(128) NOT NULL DEFAULT '' COMMENT '产品规格',
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = COMPACT COMMENT = '产品规格';

CREATE TABLE wf_raw_spec (
    id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    product_spec_id bigint(20) NOT NULL DEFAULT '0' COMMENT '产品规格ID',
    name varchar(128) NOT NULL DEFAULT '' COMMENT '原料规格',
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = COMPACT COMMENT = '原料规格';

DROP TABLE IF EXISTS wf_report_month;

CREATE TABLE wf_report_month (
    id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    report_date date NOT NULL DEFAULT '1970-01-01' COMMENT '日期',
    batch_no varchar(128) NOT NULL DEFAULT '' COMMENT '生产批号',
    product_name varchar(128) NOT NULL DEFAULT '' COMMENT '产品名称',
    product_spec varchar(128) NOT NULL DEFAULT '' COMMENT '产品规格',
    plan_output decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '月计划产量(kg)',
    raw_spec varchar(128) NOT NULL DEFAULT '' COMMENT '原料规格(kg)',
    raw_picking decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '原料领料(kg)',
    last_in_process decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '上月在制(kg)',
    feeding decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '投料(kg)',
    last_unstorage_product decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '上月未入库成品(kg)',
    genuine decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '本月正品',
    defective decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '本月次品',
    genuine_storage decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '本月入库正品',
    unit varchar(128) NOT NULL DEFAULT '' COMMENT '单位',
    loss_raw decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '损耗原料(kg)',
    loss_product decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '损耗成品(kg)',
    in_process decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '在制品(kg)',
    unstorage_product decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '本月未入库成品',
    raw_rollback decimal(10, 3) NOT NULL DEFAULT '0.000' COMMENT '本月原料退库(kg)',
    rate_product decimal(10, 2) NOT NULL DEFAULT '0.00' COMMENT '收得率%',
    rate_pass decimal(10, 2) NOT NULL DEFAULT '0.00' COMMENT '月合格率%',
    rate_plan_complete decimal(10, 2) NOT NULL DEFAULT '0.00' COMMENT '月计算完成率%',
    remark varchar(128) NOT NULL DEFAULT '' COMMENT '备注',
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = COMPACT COMMENT = '特种纺织品生产月报表';