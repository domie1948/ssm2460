package com.dao;

import com.entity.ShiyanxuankeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanxuankeVO;
import com.entity.view.ShiyanxuankeView;


/**
 * 实验选课
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface ShiyanxuankeDao extends BaseMapper<ShiyanxuankeEntity> {
	
	List<ShiyanxuankeVO> selectListVO(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
	
	ShiyanxuankeVO selectVO(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
	
	List<ShiyanxuankeView> selectListView(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);

	List<ShiyanxuankeView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
	
	ShiyanxuankeView selectView(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
	
}
