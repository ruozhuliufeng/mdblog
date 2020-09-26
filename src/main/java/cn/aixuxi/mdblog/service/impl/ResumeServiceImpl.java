package cn.aixuxi.mdblog.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.aixuxi.mdblog.util.PageUtils;
import cn.aixuxi.mdblog.util.Query;

import cn.aixuxi.mdblog.dao.ResumeDao;
import cn.aixuxi.mdblog.entity.ResumeEntity;
import cn.aixuxi.mdblog.service.ResumeService;


@Service("resumeService")
public class ResumeServiceImpl extends ServiceImpl<ResumeDao, ResumeEntity> implements ResumeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeEntity> page = this.page(
                new Query<ResumeEntity>().getPage(params),
                new QueryWrapper<ResumeEntity>()
        );

        return new PageUtils(page);
    }

}