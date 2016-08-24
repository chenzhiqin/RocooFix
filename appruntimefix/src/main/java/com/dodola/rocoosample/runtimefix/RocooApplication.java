/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.dodola.rocoosample.runtimefix;

import android.app.Application;
import android.content.Context;

import com.dodola.rocoofix.RocooFix;

/**
 * Created by sunpengfei on 16/5/24.
 */
public class RocooApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 打补丁,init的都是在application attach的时候,加载另一个dex.
        // 防止被打上CLASS_ISPREVERIFIED
        RocooFix.init(this);
    }
}
