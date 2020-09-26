package cn.aixuxi.mdblog.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.aixuxi.mdblog.util.PageUtils;
import cn.aixuxi.mdblog.util.Query;

import cn.aixuxi.mdblog.dao.TagBlogDao;
import cn.aixuxi.mdblog.entity.TagBlogEntity;
import cn.aixuxi.mdblog.service.TagBlogService;


@Service("tagBlogService")
public class TagBlogServiceImpl extends ServiceImpl<TagBlogDao, TagBlogEntity> implements TagBlogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TagBlogEntity> page = this.page(
                new Query<TagBlogEntity>().getPage(params),
                new QueryWrapper<TagBlogEntity>()
        );

        return new PageUtils(page);
    }

}