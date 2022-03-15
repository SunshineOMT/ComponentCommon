package com.mixc.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class MCBaseFragment: Fragment(), MCBaseInitInterface {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initViews()
        initData()
        return inflater.inflate(getLayoutId(), container, false)
    }
}