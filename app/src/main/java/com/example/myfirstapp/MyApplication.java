package com.example.myfirstapp;

import android.app.Application;

import com.bugsee.library.Bugsee;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugsee.launch(this, "71c1937d-da06-4a94-8b4d-52d08b515f96");
    }
}
