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
@TableName("mb_comment")
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 评论主键
	 */
	@TableId
	private Integer comentId;
	/**
	 * 评论用户
	 */
	private Integer memberId;
	/**
	 * 评论博客
	 */
	private Integer blogId;
	/**
	 * 评论内容
	 */
	private String comment;
	/**
	 * 评论图片
	 */
	private String imgurl;
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
