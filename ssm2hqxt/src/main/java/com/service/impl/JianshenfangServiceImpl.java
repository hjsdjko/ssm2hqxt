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


import com.dao.JianshenfangDao;
import com.entity.JianshenfangEntity;
import com.service.JianshenfangService;
import com.entity.vo.JianshenfangVO;
import com.entity.view.JianshenfangView;

@Service("jianshenfangService")
public class JianshenfangServiceImpl extends ServiceImpl<JianshenfangDao, JianshenfangEntity> implements JianshenfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenfangEntity> page = this.selectPage(
                new Query<JianshenfangEntity>(params).getPage(),
                new EntityWrapper<JianshenfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenfangEntity> wrapper) {
		  Page<JianshenfangView> page =new Query<JianshenfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenfangVO> selectListVO(Wrapper<JianshenfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenfangVO selectVO(Wrapper<JianshenfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenfangView> selectListView(Wrapper<JianshenfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenfangView selectView(Wrapper<JianshenfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
