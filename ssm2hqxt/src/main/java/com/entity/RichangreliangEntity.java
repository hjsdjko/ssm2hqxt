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
 * 日常热量
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@TableName("richangreliang")
public class RichangreliangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RichangreliangEntity() {
		
	}
	
	public RichangreliangEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 早餐搭配
	 */
					
	private String zaocandapei;
	
	/**
	 * 午餐搭配
	 */
					
	private String wucandapei;
	
	/**
	 * 晚餐搭配
	 */
					
	private String wancandapei;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
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
	 * 设置：早餐搭配
	 */
	public void setZaocandapei(String zaocandapei) {
		this.zaocandapei = zaocandapei;
	}
	/**
	 * 获取：早餐搭配
	 */
	public String getZaocandapei() {
		return zaocandapei;
	}
	/**
	 * 设置：午餐搭配
	 */
	public void setWucandapei(String wucandapei) {
		this.wucandapei = wucandapei;
	}
	/**
	 * 获取：午餐搭配
	 */
	public String getWucandapei() {
		return wucandapei;
	}
	/**
	 * 设置：晚餐搭配
	 */
	public void setWancandapei(String wancandapei) {
		this.wancandapei = wancandapei;
	}
	/**
	 * 获取：晚餐搭配
	 */
	public String getWancandapei() {
		return wancandapei;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}

}
