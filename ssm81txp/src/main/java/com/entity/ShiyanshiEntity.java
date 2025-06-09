package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实验室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:46:14
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {
		
	}
	
	public ShiyanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 实验室名称
	 */
					
	private String shiyanshimingcheng;
	
	/**
	 * 实验室机位数
	 */
					
	private Integer shiyanshijiweishu;
	
	/**
	 * 价格
	 */
					
	private Float jiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 预约时间
	 */
					
	private String yuyueshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
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
	 * 设置：价格
	 */
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
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

}
