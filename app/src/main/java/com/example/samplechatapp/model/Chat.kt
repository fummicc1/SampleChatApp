package com.example.samplechatapp.model

import android.os.Parcelable
import org.parceler.Parcel
import java.util.*

@Parcel(Parcel.Serialization.BEAN)
data class Chat(val name: String, val messages: List<ChatMessage>, val users: List<User>, val createdAt: Date = Date(), val updatedAt: Date = Date())

