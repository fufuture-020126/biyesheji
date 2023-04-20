package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Goods_in;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface Goods_inMapper extends BaseMapper<Goods_in> {
    IPage pageCC(IPage<Goods_in> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
