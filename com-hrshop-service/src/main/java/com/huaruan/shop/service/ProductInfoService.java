package com.huaruan.shop.service;

import com.huaruan.shop.bo.ProductInfoBO;

public interface ProductInfoService {

    //TODO 发布商品
     ProductInfoBO addProductInfo(ProductInfoBO productInfoBO);

    //TODO 删除商品
     boolean addProductInfo(Long productInfoId);

    //TODO 更新商品
    ProductInfoBO updateProductInfo(ProductInfoBO productInfoBO);

    //TODO 商品分页

}
