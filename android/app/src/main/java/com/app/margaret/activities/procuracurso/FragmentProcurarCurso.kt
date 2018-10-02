package com.app.margaret.activities.procuracurso

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import com.app.margaret.activities.empresa.EmpresaModel
import com.app.margaret.activities.empresa.adapter.EmpresaAdapter
import kotlinx.android.synthetic.main.layout_cursos.*

class FragmentProcurarCurso  : Fragment() {

    lateinit var adapter : EmpresaAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_cursos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    fun setUp() {
        recyclerCursos.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        adapter = EmpresaAdapter(requireContext())
        recyclerCursos.adapter = adapter

        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Synkha", "8 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Fretebras", "13 vagas"))
        adapter.addMessage(empresa = EmpresaModel("http://i.imgur.com/DvpvklR.png", "Google", "2 vagas"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(isVisibleToUser) {
            setUp()
        }
    }

}

