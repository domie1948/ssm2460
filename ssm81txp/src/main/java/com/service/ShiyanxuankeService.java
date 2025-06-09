package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanxuankeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanxuankeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanxuankeView;


/**
 * 实验选课
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface ShiyanxuankeService extends IService<ShiyanxuankeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanxuankeVO> selectListVO(Wrapper<ShiyanxuankeEntity> wrapper);
   	
   	ShiyanxuankeVO selectVO(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
   	
   	List<ShiyanxuankeView> selectListView(Wrapper<ShiyanxuankeEntity> wrapper);
   	
   	ShiyanxuankeView selectView(@Param("ew") Wrapper<ShiyanxuankeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanxuankeEntity> wrapper);
   	
}

