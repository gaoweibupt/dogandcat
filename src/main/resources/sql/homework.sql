create table `homework` (
  `id` int(32) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` INT(32) NOT NULL DEFAULT '0' COMMENT '学员id',
  `class_id` int(16) NOT NULL DEFAULT '0' COMMENT '班级id',
  `lession_id` int(16) NOT NULL DEFAULT '0' COMMENT '课程id',
  `file_path` VARCHAR(1000) NOT NULL DEFAULT '' COMMENT '作业路径',
  `file_name` VARCHAR(300) NOT NULL DEFAULT '' COMMENT '作业名称',
  `create_time` TIMESTAMP NOt NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` TIMESTAMP NOt NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `correct_flag` TINYINT(2) NOT NULL DEFAULT '0' COMMENT '是否批改',
  `star_count` INT(14) NOT NULL DEFAULT '0' COMMENT '赞的数量',
  `negative_count` INT(14) NOT NULL DEFAULT '0' COMMENT '差评数量',
  `best_flag` TINYINT(2) NOT NULL DEFAULT '0' COMMENT '最佳作业'
) engine=InnoDB default charset=utf8;