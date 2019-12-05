package com.cxsplay.wad.nav

import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.plusAssign

/**
 * Created by chuxiaoshan on 2019/12/5 16:22.
 *
 */

class CustomNavHostFragment : NavHostFragment() {
    override fun onCreateNavController(navController: NavController) {
        super.onCreateNavController(navController)
        navController.navigatorProvider += KeepStateNavigator(context!!, childFragmentManager, id)
    }
}