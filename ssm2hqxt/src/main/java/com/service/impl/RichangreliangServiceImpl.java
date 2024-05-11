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


import com.dao.RichangreliangDao;
import com.entity.RichangreliangEntity;
import com.service.RichangreliangService;
import com.entity.vo.RichangreliangVO;
import com.entity.view.RichangreliangView;

@Service("richangreliangService")
public class RichangreliangServiceImpl extends ServiceImpl<RichangreliangDao, RichangreliangEntity> implements RichangreliangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichangreliangEntity> page = this.selectPage(
                new Query<RichangreliangEntity>(params).getPage(),
                new EntityWrapper<RichangreliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichangreliangEntity> wrapper) {
		  Page<RichangreliangView> page =new Query<RichangreliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichangreliangVO> selectListVO(Wrapper<RichangreliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichangreliangVO selectVO(Wrapper<RichangreliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichangreliangView> selectListView(Wrapper<RichangreliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichangreliangView selectView(Wrapper<RichangreliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
