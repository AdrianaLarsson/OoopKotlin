package com.example.learnoopkotlin.com.shreks

import android.util.Log

class Person(

  var name: String

) {

    fun display() {
        Log.w(" Flickans namn är ", name)

    }
}