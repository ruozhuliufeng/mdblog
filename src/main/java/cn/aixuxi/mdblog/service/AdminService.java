package cn.aixuxi.mdblog.service;

import cn.aixuxi.mdblog.util.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import cn.aixuxi.mdblog.entity.AdminEntity;

import java.util.Map;

/**
 * 
 *
 * @author ruozhuliufeng
 * @email ruozhuliufeng@aixuxi.cn
 * @date 2020-09-26 13:46:16
 */
public interface AdminService extends IService<AdminEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

