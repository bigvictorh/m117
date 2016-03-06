package com.ashokslsk.m117projectalpha;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Victor on 3/2/2016.
 */
public class AwesomeFirebase extends Application {

    private static final String TAG = "AwesomeFirebase";


    @Override
    public void onCreate() {
        super.onCreate();
        com.firebase.client.Firebase.setAndroidContext(this);
    }
}
