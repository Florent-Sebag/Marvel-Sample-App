package com.sebag.florent.presenter.view.base

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

abstract class BaseVM : ViewModel(){

    private var compositeDisposable = CompositeDisposable()

    protected fun Disposable.addToDisposable() {
        compositeDisposable.add(this)
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}