package com.cxsplay.wad.main.home


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.blankj.utilcode.util.BusUtils
import com.blankj.utilcode.util.LogUtils
import com.cxsplay.wad.MainActivity
import com.cxsplay.wad.R
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d("---onCreate---")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        LogUtils.d("---onCreateView---")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
        LogUtils.d("---onActivityCreated---")
    }

    private fun init() {
        btn.setOnClickListener {
            startActivity(Intent(requireActivity(), DetailActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        LogUtils.d("---onResume---")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.d("---onPause---")
    }
}
