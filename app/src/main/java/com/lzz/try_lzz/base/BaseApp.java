package com.lzz.try_lzz.base;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

public class BaseApp extends Application{
    public static Context context;
    public static Context getContext(){
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initBugly();
    }

    public void initBugly() {
        Log.d("lzz1",">>>>>>>>>>>>>");
        CrashReport.initCrashReport(getApplicationContext(),"6e2e70d794",false);
    }

}
