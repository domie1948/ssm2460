package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengfankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengfankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengfankuiView;


/**
 * 学生反馈
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public interface XueshengfankuiService extends IService<XueshengfankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengfankuiVO> selectListVO(Wrapper<XueshengfankuiEntity> wrapper);
   	
   	XueshengfankuiVO selectVO(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
   	
   	List<XueshengfankuiView> selectListView(Wrapper<XueshengfankuiEntity> wrapper);
   	
   	XueshengfankuiView selectView(@Param("ew") Wrapper<XueshengfankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengfankuiEntity> wrapper);
   	
}

