package com.entity.vo;

import com.entity.RichangreliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 日常热量
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public class RichangreliangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
