package com.lahand.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lahand.entity.BlogUser;
import com.lahand.service.IBlogUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lahand
 * @since 2019-03-13
 */
@RestController
@RequestMapping("/user")
public class BlogUserController {
	
	@Autowired
	private IBlogUserService blogUserService; 
	
    @RequestMapping("/queryUserList")
    @ResponseBody
    public String queryUserList() {
    	List<BlogUser> resultList = blogUserService.list();
        return JSON.toJSONString(resultList);
    }
}
