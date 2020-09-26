package cn.aixuxi.mdblog.service.impl;

import cn.aixuxi.mdblog.util.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.aixuxi.mdblog.util.PageUtils;


import cn.aixuxi.mdblog.dao.BlogDao;
import cn.aixuxi.mdblog.entity.BlogEntity;
import cn.aixuxi.mdblog.service.BlogService;


@Service("blogService")
public class BlogServiceImpl extends ServiceImpl<BlogDao, BlogEntity> implements BlogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BlogEntity> page = this.page(
                new Query<BlogEntity>().getPage(params),
                new QueryWrapper<BlogEntity>()
        );

        return new PageUtils(page);
    }

}