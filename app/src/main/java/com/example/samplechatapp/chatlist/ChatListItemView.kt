package com.example.samplechatapp.chatlist

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.samplechatapp.R
import com.example.samplechatapp.model.Chat

class ChatListItemView : LinearLayout {

    private lateinit var chatNameTextView: TextView
    var chat: Chat? = null
        private set

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        LayoutInflater.from(context).inflate(R.layout.sample_chat_list_item_view, this, true)
        chatNameTextView = findViewById(R.id.chatNameTextView)
    }

    fun configure(chat: Chat) {
        this.chat = chat
        chatNameTextView.text = chat.name
    }
}
