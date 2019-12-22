package com.lyg.bitmap;

/**
 * Created by Niki on 2019-12-22 21:23
 * Email: m13296644326@163.com
 */
public class BitmapShareManager {
    private static final BitmapShareManager ourInstance = new BitmapShareManager();

    public static BitmapShareManager getInstance() {
        return ourInstance;
    }

    private BitmapShareManager() {
    }

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
