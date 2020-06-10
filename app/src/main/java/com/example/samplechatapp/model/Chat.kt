package com.example.samplechatapp.model

import java.util.*

data class Chat(val name: String, val messages: List<ChatMessage>, val users: List<User>, val createdAt: Date = Date(), val updatedAt: Date = Date())

