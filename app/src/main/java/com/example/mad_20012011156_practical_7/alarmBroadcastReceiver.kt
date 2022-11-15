package com.example.mad_20012011156_practical_7

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class alarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val str1 = intent.getStringExtra("Service1")
        if(str1 == "Start" || str1 == "Stop")
        {
            val intentService = Intent(context, Alarmservice::class.java)
            intentService.putExtra("Service1", intent.getStringExtra("Service1"))
            if(str1 == "Start")
            {
                context.startService(intentService)
            }
            else if(str1=="Stop") {
                context.stopService(intentService)
            }
        }
    }
}