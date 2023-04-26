package com.learning.topics.mvvm_demo.ui.repo_class

import com.learning.topics.mvvm_demo.ui.model.User
import kotlinx.coroutines.delay

class UserRepository {
   // var user: User =
    suspend fun getUserlist() : List<User> {

       // delay(10000)
        val users:List<User> = listOf(
            User(1, "Vikrant Singh Rawat"),
            User(2, "Ram Singh"),
            User(3, "Sanjay Singh"),
            User(4, "Ashish"),
            User(5, "Rohit B")
        )

        return users
    }
}