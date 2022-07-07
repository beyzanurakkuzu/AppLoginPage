package com.beyzaakkuzu.login.ui

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.beyzaakkuzu.login.R
import com.beyzaakkuzu.login.core.BaseActivity
import com.beyzaakkuzu.login.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    var navController:NavController?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController= Navigation.findNavController(this,R.id.nav_host_fragment)
            }

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }
}