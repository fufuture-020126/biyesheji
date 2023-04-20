package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Goods_in;
import com.wms.service.Goods_inService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wms.mapper.Goods_inMapper;


@Service
public class Goods_inServiceImpl extends ServiceImpl<Goods_inMapper, Goods_in> implements Goods_inService {

    @Resource
    private Goods_inMapper goods_inMapper;
    @Override
    public IPage pageCC(IPage<Goods_in> page, Wrapper wrapper) {
        return goods_inMapper.pageCC(page,wrapper);
    }
}
