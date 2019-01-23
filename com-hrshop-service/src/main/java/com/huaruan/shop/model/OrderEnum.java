package com.huaruan.shop.model;

public enum OrderEnum implements BaseEnum {
    /**
     * 订单状态 1交易成功 2交易关闭 3未付款 4配送中
     */
    SUCCESS(1, "交易成功 "),
    FAIL(2, "交易关闭"),
    NOT_PAID(3, "未付款"),
    SENDING(4, "配送中");

    private int code;
    private String label;

    OrderEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public OrderEnum forValue(int code) {
        for (OrderEnum item : values()) {
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
