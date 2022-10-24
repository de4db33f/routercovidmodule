package com.example.routercovidmodule.covidmodule

import androidx.fragment.app.Fragment
import com.example.covidmodule.main_module.view.MainViewFragment

class RouterApp {
    fun getFragment(): Fragment {
        return MainViewFragment.newInstance()
    }
}