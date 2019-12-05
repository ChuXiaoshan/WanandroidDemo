package com.cxsplay.wad.main.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.blankj.utilcode.util.LogUtils
import com.cxsplay.wad.R

/**
 * A simple [Fragment] subclass.
 */
class Detail3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail3, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d("---onCreate---")
    }

    override fun onResume() {
        super.onResume()
        LogUtils.d("---onResume---")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.d("---onPause---")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtils.d("---onDestroy---")
    }
}
