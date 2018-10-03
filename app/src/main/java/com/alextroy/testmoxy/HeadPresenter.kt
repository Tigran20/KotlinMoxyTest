package com.alextroy.testmoxy

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView

@InjectViewState
class MyPresenter : MvpPresenter<HeadView>() {

    fun success() {
        viewState.showMessage()
    }
}

interface HeadView : MvpView {
    fun showMessage()
}