package com.entity.vo;

import com.entity.JianshenfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健身房
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public class JianshenfangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
