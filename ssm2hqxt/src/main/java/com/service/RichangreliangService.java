package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichangreliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichangreliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichangreliangView;


/**
 * 日常热量
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface RichangreliangService extends IService<RichangreliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichangreliangVO> selectListVO(Wrapper<RichangreliangEntity> wrapper);
   	
   	RichangreliangVO selectVO(@Param("ew") Wrapper<RichangreliangEntity> wrapper);
   	
   	List<RichangreliangView> selectListView(Wrapper<RichangreliangEntity> wrapper);
   	
   	RichangreliangView selectView(@Param("ew") Wrapper<RichangreliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichangreliangEntity> wrapper);
   	

}

