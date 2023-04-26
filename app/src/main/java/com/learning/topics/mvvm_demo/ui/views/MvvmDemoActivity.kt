package com.learning.topics.mvvm_demo.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.learning.topics.R
import com.learning.topics.mvvm_demo.ui.view_model.DemoViewModel

class MvvmDemoActivity : AppCompatActivity() {
    lateinit var viewModel: DemoViewModel
    //lateinit var dataBin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_demo)

        viewModel = ViewModelProvider(this).get(DemoViewModel::class.java)

        viewModel.getUserData()
        viewModel.users.observe(this, Observer {

            for (item in it){
                Log.e("User ","Name Is :- "+item.userName)
            }
        })
    }
}