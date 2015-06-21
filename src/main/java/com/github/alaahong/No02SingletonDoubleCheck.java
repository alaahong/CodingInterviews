package com.github.alaahong;

/**
 * Created by ian.zhang on 2015/6/21.
 */
public class No02SingletonDoubleCheck {
    private volatile static No02SingletonDoubleCheck instance = null;

    private No02SingletonDoubleCheck() {
    }

    public static No02SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (No02SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new No02SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
