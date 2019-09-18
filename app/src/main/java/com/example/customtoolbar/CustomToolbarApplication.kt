package com.example.customtoolbar

import android.app.Application

class CustomToolbarApplication :Application(){
    companion object{
        lateinit var instance: CustomToolbarApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}