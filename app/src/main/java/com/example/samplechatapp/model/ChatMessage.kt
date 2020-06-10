package com.example.samplechatapp.model

import android.os.Parcelable
import org.parceler.Parcel
import java.util.*

@Parcel(Parcel.Serialization.BEAN)
class ChatMessage(val text: String, from: User, to: User, val createdAt: Date)