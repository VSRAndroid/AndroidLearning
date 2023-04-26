package com.learning.topics.mvvm_demo.ui.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learning.topics.mvvm_demo.ui.model.User
import com.learning.topics.mvvm_demo.ui.repo_class.UserRepository
import kotlinx.coroutines.*

class DemoViewModel : ViewModel() {

    //private var myJob: Job = Job()
    //private  val myScope = CoroutineScope(Dispatchers.IO + myJob)

    private  var userRepository : UserRepository = UserRepository()
    var users :MutableLiveData<List<User>> = MutableLiveData()
    fun getUserData(){
         viewModelScope.launch {
             var result : List<User>? = null
             withContext(Dispatchers.IO){
                 result = userRepository.getUserlist()
             }

             users.value = result
         }
    }

   /* override fun onCleared() {
        super.onCleared()
        myJob.cancel()
    }*/
}