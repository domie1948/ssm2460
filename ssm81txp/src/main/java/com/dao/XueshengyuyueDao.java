package com.dao;

import com.entity.XueshengyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengyuyueVO;
import com.entity.view.XueshengyuyueView;


/**
 * 学生预约
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface XueshengyuyueDao extends BaseMapper<XueshengyuyueEntity> {
	
	List<XueshengyuyueVO> selectListVO(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
	
	XueshengyuyueVO selectVO(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
	
	List<XueshengyuyueView> selectListView(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);

	List<XueshengyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
	
	XueshengyuyueView selectView(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
	
}
