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


import com.dao.DiscussjianshenfangDao;
import com.entity.DiscussjianshenfangEntity;
import com.service.DiscussjianshenfangService;
import com.entity.vo.DiscussjianshenfangVO;
import com.entity.view.DiscussjianshenfangView;

@Service("discussjianshenfangService")
public class DiscussjianshenfangServiceImpl extends ServiceImpl<DiscussjianshenfangDao, DiscussjianshenfangEntity> implements DiscussjianshenfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenfangEntity> page = this.selectPage(
                new Query<DiscussjianshenfangEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenfangEntity> wrapper) {
		  Page<DiscussjianshenfangView> page =new Query<DiscussjianshenfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenfangVO> selectListVO(Wrapper<DiscussjianshenfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenfangVO selectVO(Wrapper<DiscussjianshenfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenfangView> selectListView(Wrapper<DiscussjianshenfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenfangView selectView(Wrapper<DiscussjianshenfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
