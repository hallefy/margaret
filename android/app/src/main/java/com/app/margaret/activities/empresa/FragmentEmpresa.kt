package com.app.margaret.activities.empresa

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import com.app.margaret.activities.empresa.adapter.EmpresaAdapter
import kotlinx.android.synthetic.main.fragment_empresa.*

class FragmentEmpresa : Fragment() {

    lateinit var adapter : EmpresaAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_empresa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun setUp() {
        val text = "<b>A Chave de sucesso</b> para as empresas mais quentes do mercado"
        tvPrograpandaEmpresa.text = Html.fromHtml(text)

        recyclerCursos.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        adapter = EmpresaAdapter(requireContext())
        recyclerCursos.adapter = adapter

        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Synkha", "8 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Fretebras", "13 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Google", "2 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Facebook", "4 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Google", "2 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Facebook", "4 vagas"))


    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(isVisibleToUser) {
            setUp()


        }
    }
}