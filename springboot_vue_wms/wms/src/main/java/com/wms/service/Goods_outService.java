package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Goods_out;


public interface Goods_outService extends IService<Goods_out> {

    IPage pageCC(IPage<Goods_out> page, Wrapper wrapper);
}
