package com.example.routercovidmodule.covidmodule

import androidx.fragment.app.Fragment
import com.example.covidmodule.CovidModule
import com.example.covidmodule.ICovidModule

class CovidModuleImpl :ICovidModule{
    override fun getCovidModuleFragment(): Fragment {
        return CovidModule.covidModuleFragmentHandler()
    }
}