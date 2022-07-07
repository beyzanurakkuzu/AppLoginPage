package com.beyzaakkuzu.login.ui

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.beyzaakkuzu.login.R
import com.beyzaakkuzu.login.core.BaseActivity
import com.beyzaakkuzu.login.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : BaseActivity<ActivityMainBinding>() {

    lateinit var auth:FirebaseAuth
    var navController:NavController?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController= Navigation.findNavController(this,R.id.nav_host_fragment)
        auth= FirebaseAuth.getInstance()
            }

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }


}