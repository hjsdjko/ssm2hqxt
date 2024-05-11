package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenshipinView;


/**
 * 健身视频评论表
 *
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface DiscussjianshenshipinService extends IService<DiscussjianshenshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenshipinVO> selectListVO(Wrapper<DiscussjianshenshipinEntity> wrapper);
   	
   	DiscussjianshenshipinVO selectVO(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
   	
   	List<DiscussjianshenshipinView> selectListView(Wrapper<DiscussjianshenshipinEntity> wrapper);
   	
   	DiscussjianshenshipinView selectView(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenshipinEntity> wrapper);
   	

}

