package cn.aixuxi.mdblog.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.aixuxi.mdblog.util.PageUtils;
import cn.aixuxi.mdblog.util.Query;

import cn.aixuxi.mdblog.dao.UpdateRecodDao;
import cn.aixuxi.mdblog.entity.UpdateRecodEntity;
import cn.aixuxi.mdblog.service.UpdateRecodService;


@Service("updateRecodService")
public class UpdateRecodServiceImpl extends ServiceImpl<UpdateRecodDao, UpdateRecodEntity> implements UpdateRecodService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UpdateRecodEntity> page = this.page(
                new Query<UpdateRecodEntity>().getPage(params),
                new QueryWrapper<UpdateRecodEntity>()
        );

        return new PageUtils(page);
    }

}