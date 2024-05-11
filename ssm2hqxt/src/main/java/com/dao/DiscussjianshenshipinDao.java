package com.dao;

import com.entity.DiscussjianshenshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenshipinVO;
import com.entity.view.DiscussjianshenshipinView;


/**
 * 健身视频评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface DiscussjianshenshipinDao extends BaseMapper<DiscussjianshenshipinEntity> {
	
	List<DiscussjianshenshipinVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
	
	DiscussjianshenshipinVO selectVO(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
	
	List<DiscussjianshenshipinView> selectListView(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);

	List<DiscussjianshenshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
	
	DiscussjianshenshipinView selectView(@Param("ew") Wrapper<DiscussjianshenshipinEntity> wrapper);
	

}
