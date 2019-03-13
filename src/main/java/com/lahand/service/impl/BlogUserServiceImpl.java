package com.lahand.service.impl;

import com.lahand.entity.BlogUser;
import com.lahand.mapper.BlogUserMapper;
import com.lahand.service.IBlogUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lahand
 * @since 2019-03-13
 */
@Service
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper, BlogUser> implements IBlogUserService {

}
