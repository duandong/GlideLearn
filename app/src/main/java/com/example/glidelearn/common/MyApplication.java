package com.example.glidelearn.common;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * 获取context对象
     *
     * @return
     */
    public static synchronized Context getContext() {
        return mContext;
    }
}
