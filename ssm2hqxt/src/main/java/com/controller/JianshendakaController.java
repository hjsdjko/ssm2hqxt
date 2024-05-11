package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianshendakaEntity;
import com.entity.view.JianshendakaView;

import com.service.JianshendakaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 健身打卡
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-17 23:49:27
 */
@RestController
@RequestMapping("/jianshendaka")
public class JianshendakaController {
    @Autowired
    private JianshendakaService jianshendakaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshendakaEntity jianshendaka, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjishijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jianshendaka.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JianshendakaEntity> ew = new EntityWrapper<JianshendakaEntity>();
                if(dengjishijianstart!=null) ew.ge("dengjishijian", dengjishijianstart);
                if(dengjishijianend!=null) ew.le("dengjishijian", dengjishijianend);
		PageUtils page = jianshendakaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshendaka), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshendakaEntity jianshendaka, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjishijianend,
		HttpServletRequest request){
        EntityWrapper<JianshendakaEntity> ew = new EntityWrapper<JianshendakaEntity>();
                if(dengjishijianstart!=null) ew.ge("dengjishijian", dengjishijianstart);
                if(dengjishijianend!=null) ew.le("dengjishijian", dengjishijianend);
		PageUtils page = jianshendakaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshendaka), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshendakaEntity jianshendaka){
       	EntityWrapper<JianshendakaEntity> ew = new EntityWrapper<JianshendakaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshendaka, "jianshendaka")); 
        return R.ok().put("data", jianshendakaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshendakaEntity jianshendaka){
        EntityWrapper< JianshendakaEntity> ew = new EntityWrapper< JianshendakaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshendaka, "jianshendaka")); 
		JianshendakaView jianshendakaView =  jianshendakaService.selectView(ew);
		return R.ok("查询健身打卡成功").put("data", jianshendakaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshendakaEntity jianshendaka = jianshendakaService.selectById(id);
        return R.ok().put("data", jianshendaka);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshendakaEntity jianshendaka = jianshendakaService.selectById(id);
        return R.ok().put("data", jianshendaka);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshendakaEntity jianshendaka, HttpServletRequest request){
    	jianshendaka.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshendaka);

        jianshendakaService.insert(jianshendaka);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshendakaEntity jianshendaka, HttpServletRequest request){
    	jianshendaka.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshendaka);

        jianshendakaService.insert(jianshendaka);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianshendakaEntity jianshendaka, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshendaka);
        jianshendakaService.updateById(jianshendaka);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshendakaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JianshendakaEntity> wrapper = new EntityWrapper<JianshendakaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = jianshendakaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
