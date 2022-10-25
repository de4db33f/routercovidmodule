package com.example.routercovidmodule

import androidx.fragment.app.Fragment
import com.example.routercovidmodule.covidmodule.CovidModuleImpl

class RouterModule {

    private val covidModuleImpl: CovidModuleImpl = CovidModuleImpl()

    fun getCovidModuleFragment(): Fragment =
        covidModuleImpl.getCovidModuleFragment()

}