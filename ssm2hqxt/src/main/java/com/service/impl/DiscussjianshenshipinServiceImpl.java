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


import com.dao.DiscussjianshenshipinDao;
import com.entity.DiscussjianshenshipinEntity;
import com.service.DiscussjianshenshipinService;
import com.entity.vo.DiscussjianshenshipinVO;
import com.entity.view.DiscussjianshenshipinView;

@Service("discussjianshenshipinService")
public class DiscussjianshenshipinServiceImpl extends ServiceImpl<DiscussjianshenshipinDao, DiscussjianshenshipinEntity> implements DiscussjianshenshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenshipinEntity> page = this.selectPage(
                new Query<DiscussjianshenshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenshipinEntity> wrapper) {
		  Page<DiscussjianshenshipinView> page =new Query<DiscussjianshenshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenshipinVO> selectListVO(Wrapper<DiscussjianshenshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenshipinVO selectVO(Wrapper<DiscussjianshenshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenshipinView> selectListView(Wrapper<DiscussjianshenshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenshipinView selectView(Wrapper<DiscussjianshenshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
