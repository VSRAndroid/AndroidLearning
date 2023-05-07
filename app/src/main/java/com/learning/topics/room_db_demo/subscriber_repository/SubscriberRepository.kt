package com.learning.topics.room_db_demo.subscriber_repository

import com.learning.topics.room_db_demo.db.Subscriber
import com.learning.topics.room_db_demo.db.SubscriberDAO

class SubscriberRepository(private  val dao:SubscriberDAO) {

    val subscribers = dao.getAllSubscriber()

    suspend fun insert(subscriber: Subscriber){
           dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber){
        dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber){
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}