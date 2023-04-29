package com.learning.topics.ViewBindingDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.learning.topics.R
import com.learning.topics.databinding.ActivityViewBindingDemoBinding

class ViewBindingDemoActivity : AppCompatActivity() {

    lateinit var bindingDemoActivity: ActivityViewBindingDemoBinding
    var count:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_view_binding_demo)

        bindingDemoActivity = ActivityViewBindingDemoBinding.inflate(layoutInflater)
        setContentView(bindingDemoActivity.root)

        bindingDemoActivity.clickBtn.setOnClickListener {
            count++
            bindingDemoActivity.countTextView.text = "Hello Vikrant Good Morning!$count"
        }
    }
}