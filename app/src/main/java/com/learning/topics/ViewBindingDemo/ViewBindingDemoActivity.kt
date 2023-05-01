package com.learning.topics.ViewBindingDemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.learning.topics.R
import com.learning.topics.ViewBindingDemo.MyBackgroundService.Companion.TAG
import com.learning.topics.databinding.ActivityViewBindingDemoBinding

class ViewBindingDemoActivity : AppCompatActivity() {

    lateinit var bindingDemoActivity: ActivityViewBindingDemoBinding
    var count:Int = 0
    var serviceIsStart = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_view_binding_demo)

        bindingDemoActivity = ActivityViewBindingDemoBinding.inflate(layoutInflater)
        setContentView(bindingDemoActivity.root)
        val  intentService = Intent(this, MyBackgroundService::class.java)
        bindingDemoActivity.clickBtn.setOnClickListener {

            count++
            bindingDemoActivity.countTextView.text = "Hello Vikrant Good Morning!$count"

            if(!serviceIsStart){
                Log.e(TAG,"Service start.....")
                startService(intentService)
                serviceIsStart = true
            }
            else{
                Log.e(TAG,"Service stop.....")
                stopService(intentService)
                serviceIsStart = false
            }
        }
    }
}