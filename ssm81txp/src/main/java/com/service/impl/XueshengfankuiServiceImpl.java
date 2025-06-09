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


import com.dao.XueshengfankuiDao;
import com.entity.XueshengfankuiEntity;
import com.service.XueshengfankuiService;
import com.entity.vo.XueshengfankuiVO;
import com.entity.view.XueshengfankuiView;

@Service("xueshengfankuiService")
public class XueshengfankuiServiceImpl extends ServiceImpl<XueshengfankuiDao, XueshengfankuiEntity> implements XueshengfankuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengfankuiEntity> page = this.selectPage(
                new Query<XueshengfankuiEntity>(params).getPage(),
                new EntityWrapper<XueshengfankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengfankuiEntity> wrapper) {
		  Page<XueshengfankuiView> page =new Query<XueshengfankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengfankuiVO> selectListVO(Wrapper<XueshengfankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengfankuiVO selectVO(Wrapper<XueshengfankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengfankuiView> selectListView(Wrapper<XueshengfankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengfankuiView selectView(Wrapper<XueshengfankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
