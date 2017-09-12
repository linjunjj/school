package com.linjun.util;

public enum  IsEnum {
    NUM1(1), NUM2(2), NUM3(3);

    private int value;

    private IsEnum(int num) {
        this.value = num;
    }

    public int toValue() {
        return value;
    }
}
