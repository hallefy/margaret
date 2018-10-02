package com.app.margaret.activities.salvos

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import com.app.margaret.utils.TypeWriter
import com.app.margaret.utils.adapter.Message
import kotlinx.android.synthetic.main.card_cursos_salvos.view.*
import kotlinx.android.synthetic.main.card_mensagens_bot.view.*

class SalvosAdapter(var context: Context): RecyclerView.Adapter<SalvosViewHolder>() {

    private val messages: ArrayList<SalvosModel> = ArrayList()

    fun addMessage(message: SalvosModel){
        messages.add(message)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return messages.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalvosViewHolder {
        return SalvosViewHolder(LayoutInflater.from(context).inflate(R.layout.card_cursos_salvos, parent, false))

    }

    override fun onBindViewHolder(holder: SalvosViewHolder, position: Int) {
        val message = messages[position]
        holder.bind(message)
    }
}

open class SalvosViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    var imagem = view.icCursosSalvos
    var titulo = view.tvTitleCursosSalvos
    var descricao = view.tvInfoAplicacao
    var pessoas = view.tvInfoPessoas


    open fun bind(message: SalvosModel) {
        titulo.text = message.titulo
        descricao.text = message.descricao
        pessoas.text = message.infoPessoas
    }
}