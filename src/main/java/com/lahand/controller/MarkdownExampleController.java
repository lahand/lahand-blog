package com.lahand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lahand.dao.IArticleDAO;
import com.lahand.dao.model.Article;

@RestController
@RequestMapping(value = "/markdownExample")
public class MarkdownExampleController {
	
	@Autowired
	private IArticleDAO articleDAO;
	
	private Long articleId = 1L;
	
    @RequestMapping(value = "/full")
    public ModelAndView full() {
    	Article article = articleDAO.selectById(articleId);
        return new ModelAndView("/markdownExample/full","fullTemplateData",article.getArticleContent());
    }
}
