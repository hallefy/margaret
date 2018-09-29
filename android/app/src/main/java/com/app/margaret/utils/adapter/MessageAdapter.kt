package com.app.margaret.utils.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.app.margaret.R
import com.app.margaret.utils.TypeWriter
import kotlinx.android.synthetic.main.card_mensagens_bot.view.*
import kotlinx.android.synthetic.main.card_mensagens_usuario.view.*

private const val VIEW_TYPE_MY_MESSAGE = 1
private const val VIEW_TYPE_BOT_MESSAGE = 2

class MessageAdapter(val context: Context) : RecyclerView.Adapter<MessageViewHolder>() {
    private val messages: ArrayList<Message> = ArrayList()

    fun addMessage(message: Message){
        messages.add(message)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    override fun getItemViewType(position: Int): Int {
        val message = messages[position]

        return if(message.user == 1) {
            VIEW_TYPE_MY_MESSAGE
        }
        else {
            VIEW_TYPE_BOT_MESSAGE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return if(viewType == VIEW_TYPE_MY_MESSAGE) {
            MyMessageViewHolder(LayoutInflater.from(context).inflate(R.layout.card_mensagens_usuario, parent, false))
        } else {
            OtherMessageViewHolder(LayoutInflater.from(context).inflate(R.layout.card_mensagens_bot, parent, false))
        }
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.bind(message)
    }

    inner class MyMessageViewHolder (view: View) : MessageViewHolder(view) {
        private var messageText: TextView = view.tvMensagemUsuario

        override fun bind(message: Message) {
            messageText.text = message.mensagem
        }
    }

    inner class OtherMessageViewHolder (view: View) : MessageViewHolder(view) {
        private var messageText: TypeWriter = view.tvMensagemBot

        override fun bind(message: Message) {
            messageText.setCharacterDelay(100)
            messageText.animateText(message.mensagem)
        }
    }
}

open class MessageViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    open fun bind(message:Message) {

    }
}