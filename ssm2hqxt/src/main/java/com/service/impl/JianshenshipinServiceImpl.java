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


import com.dao.JianshenshipinDao;
import com.entity.JianshenshipinEntity;
import com.service.JianshenshipinService;
import com.entity.vo.JianshenshipinVO;
import com.entity.view.JianshenshipinView;

@Service("jianshenshipinService")
public class JianshenshipinServiceImpl extends ServiceImpl<JianshenshipinDao, JianshenshipinEntity> implements JianshenshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenshipinEntity> page = this.selectPage(
                new Query<JianshenshipinEntity>(params).getPage(),
                new EntityWrapper<JianshenshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenshipinEntity> wrapper) {
		  Page<JianshenshipinView> page =new Query<JianshenshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenshipinVO> selectListVO(Wrapper<JianshenshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenshipinVO selectVO(Wrapper<JianshenshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenshipinView> selectListView(Wrapper<JianshenshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenshipinView selectView(Wrapper<JianshenshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
