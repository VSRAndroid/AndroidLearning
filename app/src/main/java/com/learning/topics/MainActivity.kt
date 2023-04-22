package com.learning.topics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(IO).launch {
            val firstValue = async { firstTask() }
            val secondValue = async { secondTask() }

            val totalValue = firstValue.await() + secondValue.await()
            Log.e("MainActivity Total Value ", "Is "+ totalValue)
        }
    }

    suspend fun firstTask() : Int{
        delay(10000)
        Log.e("MainActivity First Task ","Is Running.")
        return 5000
    }

    suspend fun secondTask() : Int{
        delay(8000)
        Log.e("MainActivity Second Task ","Is Running.")
        return 700
    }
}