package com.huaruan.shop.model;

public enum StateEnum implements BaseEnum {
    /**
     * 是否禁用  0禁用 1启用
     */
    VENDOR(0, "禁用"),
    CUSTOMER(1, "使用中");

    private int code;
    private String label;

    StateEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public StateEnum forValue(int code) {
        for (StateEnum item : values()) {
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