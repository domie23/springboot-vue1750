package com.dao;

import com.entity.KechengbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengbaomingView;

/**
 * 报名记录 Dao 接口
 *
 * @author 
 */
public interface KechengbaomingDao extends BaseMapper<KechengbaomingEntity> {

   List<KechengbaomingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
