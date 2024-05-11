package com.dao;

import com.entity.JianshendakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshendakaVO;
import com.entity.view.JianshendakaView;


/**
 * 健身打卡
 * 
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
public interface JianshendakaDao extends BaseMapper<JianshendakaEntity> {
	
	List<JianshendakaVO> selectListVO(@Param("ew") Wrapper<JianshendakaEntity> wrapper);
	
	JianshendakaVO selectVO(@Param("ew") Wrapper<JianshendakaEntity> wrapper);
	
	List<JianshendakaView> selectListView(@Param("ew") Wrapper<JianshendakaEntity> wrapper);

	List<JianshendakaView> selectListView(Pagination page,@Param("ew") Wrapper<JianshendakaEntity> wrapper);
	
	JianshendakaView selectView(@Param("ew") Wrapper<JianshendakaEntity> wrapper);
	

}
