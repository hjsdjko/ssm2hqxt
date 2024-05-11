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
 * 健身房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
@TableName("jianshenfang")
public class JianshenfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianshenfangEntity() {
		
	}
	
	public JianshenfangEntity(T t) {
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
	 * 健身房名称
	 */
					
	private String jianshenfangmingcheng;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 健身房地址
	 */
					
	private String jianshenfangdizhi;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 健身房封面
	 */
					
	private String jianshenfangfengmian;
	
	/**
	 * 营业时间
	 */
					
	private String yingyeshijian;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：健身房封面
	 */
	public void setJianshenfangfengmian(String jianshenfangfengmian) {
		this.jianshenfangfengmian = jianshenfangfengmian;
	}
	/**
	 * 获取：健身房封面
	 */
	public String getJianshenfangfengmian() {
		return jianshenfangfengmian;
	}
	/**
	 * 设置：营业时间
	 */
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}

}
