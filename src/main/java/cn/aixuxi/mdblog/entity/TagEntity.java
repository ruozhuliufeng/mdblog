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
@TableName("mb_tag")
public class TagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标签主键
	 */
	@TableId
	private Integer tagId;
	/**
	 * 标签名称
	 */
	private String tagName;
	/**
	 * 创建用户
	 */
	private String createMember;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改用户
	 */
	private String updateMember;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}
