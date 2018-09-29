package com.app.margaret.utils

import android.content.Context
import android.os.Handler
import android.util.AttributeSet
import android.widget.TextView
import android.support.v4.os.HandlerCompat.postDelayed

open class TypeWriter : TextView {

    private var mText: CharSequence? = null
    private var mIndex: Int = 0
    private var mDelay: Long = 300 // in ms
    private val mHandler = Handler()

    private val characterAdder = object : Runnable {
        override fun run() {
            text = mText!!.subSequence(0, mIndex++)
            if (mIndex <= mText!!.length) {
                mHandler.postDelayed(this, mDelay)
            }
        }
    }

    fun animateText(txt: CharSequence) {
        mText = txt
        mIndex = 0

        text = ""
        mHandler.removeCallbacks(characterAdder)
        mHandler.postDelayed(characterAdder, mDelay)
    }

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}


    fun setCharacterDelay(m: Long) {
        mDelay = m
    }
}
