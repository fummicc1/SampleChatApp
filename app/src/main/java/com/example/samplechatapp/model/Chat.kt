package com.example.samplechatapp.model

import java.util.*

data class Chat(val messages: Array<ChatMessage>, val users: Array<User>, val createdAt: Date, val updatedAt: Date)

