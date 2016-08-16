package com.example.girlswhocode.mchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Girls Who Code on 8/16/2016.
 */
public class ChatLife extends Application {
    private static final String TAG = "ChatLife";
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
