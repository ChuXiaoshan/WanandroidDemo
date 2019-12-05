package com.cxsplay.wad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.BusUtils


class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG_NO_PARAM: String = "TagNoParam"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @BusUtils.Bus(tag = TAG_NO_PARAM)
    fun ddd() {
//        LogUtils.d("----ddd")
//        findNavController(R.id.nav_main_main).navigate(R.id.aaa)
    }

    override fun onStart() {
        super.onStart()
        BusUtils.register(this)
    }

    override fun onStop() {
        super.onStop()
        BusUtils.unregister(this)
    }
}