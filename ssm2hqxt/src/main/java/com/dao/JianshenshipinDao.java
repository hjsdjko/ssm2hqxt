package com.dao;

import com.entity.JianshenshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenshipinVO;
import com.entity.view.JianshenshipinView;


/**
 * 健身视频
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public interface JianshenshipinDao extends BaseMapper<JianshenshipinEntity> {
	
	List<JianshenshipinVO> selectListVO(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
	
	JianshenshipinVO selectVO(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
	
	List<JianshenshipinView> selectListView(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);

	List<JianshenshipinView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
	
	JianshenshipinView selectView(@Param("ew") Wrapper<JianshenshipinEntity> wrapper);
	

}
