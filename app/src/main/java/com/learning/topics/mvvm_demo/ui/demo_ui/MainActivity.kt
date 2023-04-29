package com.learning.topics.mvvm_demo.ui.demo_ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.learning.topics.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    var countTextView:TextView ?= null
    var  clickBtn: Button?= null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickBtn = findViewById(R.id.clickBtn)
        countTextView = findViewById(R.id.countTextView)
        // below code for learn async and await
        /*CoroutineScope(IO).launch {
            val firstValue = async { firstTask() }
            val secondValue = async { secondTask() }

            val totalValue = firstValue.await() + secondValue.await()
            Log.e("MainActivity Total Value ", "Is "+ totalValue)
        }*/

        clickBtn?.setOnClickListener(View.OnClickListener {
            CoroutineScope(Main).launch {
                countTextView?.text = UserDataManager().getTotalValue().toString()
                Log.e("get value",".."+ UserDataManager().getTotalValue().toString())
            }
        })
    }

  /*  suspend fun firstTask() : Int{
        delay(10000)
        Log.e("MainActivity First Task ","Is Running.")
        return 5000
    }

    suspend fun secondTask() : Int{
        delay(8000)
        Log.e("MainActivity Second Task ","Is Running.")
        return 700
    }*/
}