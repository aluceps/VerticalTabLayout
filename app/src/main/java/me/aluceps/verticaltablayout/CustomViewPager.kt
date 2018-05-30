package me.aluceps.verticaltablayout

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class CustomViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {

    private var isEnable = true

    override fun onTouchEvent(ev: MotionEvent?): Boolean = when (isEnable) {
        true -> try {
            super.onTouchEvent(ev)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
            false
        }
        else -> false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean = when (isEnable) {
        true -> try {
            super.onInterceptTouchEvent(ev)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
            false
        }
        else -> false
    }

    fun setPagingEnabled(isEnable: Boolean) {
        this.isEnable = isEnable
    }
}