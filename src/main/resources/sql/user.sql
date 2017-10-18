create table `user` (
    `id` int(32) primary key not null auto_increment comment '主键id',
    `name` varchar(32) not null default '' comment '姓名',
    `age` int(11) not null default '0' comment '年龄',
    `password` varchar(32) not null default '' comment '密码'
) engine=InnoDB default charset=utf8;