package com.dao;

import com.entity.JianshenfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenfangVO;
import com.entity.view.JianshenfangView;


/**
 * 健身房
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
public interface JianshenfangDao extends BaseMapper<JianshenfangEntity> {
	
	List<JianshenfangVO> selectListVO(@Param("ew") Wrapper<JianshenfangEntity> wrapper);
	
	JianshenfangVO selectVO(@Param("ew") Wrapper<JianshenfangEntity> wrapper);
	
	List<JianshenfangView> selectListView(@Param("ew") Wrapper<JianshenfangEntity> wrapper);

	List<JianshenfangView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenfangEntity> wrapper);
	
	JianshenfangView selectView(@Param("ew") Wrapper<JianshenfangEntity> wrapper);
	

}
