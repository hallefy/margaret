package com.app.margaret.activities.cursos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import kotlinx.android.synthetic.main.fragment_cursos.*

class FragmentCursos : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cursos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setUp() {
        var texto = "Cursos que <b>combinam com você</b>"
        propagandaCurso.text = Html.fromHtml(texto)
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
    }

    override fun getUserVisibleHint(): Boolean {
        return super.getUserVisibleHint()

    }
}