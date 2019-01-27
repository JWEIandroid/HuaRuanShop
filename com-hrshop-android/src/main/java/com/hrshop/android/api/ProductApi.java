package com.hrshop.android.api;

import com.hrshop.android.model.ProductRequest;
import com.hrshop.android.model.ProductResponse;

public interface ProductApi {

    /**
     * 添加商品
     *
     * @param request
     * @return
     */
    ProductResponse addProduct(ProductRequest request);

    /**
     * 获取商品
     *
     * @param request
     * @return
     */
    ProductResponse getProduct(ProductRequest request);

    /**
     * 更新商品
     *
     * @param request
     * @return
     */
    ProductResponse updateProduct(ProductRequest request);

    /**
     * 删除商品
     *
     * @param productId
     * @return
     */
    boolean delProduct(boolean productId);

    //todo 商品分页

}
