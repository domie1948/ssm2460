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


import com.dao.ShiyanxuankeDao;
import com.entity.ShiyanxuankeEntity;
import com.service.ShiyanxuankeService;
import com.entity.vo.ShiyanxuankeVO;
import com.entity.view.ShiyanxuankeView;

@Service("shiyanxuankeService")
public class ShiyanxuankeServiceImpl extends ServiceImpl<ShiyanxuankeDao, ShiyanxuankeEntity> implements ShiyanxuankeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanxuankeEntity> page = this.selectPage(
                new Query<ShiyanxuankeEntity>(params).getPage(),
                new EntityWrapper<ShiyanxuankeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanxuankeEntity> wrapper) {
		  Page<ShiyanxuankeView> page =new Query<ShiyanxuankeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanxuankeVO> selectListVO(Wrapper<ShiyanxuankeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanxuankeVO selectVO(Wrapper<ShiyanxuankeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanxuankeView> selectListView(Wrapper<ShiyanxuankeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanxuankeView selectView(Wrapper<ShiyanxuankeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
