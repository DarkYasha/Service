package com.tecii.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Dark Dragon on 19/11/2016.
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent arg0) { return null;}
    @Override
    public void onCreate(){super.onCreate();}
    @Override
    public void onStart(Intent intent, int startId){
        Log.e("<<MyService-onStart>>", "I am alive-1!");
        Log.e("<<MyService-onStart>>", "I did something");
    }
    @Override
    public void onDestroy()
    {Log.e("<<MyService-onDestroy>>", "I am dead-1");
    }
}
