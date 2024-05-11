package com.entity.view;

import com.entity.DiscussjianshenshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@TableName("discussjianshenshipin")
public class DiscussjianshenshipinView  extends DiscussjianshenshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenshipinView(){
	}
 
 	public DiscussjianshenshipinView(DiscussjianshenshipinEntity discussjianshenshipinEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
