package com.example.dagger_hilt.dependencies

import android.util.Log
import javax.inject.Inject
class Car {
    @Inject
    constructor()
    fun getCar()
    {
        Log.d("getCar","Car is Running...")
    }
}