package com.cxsplay.wad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.plusAssign
import androidx.navigation.ui.setupWithNavController
import com.cxsplay.wad.nav.KeepStateNavigator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val navController = Navigation.findNavController(this, R.id.fm_main1)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fm_main1)!!
        val navigator = KeepStateNavigator(this, navHostFragment.childFragmentManager, R.id.fm_main1)
        navController.navigatorProvider += navigator
        navController.setGraph(R.navigation.nav_main)
        bnv.setupWithNavController(navController)



//        MainScope().launch {
//            delay(3000)
//            Navigation.findNavController(this@MainActivity, R.id.fm_main1).navigate(R.id.action_action_home_to_detailFragment)
//        }
    }
}