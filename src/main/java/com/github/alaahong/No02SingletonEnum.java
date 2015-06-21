package com.github.alaahong;

/**
 * Created by ian.zhang on 2015/6/21.
 */
public enum No02SingletonEnum {
    INSTANCE;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.getStr();
    }
}
