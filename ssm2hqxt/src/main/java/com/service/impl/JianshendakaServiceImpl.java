package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianshendakaDao;
import com.entity.JianshendakaEntity;
import com.service.JianshendakaService;
import com.entity.vo.JianshendakaVO;
import com.entity.view.JianshendakaView;

@Service("jianshendakaService")
public class JianshendakaServiceImpl extends ServiceImpl<JianshendakaDao, JianshendakaEntity> implements JianshendakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshendakaEntity> page = this.selectPage(
                new Query<JianshendakaEntity>(params).getPage(),
                new EntityWrapper<JianshendakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshendakaEntity> wrapper) {
		  Page<JianshendakaView> page =new Query<JianshendakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshendakaVO> selectListVO(Wrapper<JianshendakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshendakaVO selectVO(Wrapper<JianshendakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshendakaView> selectListView(Wrapper<JianshendakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshendakaView selectView(Wrapper<JianshendakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
