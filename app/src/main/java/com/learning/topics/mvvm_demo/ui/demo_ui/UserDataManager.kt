package com.learning.topics.mvvm_demo.ui.demo_ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class UserDataManager {

    suspend fun getTotalValue() : Int{
        var count = 0
        CoroutineScope(IO).launch {
            delay(1000)
            count = 100
        }

         val getValue = CoroutineScope(IO).async {
            delay(10000)
            return@async 100
        }

        return  count + getValue.await()
    }
}