package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@TableName("yuyuexinxi")
public class YuyuexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyuexinxiEntity() {
		
	}
	
	public YuyuexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 项目编号
	 */
					
	private String xiangmubianhao;
	
	/**
	 * 健身项目
	 */
					
	private String jianshenxiangmu;
	
	/**
	 * 项目封面
	 */
					
	private String xiangmufengmian;
	
	/**
	 * 健身类型
	 */
					
	private String jianshenleixing;
	
	/**
	 * 健身房名称
	 */
					
	private String jianshenfangmingcheng;
	
	/**
	 * 健身房地址
	 */
					
	private String jianshenfangdizhi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目编号
	 */
	public void setXiangmubianhao(String xiangmubianhao) {
		this.xiangmubianhao = xiangmubianhao;
	}
	/**
	 * 获取：项目编号
	 */
	public String getXiangmubianhao() {
		return xiangmubianhao;
	}
	/**
	 * 设置：健身项目
	 */
	public void setJianshenxiangmu(String jianshenxiangmu) {
		this.jianshenxiangmu = jianshenxiangmu;
	}
	/**
	 * 获取：健身项目
	 */
	public String getJianshenxiangmu() {
		return jianshenxiangmu;
	}
	/**
	 * 设置：项目封面
	 */
	public void setXiangmufengmian(String xiangmufengmian) {
		this.xiangmufengmian = xiangmufengmian;
	}
	/**
	 * 获取：项目封面
	 */
	public String getXiangmufengmian() {
		return xiangmufengmian;
	}
	/**
	 * 设置：健身类型
	 */
	public void setJianshenleixing(String jianshenleixing) {
		this.jianshenleixing = jianshenleixing;
	}
	/**
	 * 获取：健身类型
	 */
	public String getJianshenleixing() {
		return jianshenleixing;
	}
	/**
	 * 设置：健身房名称
	 */
	public void setJianshenfangmingcheng(String jianshenfangmingcheng) {
		this.jianshenfangmingcheng = jianshenfangmingcheng;
	}
	/**
	 * 获取：健身房名称
	 */
	public String getJianshenfangmingcheng() {
		return jianshenfangmingcheng;
	}
	/**
	 * 设置：健身房地址
	 */
	public void setJianshenfangdizhi(String jianshenfangdizhi) {
		this.jianshenfangdizhi = jianshenfangdizhi;
	}
	/**
	 * 获取：健身房地址
	 */
	public String getJianshenfangdizhi() {
		return jianshenfangdizhi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}

}
