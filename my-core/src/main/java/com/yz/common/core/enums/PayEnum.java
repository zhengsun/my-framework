package com.yz.common.core.enums;

public enum PayEnum {

    WEIXIN(1),ALI(2);

    private int type;

    private PayEnum(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
