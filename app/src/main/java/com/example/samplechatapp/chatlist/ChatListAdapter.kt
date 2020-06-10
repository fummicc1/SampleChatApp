package com.example.samplechatapp.chatlist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.samplechatapp.model.Chat

class ChatListAdapter(private val chats: Array<Chat>): RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = ChatListItemView()
        ChatViewHolder()
    }

    override fun getItemCount(): Int {
        return chats.count()
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.view.configure(chats[position])
    }
}