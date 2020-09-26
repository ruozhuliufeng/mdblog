package cn.aixuxi.mdblog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ruozhuliufeng
 * @email ruozhuliufeng@aixuxi.cn
 * @date 2020-09-26 13:46:16
 */
@Data
@TableName("mb_update_recod")
public class UpdateRecodEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 记录主键
	 */
	@TableId
	private Integer recordId;
	/**
	 * 博客主键
	 */
	private Integer blogId;
	/**
	 * 博客创建用户
	 */
	private String mbBlogCreateMember;
	/**
	 * 博客创建时间
	 */
	private Date mbBlogCreateTime;
	/**
	 * 博客修改用户
	 */
	private String mbBlogUpdateMember;
	/**
	 * 博客修改时间
	 */
	private Date mbBlogUpdateTime;

}
