package com.lyg.bitmap;

import android.graphics.Bitmap;

import java.util.HashMap;

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

    private HashMap<String, Bitmap> bitmapSet = new HashMap<>();

    public void put(String key, Bitmap bitmap){
        bitmapSet.put(key, bitmap);
    }

    public Bitmap get(String key){
        return bitmapSet.get(key);
    }

}
