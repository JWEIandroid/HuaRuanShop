package com.huaruan.shop.service;

import com.huaruan.shop.bo.SysProductBO;

public interface ProductService {

    /**
     * 添加商品
     *
     * @param sysProductBO
     * @return
     */
    SysProductBO addProduct(SysProductBO sysProductBO);

    /**
     * 获取商品
     *
     * @param sysProductBO
     * @return
     */
    SysProductBO getProduct(SysProductBO sysProductBO);

    /**
     * 更新商品
     *
     * @param sysProductBO
     * @return
     */
    SysProductBO updateProduct(SysProductBO sysProductBO);

    /**
     * 删除商品
     *
     * @param productId
     * @return
     */
    boolean delProduct(Long productId);

    //todo 商品分页


}
