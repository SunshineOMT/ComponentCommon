package com.mixc.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class MCBaseActivity: AppCompatActivity(), MCBaseInitInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initViews()
        initData()
    }
}