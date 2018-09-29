package com.app.margaret.activities.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.app.margaret.R
import com.app.margaret.activities.cursos.FragmentCursos
import com.app.margaret.activities.empresa.FragmentEmpresa
import com.app.margaret.activities.procuracurso.FragmentProcurarCurso
import com.app.margaret.activities.salvos.FragmentSalvos
import com.app.margaret.utils.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_home.*


class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_home)
        setPageAdapter()

        bottom_navigation.itemIconTintList = null
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> viewPager.currentItem = 0
                R.id.action_empresas -> viewPager.currentItem = 1
                R.id.action_cursos -> viewPager.currentItem = 2
                R.id.action_salvos -> viewPager.currentItem = 3
                R.id.action_amigos -> viewPager.currentItem = 4

            }
            false
        }
    }


    fun setPageAdapter() {
        var adapter  = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FragmentCursos(), "Home")
        adapter.addFragment(FragmentEmpresa(), "Empresa")
        adapter.addFragment(FragmentProcurarCurso(), "Cursos")
        adapter.addFragment(FragmentSalvos(), "Salvos")

        viewPager.adapter = adapter
    }

}
