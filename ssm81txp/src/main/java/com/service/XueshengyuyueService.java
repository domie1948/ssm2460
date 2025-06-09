package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengyuyueView;


/**
 * 学生预约
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface XueshengyuyueService extends IService<XueshengyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengyuyueVO> selectListVO(Wrapper<XueshengyuyueEntity> wrapper);
   	
   	XueshengyuyueVO selectVO(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
   	
   	List<XueshengyuyueView> selectListView(Wrapper<XueshengyuyueEntity> wrapper);
   	
   	XueshengyuyueView selectView(@Param("ew") Wrapper<XueshengyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengyuyueEntity> wrapper);
   	
}

