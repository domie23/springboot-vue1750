package com.entity.view;

import com.entity.KechengbaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 报名记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kechengbaoming")
public class KechengbaomingView extends KechengbaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kecheng
			/**
			* 课程编号
			*/
			private String kechengUuidNumber;
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 课程图片
			*/
			private String kechengPhoto;
			/**
			* 年龄段
			*/
			private Integer nianlingduanTypes;
				/**
				* 年龄段的值
				*/
				private String nianlingduanValue;
			/**
			* 报名费用
			*/
			private Double kechengNumber;
			/**
			* 课程简介
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public KechengbaomingView() {

	}

	public KechengbaomingView(KechengbaomingEntity kechengbaomingEntity) {
		try {
			BeanUtils.copyProperties(this, kechengbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set kecheng

					/**
					* 获取： 课程编号
					*/
					public String getKechengUuidNumber() {
						return kechengUuidNumber;
					}
					/**
					* 设置： 课程编号
					*/
					public void setKechengUuidNumber(String kechengUuidNumber) {
						this.kechengUuidNumber = kechengUuidNumber;
					}

					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 课程图片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程图片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 年龄段
					*/
					public Integer getNianlingduanTypes() {
						return nianlingduanTypes;
					}
					/**
					* 设置： 年龄段
					*/
					public void setNianlingduanTypes(Integer nianlingduanTypes) {
						this.nianlingduanTypes = nianlingduanTypes;
					}


						/**
						* 获取： 年龄段的值
						*/
						public String getNianlingduanValue() {
							return nianlingduanValue;
						}
						/**
						* 设置： 年龄段的值
						*/
						public void setNianlingduanValue(String nianlingduanValue) {
							this.nianlingduanValue = nianlingduanValue;
						}


					/**
					* 获取： 报名费用
					*/
					public Double getKechengNumber() {
						return kechengNumber;
					}
					/**
					* 设置： 报名费用
					*/
					public void setKechengNumber(Double kechengNumber) {
						this.kechengNumber = kechengNumber;
					}

					/**
					* 获取： 课程简介
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程简介
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
