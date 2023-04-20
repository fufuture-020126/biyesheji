package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Goods_out;
import com.wms.service.Goods_outService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wms.mapper.Goods_outMapper;


@Service
public class Goods_outServiceImpl extends ServiceImpl<Goods_outMapper, Goods_out> implements Goods_outService {

    @Resource
    private Goods_outMapper goods_outMapper;
    @Override
    public IPage pageCC(IPage<Goods_out> page, Wrapper wrapper) {
        return goods_outMapper.pageCC(page,wrapper);
    }
}
