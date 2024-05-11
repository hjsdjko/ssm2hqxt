package com.entity.vo;

import com.entity.YuyuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 预约信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public class YuyuexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
