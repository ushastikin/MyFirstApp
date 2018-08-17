package com.example.myfirstapp;

import android.app.Application;

import com.bugsee.library.Bugsee;
import com.appspector.sdk.AppSpector;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugsee.launch(this, "71c1937d-da06-4a94-8b4d-52d08b515f96");

        // We recommend to start AppSpector from Application#onCreate method

        // You can start all monitors
        AppSpector
                .build(this)
                .withDefaultMonitors()
                .run("OGJjOTE4YTQtMzhjMi00YTRiLThkMGQtNDc5YTcxMzM1NGE0");

//        // Or you can select monitors that you want to use
//        AppSpector
//                .build(this)
//                .addPerformanceMonitor()
//                .addHttpMonitor()
//                // If specific monitor is not added then this kind of data won't be tracked and available on the web
//                .addLogMonitor()
//                .addScreenshotMonitor()
//                .addSQLMonitor()
//                .run("OGJjOTE4YTQtMzhjMi00YTRiLThkMGQtNDc5YTcxMzM1NGE0");
    }
}
