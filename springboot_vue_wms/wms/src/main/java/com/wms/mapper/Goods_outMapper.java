package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Goods_out;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface Goods_outMapper extends BaseMapper<Goods_out> {
    IPage pageCC(IPage<Goods_out> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
