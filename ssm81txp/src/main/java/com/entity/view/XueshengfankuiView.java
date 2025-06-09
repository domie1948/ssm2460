package com.entity.view;

import com.entity.XueshengfankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
@TableName("xueshengfankui")
public class XueshengfankuiView  extends XueshengfankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengfankuiView(){
	}
 
 	public XueshengfankuiView(XueshengfankuiEntity xueshengfankuiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengfankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
