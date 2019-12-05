package com.cxsplay.wad.main.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.blankj.utilcode.util.LogUtils
import com.cxsplay.wad.R
import kotlinx.android.synthetic.main.fragment_detail2.*

/**
 * A simple [Fragment] subclass.
 */
class Detail2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    private fun init() {
        btn.setOnClickListener {
            findNavController().navigate(R.id.action_detail2Fragment_to_detail3Fragment)
        }
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
