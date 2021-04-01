package com.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var mContador = MutableLiveData<String>().apply { value = contador.toString() }

    private var contador: Int = 0

    private fun setmContador() {
        mContador.value = contador.toString()
    }

    private fun validaContador() {
        this.contador++
        if(this.contador >= 6) {
            this.contador = 0
        }
        setmContador()
    }

    fun contador() {
        validaContador()
    }

}