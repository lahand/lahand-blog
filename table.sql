CREATE TABLE `ARTICLE` (
  `article_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
  `article_title` varchar(300) COLLATE utf8_unicode_ci NOT NULL COMMENT '文章标题',
  `article_content` text COLLATE utf8_unicode_ci NOT NULL COMMENT '文章内容',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `blog_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `nickname` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '昵称',
  `real_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '真实名称',
  `phone` varchar(11) COLLATE utf8_unicode_ci NOT NULL COMMENT '手机',
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '邮箱',
  `password` varchar(100) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `disabled` bit(1) DEFAULT b'0' COMMENT '0：正常 1：删除',
  `source` smallint(6) DEFAULT '0' COMMENT '来源 1：后台 2：app 3：微信',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;