package com.geeks.mvvm_5hw4

class CounterModel {

    private var count = 0

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    fun getCount(): Int {
        return count
    }
}