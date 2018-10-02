package com.app.margaret.activities.salvos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import kotlinx.android.synthetic.main.fragment_cursos_salvos.*

class FragmentCursosSalvos : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cursos_salvos, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun setUp() {
        recyclerSalvos.layoutManager = LinearLayoutManager(requireContext())
        var adapter = SalvosAdapter(requireContext())
        recyclerSalvos.adapter = adapter

        adapter.addMessage(SalvosModel("",
                "Introdução a programação",
                "Você aplicará os conhecimetnos em programação a problemas reais",
                "15 pessoas curtiram isso."))
        adapter.addMessage(SalvosModel("",
                "Introdução a programação",
                "Você aplicará os conhecimetnos em programação a problemas reais",
                "15 pessoas curtiram isso."))
        adapter.addMessage(SalvosModel("",
                "Introdução a programação",
                "Você aplicará os conhecimetnos em programação a problemas reais",
                "15 pessoas curtiram isso."))
        adapter.addMessage(SalvosModel("",
                "Introdução a programação",
                "Você aplicará os conhecimetnos em programação a problemas reais",
                "15 pessoas curtiram isso."))
        adapter.addMessage(SalvosModel("",
                "Introdução a programação",
                "Você aplicará os conhecimetnos em programação a problemas reais",
                "15 pessoas curtiram isso."))

    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(isVisibleToUser) {
           // setUp()
        }
    }
}