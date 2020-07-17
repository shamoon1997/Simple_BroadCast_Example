package com.example.broadcaststart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    class myownreceiver: BroadcastReceiver()
    {
        override fun onReceive(context: Context, intent: Intent) {
            Toast.makeText(context,"Air plane mod",Toast.LENGTH_SHORT ).show();


        }

    }
    private lateinit var nextactivity_button : Button ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextactivity_button=findViewById(R.id.button)
        val br=myownreceiver();
        val filter= IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).apply {
            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        }
        registerReceiver(br,filter);



        nextactivity_button.setOnClickListener()
        {
            intent= Intent(this,MainActivity2::class.java);
            startActivity(intent);
        }

   }

    
}