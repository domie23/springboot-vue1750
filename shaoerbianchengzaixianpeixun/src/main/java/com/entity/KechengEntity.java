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
 * 课程信息
 *
 * @author 
 * @email
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengEntity() {

	}

	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程编号
     */
    @TableField(value = "kecheng_uuid_number")

    private String kechengUuidNumber;


    /**
     * 课程名称
     */
    @TableField(value = "kecheng_name")

    private String kechengName;


    /**
     * 课程类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 课程图片
     */
    @TableField(value = "kecheng_photo")

    private String kechengPhoto;


    /**
     * 年龄段
     */
    @TableField(value = "nianlingduan_types")

    private Integer nianlingduanTypes;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 报名费用
     */
    @TableField(value = "kecheng_number")

    private Double kechengNumber;


    /**
     * 课程简介
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }
    /**
	 * 获取：课程编号
	 */

    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }
    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }
    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：课程图片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }
    /**
	 * 获取：课程图片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：年龄段
	 */
    public Integer getNianlingduanTypes() {
        return nianlingduanTypes;
    }
    /**
	 * 获取：年龄段
	 */

    public void setNianlingduanTypes(Integer nianlingduanTypes) {
        this.nianlingduanTypes = nianlingduanTypes;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：报名费用
	 */
    public Double getKechengNumber() {
        return kechengNumber;
    }
    /**
	 * 获取：报名费用
	 */

    public void setKechengNumber(Double kechengNumber) {
        this.kechengNumber = kechengNumber;
    }
    /**
	 * 设置：课程简介
	 */
    public String getKechengContent() {
        return kechengContent;
    }
    /**
	 * 获取：课程简介
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
            "id=" + id +
            ", kechengUuidNumber=" + kechengUuidNumber +
            ", kechengName=" + kechengName +
            ", kechengTypes=" + kechengTypes +
            ", kechengPhoto=" + kechengPhoto +
            ", nianlingduanTypes=" + nianlingduanTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", kechengNumber=" + kechengNumber +
            ", kechengContent=" + kechengContent +
            ", createTime=" + createTime +
        "}";
    }
}
