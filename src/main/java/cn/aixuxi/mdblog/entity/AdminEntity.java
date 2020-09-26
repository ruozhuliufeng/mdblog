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
@TableName("mb_admin")
public class AdminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer adminId;
	/**
	 * 管理员登录名
	 */
	private String adminname;
	/**
	 * 管理员密码
	 */
	private String adminpassword;
	/**
	 * 管理员昵称
	 */
	private String adminnick;
	/**
	 * 管理员邮箱
	 */
	private String adminemail;
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
