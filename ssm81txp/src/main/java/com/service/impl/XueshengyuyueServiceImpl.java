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


import com.dao.XueshengyuyueDao;
import com.entity.XueshengyuyueEntity;
import com.service.XueshengyuyueService;
import com.entity.vo.XueshengyuyueVO;
import com.entity.view.XueshengyuyueView;

@Service("xueshengyuyueService")
public class XueshengyuyueServiceImpl extends ServiceImpl<XueshengyuyueDao, XueshengyuyueEntity> implements XueshengyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengyuyueEntity> page = this.selectPage(
                new Query<XueshengyuyueEntity>(params).getPage(),
                new EntityWrapper<XueshengyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengyuyueEntity> wrapper) {
		  Page<XueshengyuyueView> page =new Query<XueshengyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengyuyueVO> selectListVO(Wrapper<XueshengyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengyuyueVO selectVO(Wrapper<XueshengyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengyuyueView> selectListView(Wrapper<XueshengyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengyuyueView selectView(Wrapper<XueshengyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
