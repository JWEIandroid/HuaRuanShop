package com.huaruan.shop.model;

public enum UserEnum implements BaseEnum {
    /**
     * 状态  1商户 2客户
     */
    VENDOR(1, "商户"),
    CUSTOMER(2, "客户");

    private int code;
    private String label;

    UserEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public UserEnum forValue(int code) {
        for (UserEnum item : values()) {
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