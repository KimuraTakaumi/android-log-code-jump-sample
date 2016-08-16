package com.hatenablog.techium.samplelogsorucejump.sample2;

import com.hatenablog.techium.samplelogsorucejump.CustomLog;

public class Sample {
    private static final String TAG = "sample2";

    public void show(){
        CustomLog.d(TAG, "test");
        CustomLog.d2(TAG, "test");
    }
}
