package com.example.samplechatapp.model

import android.os.Parcelable
import java.util.*
import org.parceler.Parcel

@Parcel(Parcel.Serialization.BEAN)
data class User(val uid: String, val createdAt: Date, val signedInAt: Date, val name: String)