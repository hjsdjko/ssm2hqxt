package com.entity.vo;

import com.entity.JianshenxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健身项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public class JianshenxiangmuVO  implements Serializable {
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
	 * 适合人群
	 */
	
	private String shiherenqun;
		
	/**
	 * 项目价格
	 */
	
	private String xiangmujiage;
		
	/**
	 * 课时数
	 */
	
	private String keshishu;
		
	/**
	 * 健身房名称
	 */
	
	private String jianshenfangmingcheng;
		
	/**
	 * 健身房地址
	 */
	
	private String jianshenfangdizhi;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
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
	 * 设置：适合人群
	 */
	 
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
				
	
	/**
	 * 设置：项目价格
	 */
	 
	public void setXiangmujiage(String xiangmujiage) {
		this.xiangmujiage = xiangmujiage;
	}
	
	/**
	 * 获取：项目价格
	 */
	public String getXiangmujiage() {
		return xiangmujiage;
	}
				
	
	/**
	 * 设置：课时数
	 */
	 
	public void setKeshishu(String keshishu) {
		this.keshishu = keshishu;
	}
	
	/**
	 * 获取：课时数
	 */
	public String getKeshishu() {
		return keshishu;
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
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
