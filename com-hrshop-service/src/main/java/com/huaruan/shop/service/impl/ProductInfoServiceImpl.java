package com.huaruan.shop.service.impl;

import com.huaruan.shop.bo.ProductInfoBO;
import com.huaruan.shop.dao.ProductInfoMapper;
import com.huaruan.shop.entity.ProductInfoDO;
import com.huaruan.shop.service.ProductInfoService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfoBO addProductInfo(ProductInfoBO productInfoBO) {
        ProductInfoDO productInfoDO = new ProductInfoDO();
        BeanUtils.copyProperties(productInfoBO, productInfoDO);
        int count = productInfoMapper.insert(productInfoDO);
        if (count <= 0) {
            logger.info("添加商品失败");
            return null;
        }
        ProductInfoDO result_do = productInfoMapper.selectByPrimaryKey(productInfoDO.getId());
        ProductInfoBO result = new ProductInfoBO();
        BeanUtils.copyProperties(result, result_do);
        return result;
    }

    @Override
    public boolean addProductInfo(Long productInfoId) {
        return false;
    }

    @Override
    public ProductInfoBO updateProductInfo(ProductInfoBO productInfoBO) {
        return null;
    }
}
