package cn.aixuxi.mdblog.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 类描述 处理新增和更新的基础数据填充
 *
 * @author ruozhuliufeng
 * @version 1.0
 * @date 2020/9/21 12:06
 */
@Component
public class MetaHandler implements MetaObjectHandler {
    /**
     * 功能描述: 新增数据执行
     * @param metaObject 1
     * @return : void
     * @author : ruozhuliufeng
     * @date : 2020/9/21 12:07
     */
    @Override
    public void insertFill(MetaObject metaObject) {
//        SysUserEntity userEntity = ShiroUtil.getUser();
//        this.setFieldValByName("createTime", new Date(), metaObject);
//        this.setFieldValByName("createMember", userEntity.getLoginName(), metaObject);
//        this.setFieldValByName("updateTime", new Date(), metaObject);
//        this.setFieldValByName("updateMember", userEntity.getLoginName(), metaObject);
    }

    /**
     * 功能描述: 更新数据执行
     * @param metaObject 1
     * @return : void
     * @author : ruozhuliufeng
     * @date : 2020/9/21 12:08
     */
    @Override
    public void updateFill(MetaObject metaObject) {
//        SysUserEntity userEntity = ShiroUtil.getUser();
//        this.setFieldValByName("updateTime", new Date(), metaObject);
//        this.setFieldValByName("updateMember", userEntity.getLoginName(), metaObject);
    }
}
