package com.entity.model;

import com.entity.JianshenshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健身视频
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public class JianshenshipinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 健身项目
	 */
	
	private String jianshenxiangmu;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 教学视频
	 */
	
	private String jiaoxueshipin;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 基本介绍
	 */
	
	private String jibenjieshao;
				
	
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
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：教学视频
	 */
	 
	public void setJiaoxueshipin(String jiaoxueshipin) {
		this.jiaoxueshipin = jiaoxueshipin;
	}
	
	/**
	 * 获取：教学视频
	 */
	public String getJiaoxueshipin() {
		return jiaoxueshipin;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：基本介绍
	 */
	 
	public void setJibenjieshao(String jibenjieshao) {
		this.jibenjieshao = jibenjieshao;
	}
	
	/**
	 * 获取：基本介绍
	 */
	public String getJibenjieshao() {
		return jibenjieshao;
	}
			
}
