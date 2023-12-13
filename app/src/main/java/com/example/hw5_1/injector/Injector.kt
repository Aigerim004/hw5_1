package com.example.hw5_1.injector

import com.example.hw5_1.model.Model
import com.example.hw5_1.presenter.Presenter

class Injector {
    companion object {
        fun fillModel() = Model()
        fun fillPresenter() = Presenter()
    }
}