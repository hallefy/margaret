package com.app.margaret.activities.salvos

import android.content.Context
import android.os.Bundle
import android.support.constraint.Placeholder
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.margaret.R
import com.app.margaret.utils.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_salvos.*

class FragmentSalvos : Fragment(){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_salvos, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setUp() {
//        var viewPaging = view?.findViewById<ViewPager>(R.id.viewPagerSalvos)
//        var adapter = ViewPagerAdapter(requireActivity().supportFragmentManager)
//
//        adapter.addFragment(FragmentCursosSalvos(), "Cursos")
//        adapter.addFragment(FragmentEmpresasSalvas(), "Empresas")
//        viewPaging?.adapter = adapter
//        tablayout.setupWithViewPager(viewPaging)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(isVisibleToUser && context != null) {
            setUp()
        }
    }
}