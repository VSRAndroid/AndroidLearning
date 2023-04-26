package com.learning.topics.mvvm_demo.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.topics.R
import com.learning.topics.mvvm_demo.ui.views.ui.main.LifeCycleDemoFragment

class LifeCycleDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle_demo)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LifeCycleDemoFragment.newInstance())
                .commitNow()
        }


    }
}