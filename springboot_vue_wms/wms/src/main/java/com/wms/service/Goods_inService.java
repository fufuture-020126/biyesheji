package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Goods_in;


public interface Goods_inService extends IService<Goods_in> {
    IPage pageCC(IPage<Goods_in> page, Wrapper wrapper);
}
