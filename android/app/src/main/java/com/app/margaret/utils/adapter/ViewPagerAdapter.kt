package com.app.margaret.utils.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import java.nio.file.Files.size
import android.support.v4.app.FragmentPagerAdapter


class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val mFragmentList = ArrayList<Fragment>()
    private val mText = ArrayList<String>()


    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment, text: String) {
        mFragmentList.add(fragment)
        mText.add(text)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mText[position]
    }
}