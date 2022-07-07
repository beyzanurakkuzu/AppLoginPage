package com.beyzaakkuzu.login.core

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.beyzaakkuzu.login.ui.MainActivity

abstract class BaseFragment<DB:ViewDataBinding>:Fragment() {
    protected lateinit var viewBinding:DB
    var mainAct: MainActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainAct = context as MainActivity
    }

    @LayoutRes
    abstract fun getLayoutRes(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewBinding= DataBindingUtil.inflate(inflater,getLayoutRes(),container,false)
        return viewBinding.root

    }
}