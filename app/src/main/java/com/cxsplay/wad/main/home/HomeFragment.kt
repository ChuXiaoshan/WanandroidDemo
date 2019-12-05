package com.cxsplay.wad.main.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.blankj.utilcode.util.BusUtils
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.ToastUtils
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
            //            startActivity(Intent(requireActivity(), DetailActivity::class.java))
//            findNavController(requireActivity(), R.id.fm_main_main).navigate(R.id.aaa)
            BusUtils.post(MainActivity.TAG_NO_PARAM)
            ToastUtils.showShort("click")
        }
    }

    @BusUtils.Bus(tag = MainActivity.TAG_NO_PARAM)
    fun ddd() {
        LogUtils.d("----ddd")
        findNavController().navigate(R.id.aaa)
    }

    override fun onStart() {
        super.onStart()
        BusUtils.register(this)
    }

    override fun onStop() {
        super.onStop()
        BusUtils.unregister(this)
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
