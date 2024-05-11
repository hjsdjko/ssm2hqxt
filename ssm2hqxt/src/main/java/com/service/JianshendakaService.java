package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshendakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshendakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshendakaView;


/**
 * 健身打卡
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface JianshendakaService extends IService<JianshendakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshendakaVO> selectListVO(Wrapper<JianshendakaEntity> wrapper);
   	
   	JianshendakaVO selectVO(@Param("ew") Wrapper<JianshendakaEntity> wrapper);
   	
   	List<JianshendakaView> selectListView(Wrapper<JianshendakaEntity> wrapper);
   	
   	JianshendakaView selectView(@Param("ew") Wrapper<JianshendakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshendakaEntity> wrapper);
   	

}

