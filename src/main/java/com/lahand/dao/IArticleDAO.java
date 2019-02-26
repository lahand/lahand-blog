/**
 * @author ws
 * @date 2019-02-26
 */
package com.lahand.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lahand.dao.model.Article;

@Repository
public interface IArticleDAO {
    /**
     * 删除
     */
    int deleteById(Long articleId);

    /**
     * 插入
     */
    int insert(Article record);

    /**
     * 查询
     */
    Article selectById(Long articleId);

    /**
     * 查询
     */
    List<Article> selectByList(Article record);

    /**
     * 修改
     */
    int updateById(Article record);
}