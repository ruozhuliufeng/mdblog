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
@TableName("mb_blog")
public class BlogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer blogId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * HTML内容
	 */
	private String htmlMaterial;
	/**
	 * MD格式内容
	 */
	private String mdMaterial;
	/**
	 * 图片链接
	 */
	private String imgurl;
	/**
	 * 博客介绍
	 */
	private String info;
	/**
	 * 所属用户
	 */
	private Integer memberId;
	/**
	 * 博客点击量
	 */
	private Integer hits;
	/**
	 * 是否参与排行 0 不参与 1 参与
	 */
	private Integer top;
	/**
	 * 博客类别 0 公开 1 保护 2 私有
	 */
	private Integer type;
	/**
	 * 创建用户
	 */
	private String createMember;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新用户
	 */
	private String updateMember;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
