package com.app.margaret.activities.empresa.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import com.app.margaret.activities.empresa.EmpresaModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_empresas.view.*

class EmpresaAdapter (val context: Context) : RecyclerView.Adapter<EmpresaViewHolder>() {
    private val messages: ArrayList<EmpresaModel> = ArrayList()

    fun addMessage(empresa: EmpresaModel) {
        messages.add(empresa)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpresaViewHolder {
       return EmpresaViewHolder(LayoutInflater.from(context).inflate(R.layout.card_empresas, parent, false))
    }

    override fun onBindViewHolder(holder: EmpresaViewHolder, position: Int) {
        val message = messages[position]

        holder.bind(message)
    }
}


open class EmpresaViewHolder (var view: View) : RecyclerView.ViewHolder(view) {
    var tvNome = view.tvNomeEmpresa
    var tvVagas = view.tvVagas

    open fun bind(message: EmpresaModel) {

        tvNome.text = message.nome
        tvVagas.text = message.vagas

    }
}