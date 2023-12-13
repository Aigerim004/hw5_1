package com.example.hw5_1.view

interface CounterView {
    fun updateText(count: String)
    fun changeColor(color: Int)
    fun showToast()
}