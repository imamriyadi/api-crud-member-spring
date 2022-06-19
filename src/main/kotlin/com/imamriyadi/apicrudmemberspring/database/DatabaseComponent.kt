package com.imamriyadi.apicrudmemberspring.database

import com.mongodb.client.MongoClient
import org.litote.kmongo.KMongo
import org.springframework.stereotype.Component

@Component
class DatabaseComponent {
    companion object{
        private const val BD_URL =
            "mongodb+srv://imamriyadi:KHw65CvBKqnBtS6H@cluster0.goqesjg.mongodb.net/?retryWrites=true&w=majority"
    }
    val database:MongoClient = KMongo.createClient(BD_URL)
}