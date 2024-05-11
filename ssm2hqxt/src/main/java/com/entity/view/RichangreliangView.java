package com.entity.view;

import com.entity.RichangreliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日常热量
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@TableName("richangreliang")
public class RichangreliangView  extends RichangreliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RichangreliangView(){
	}
 
 	public RichangreliangView(RichangreliangEntity richangreliangEntity){
 	try {
			BeanUtils.copyProperties(this, richangreliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
