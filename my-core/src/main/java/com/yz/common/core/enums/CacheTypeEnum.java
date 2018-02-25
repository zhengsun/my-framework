package com.yz.common.core.enums;


public enum CacheTypeEnum {

    JVM(1),REDIS(2);

    private int type;

    private CacheTypeEnum(int type){
        this.type = type;
    }

    public int getType(){
        return this.type;
    }
}
