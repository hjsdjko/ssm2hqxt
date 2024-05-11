package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenfangView;


/**
 * 健身房
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public interface JianshenfangService extends IService<JianshenfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenfangVO> selectListVO(Wrapper<JianshenfangEntity> wrapper);
   	
   	JianshenfangVO selectVO(@Param("ew") Wrapper<JianshenfangEntity> wrapper);
   	
   	List<JianshenfangView> selectListView(Wrapper<JianshenfangEntity> wrapper);
   	
   	JianshenfangView selectView(@Param("ew") Wrapper<JianshenfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenfangEntity> wrapper);
   	

}

