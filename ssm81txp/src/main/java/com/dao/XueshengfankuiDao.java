package com.dao;

import com.entity.XueshengfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengfankuiVO;
import com.entity.view.XueshengfankuiView;


/**
 * 学生反馈
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface XueshengfankuiDao extends BaseMapper<XueshengfankuiEntity> {
	
	List<XueshengfankuiVO> selectListVO(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
	
	XueshengfankuiVO selectVO(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
	
	List<XueshengfankuiView> selectListView(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);

	List<XueshengfankuiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
	
	XueshengfankuiView selectView(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
	
}
