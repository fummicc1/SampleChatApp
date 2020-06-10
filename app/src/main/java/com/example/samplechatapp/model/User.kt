package com.example.samplechatapp.model

import java.util.*

data class User(val uid: String, val createdAt: Date, val signedInAt: Date, val name: String)
