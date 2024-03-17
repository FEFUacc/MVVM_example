package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyVm : ViewModel() {

    val count =  MutableLiveData<Int>(0)

    fun updateCount() {
        count.value = count.value?.plus(1)
    }

}