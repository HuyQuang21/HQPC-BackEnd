package com.hq2145.hqpc.constant;

public enum DefaultPageEnum {
    PAGE(0), SIZE(10);

    public final Integer val;
    private  DefaultPageEnum(Integer val){
        this.val = val;
    }
}
