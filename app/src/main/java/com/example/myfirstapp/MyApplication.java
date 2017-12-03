package com.example.myfirstapp;

import android.app.Application;

import com.bugsee.library.Bugsee;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugsee.launch(this, "fdc9e6c4-be19-494b-b059-c37d19283054");
    }
}
