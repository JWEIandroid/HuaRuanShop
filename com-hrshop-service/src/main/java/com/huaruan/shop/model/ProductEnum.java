package com.huaruan.shop.model;

public enum ProductEnum implements BaseEnum {

    /**
     * 状态 0售罄 1在库 2下架
     */
    PRODUCT_SALE_OUT(0, "售罄"),
    PRODUCT_ALIVE(0, "在库"),
    PRDUCT_REMOVED(0, "下架");

    private int code;
    private String label;

    ProductEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public ProductEnum forValue(int code) {
        for (ProductEnum item : values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
