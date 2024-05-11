package com.dao;

import com.entity.DiscussjianshenfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenfangVO;
import com.entity.view.DiscussjianshenfangView;


/**
 * 健身房评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface DiscussjianshenfangDao extends BaseMapper<DiscussjianshenfangEntity> {
	
	List<DiscussjianshenfangVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
	
	DiscussjianshenfangVO selectVO(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
	
	List<DiscussjianshenfangView> selectListView(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);

	List<DiscussjianshenfangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
	
	DiscussjianshenfangView selectView(@Param("ew") Wrapper<DiscussjianshenfangEntity> wrapper);
	

}
