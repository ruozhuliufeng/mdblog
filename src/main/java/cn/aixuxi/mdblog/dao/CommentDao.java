package cn.aixuxi.mdblog.dao;

import cn.aixuxi.mdblog.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ruozhuliufeng
 * @email ruozhuliufeng@aixuxi.cn
 * @date 2020-09-26 13:46:16
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
