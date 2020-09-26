package cn.aixuxi.mdblog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 类描述 设置自动填充相关表字段、设置分页
 *
 * @author ruozhuliufeng
 * @version 1.0
 * @date 2020/9/21 12:01
 */
@Configuration
@MapperScan(value={"org.jx.modules.**.mapper*"})
public class MyBatisPlusConfig {
}
