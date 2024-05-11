package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenfangView;


/**
 * 健身房评论表
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface DiscussjianshenfangService extends IService<DiscussjianshenfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenfangVO> selectListVO(Wrapper<DiscussjianshenfangEntity> wrapper);
   	
   	DiscussjianshenfangVO selectVO(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
   	
   	List<DiscussjianshenfangView> selectListView(Wrapper<DiscussjianshenfangEntity> wrapper);
   	
   	DiscussjianshenfangView selectView(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenfangEntity> wrapper);
   	

}

