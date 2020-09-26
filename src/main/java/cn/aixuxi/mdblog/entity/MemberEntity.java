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
@TableName("mb_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户主键
	 */
	@TableId
	private Integer memberId;
	/**
	 * 用户登录名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户昵称
	 */
	private String nickname;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 用户级别
	 */
	private String level;
	/**
	 * 用户QQ
	 */
	private String qq;
	/**
	 * 用户状态 0 未激活 1 激活
	 */
	private Integer status;
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
