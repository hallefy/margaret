package com.app.margaret.activities.chat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.app.margaret.R
import com.app.margaret.utils.adapter.Message
import com.app.margaret.utils.adapter.MessageAdapter
import kotlinx.android.synthetic.main.activity_chat.*

class ActivityChat : AppCompatActivity() {

    private lateinit var adapter: MessageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        messageList.layoutManager = LinearLayoutManager(this)
        adapter = MessageAdapter(this)
        messageList.adapter = adapter

        btnEnviar.setOnClickListener {
                var message = Message(
                        etMensagem.text.toString(),
                        1
                )

            var messageBot = Message(
                    "Teste mensagem",
                    2
            )
            setupPusher(message)
            setupPusher(messageBot)
        }
    }

    private fun setupPusher(message: Message) {
        runOnUiThread {
            adapter.addMessage(message)
            messageList.scrollToPosition(adapter.itemCount - 1)
        }
    }
}
