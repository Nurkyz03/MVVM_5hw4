package com.geeks.mvvm_5hw4

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val model = CounterModel()

    val counterData = MutableLiveData<Int>()
    val toastMessage = MutableLiveData<String>()
    val textColor = MutableLiveData<Int>()

    private fun updateCounter() {
        counterData.value = model.getCount()

        when (model.getCount()) {
            10 -> toastMessage.value = "Поздравляем!"
            15 -> textColor.value = Color.GREEN
            else -> textColor.value = Color.BLACK
        }
    }

    fun increment(){
        model.increment()
        counterData.value = model.getCount()
        updateCounter()
    }

    fun decrement(){
        model.decrement()
        counterData.value = model.getCount()
        updateCounter()
    }
}