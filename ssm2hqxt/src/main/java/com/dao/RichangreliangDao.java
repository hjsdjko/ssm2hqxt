package com.dao;

import com.entity.RichangreliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichangreliangVO;
import com.entity.view.RichangreliangView;


/**
 * 日常热量
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface RichangreliangDao extends BaseMapper<RichangreliangEntity> {
	
	List<RichangreliangVO> selectListVO(@Param("ew") Wrapper<RichangreliangEntity> wrapper);
	
	RichangreliangVO selectVO(@Param("ew") Wrapper<RichangreliangEntity> wrapper);
	
	List<RichangreliangView> selectListView(@Param("ew") Wrapper<RichangreliangEntity> wrapper);

	List<RichangreliangView> selectListView(Pagination page,@Param("ew") Wrapper<RichangreliangEntity> wrapper);
	
	RichangreliangView selectView(@Param("ew") Wrapper<RichangreliangEntity> wrapper);
	

}
