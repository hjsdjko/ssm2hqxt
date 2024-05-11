package com.entity.view;

import com.entity.XiangmumingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
@TableName("xiangmumingcheng")
public class XiangmumingchengView  extends XiangmumingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmumingchengView(){
	}
 
 	public XiangmumingchengView(XiangmumingchengEntity xiangmumingchengEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmumingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
