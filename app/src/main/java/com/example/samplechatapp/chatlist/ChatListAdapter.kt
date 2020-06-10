package com.example.samplechatapp.chatlist

import android.content.Intent
import android.os.Parcel
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.samplechatapp.chatMessages.ChatMessagesActivity
import com.example.samplechatapp.model.Chat
import org.parceler.Parcels

class ChatListAdapter(private val chats: List<Chat>): RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = ChatListItemView(parent.context)
        view.setOnClickListener {
            val itemView = it as ChatListItemView
            val intent = Intent(parent.context, ChatMessagesActivity::class.java)
            itemView.chat?.let {
                intent.putExtra("CHAT", Parcels.wrap(it))
            }
            parent.context.startActivity(intent)
        }
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chats.count()
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.view.configure(chats[position])
    }
}