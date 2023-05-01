package com.learning.topics.ViewBindingDemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log


class MyBackgroundService : Service() {

    init {
        Log.e(TAG, "Service class working")
    }
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e(TAG, "Service is start")
        //return super.onStartCommand(intent, flags, startId)
        return START_STICKY
    }

    override fun onDestroy() {
        Log.e(TAG, "Service is stop")
        super.onDestroy()
    }
    companion object{
        const val TAG = "MYLOG: "
    }
}