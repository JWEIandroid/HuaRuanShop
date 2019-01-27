package com.huaruan.shop.service.impl;

import com.huaruan.shop.bo.SysProductBO;
import com.huaruan.shop.dao.SysProductMapper;
import com.huaruan.shop.entity.SysProductDO;
import com.huaruan.shop.entity.SysProductDOExample;
import com.huaruan.shop.service.ProductService;
import com.huaruan.shop.util.BeanMapperUtil;
import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    SysProductMapper sysProductMapper;

    private Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public SysProductBO addProduct(SysProductBO sysProductBO) {
        SysProductDO sysProductDO = BeanMapperUtil.map(sysProductBO, SysProductDO.class);
        if (sysProductDO == null) {
            return null;
        }
        int count = sysProductMapper.insert(sysProductDO);
        if (count <= 0) {
            logger.error("添加商品失敗，内部异常");
            return null;
        }
        SysProductDOExample example = new SysProductDOExample();
        example.createCriteria().andIdEqualTo(sysProductDO.getId());
        return BeanMapperUtil.map(sysProductMapper.selectByExample(example), SysProductBO.class);
    }

    @Override
    public SysProductBO getProduct(SysProductBO sysProductBO) {
        return null;
    }

    @Override
    public SysProductBO updateProduct(SysProductBO sysProductBO) {
        return null;
    }

    @Override
    public boolean delProduct(Long productId) {
        if (productId == null || productId <= 0) {
            return false;
        }
        SysProductDOExample example = new SysProductDOExample();
        example.createCriteria().andIdEqualTo(productId);
        int count = sysProductMapper.deleteByExample(example);
        if (count > 0) {
            logger.info("删除商品成功，id:{}", productId);
        }
        return false;
    }
}
