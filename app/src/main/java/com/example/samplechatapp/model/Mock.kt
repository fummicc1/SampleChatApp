package com.example.samplechatapp.model

import java.util.*

class Mock {

    fun createUser(userID: String, name: String): User {
        return  User(uid = userID, createdAt = Date(), signedInAt = Date(), name = name)
    }

    fun createChats(count: Int): List<Chat> {
        return (0..(count-1)).map { index ->
            val sourceUser: User = createUser(index)
            val destinationUser: User = createUser(index * 100)
           Chat(
               name = "Chat$index",
               messages = (0..10).map { createMessage(sourceUser, destinationUser) },
               users = listOf(sourceUser, destinationUser)
           )
        }
    }

    private fun createUser(index: Int): User {
        return User(uid = "testUserID${index}", createdAt = Date(), signedInAt = Date(), name = "testUserName")
    }

    private fun createMessage(from: User, to: User): ChatMessage {
        return ChatMessage(text = "Text", from = from, to = to, createdAt = Date())
    }
}