package cn.aixuxi.mdblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.aixuxi.mdblog.util.PageUtils;
import cn.aixuxi.mdblog.entity.TagEntity;

import java.util.Map;

/**
 * 
 *
 * @author ruozhuliufeng
 * @email ruozhuliufeng@aixuxi.cn
 * @date 2020-09-26 13:46:16
 */
public interface TagService extends IService<TagEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

