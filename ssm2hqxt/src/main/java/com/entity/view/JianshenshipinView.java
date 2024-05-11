package com.entity.view;

import com.entity.JianshenshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
@TableName("jianshenshipin")
public class JianshenshipinView  extends JianshenshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenshipinView(){
	}
 
 	public JianshenshipinView(JianshenshipinEntity jianshenshipinEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
