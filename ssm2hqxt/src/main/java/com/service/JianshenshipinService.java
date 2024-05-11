package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenshipinView;


/**
 * 健身视频
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public interface JianshenshipinService extends IService<JianshenshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenshipinVO> selectListVO(Wrapper<JianshenshipinEntity> wrapper);
   	
   	JianshenshipinVO selectVO(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
   	
   	List<JianshenshipinView> selectListView(Wrapper<JianshenshipinEntity> wrapper);
   	
   	JianshenshipinView selectView(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenshipinEntity> wrapper);
   	

}

