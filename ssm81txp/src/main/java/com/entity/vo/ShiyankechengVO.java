package com.entity.vo;

import com.entity.ShiyankechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 实验课程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
public class ShiyankechengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 预约编号
	 */
	
	private String yuyuebianhao;
		
	/**
	 * 实验室名称
	 */
	
	private String shiyanshimingcheng;
		
	/**
	 * 实验室机位数
	 */
	
	private Integer shiyanshijiweishu;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 预约时间
	 */
	
	private String yuyueshijian;
		
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 课程详情
	 */
	
	private String kechengxiangqing;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：预约编号
	 */
	 
	public void setYuyuebianhao(String yuyuebianhao) {
		this.yuyuebianhao = yuyuebianhao;
	}
	
	/**
	 * 获取：预约编号
	 */
	public String getYuyuebianhao() {
		return yuyuebianhao;
	}
				
	
	/**
	 * 设置：实验室名称
	 */
	 
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
				
	
	/**
	 * 设置：实验室机位数
	 */
	 
	public void setShiyanshijiweishu(Integer shiyanshijiweishu) {
		this.shiyanshijiweishu = shiyanshijiweishu;
	}
	
	/**
	 * 获取：实验室机位数
	 */
	public Integer getShiyanshijiweishu() {
		return shiyanshijiweishu;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：课程详情
	 */
	 
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
