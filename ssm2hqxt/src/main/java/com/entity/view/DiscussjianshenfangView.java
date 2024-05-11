package com.entity.view;

import com.entity.DiscussjianshenfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身房评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@TableName("discussjianshenfang")
public class DiscussjianshenfangView  extends DiscussjianshenfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenfangView(){
	}
 
 	public DiscussjianshenfangView(DiscussjianshenfangEntity discussjianshenfangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
