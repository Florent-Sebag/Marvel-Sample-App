package com.sebag.florent.presenter.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sebag.florent.presenter.di.utils.ViewModelFactory
import com.sebag.florent.presenter.di.utils.ViewModelKey
import com.sebag.florent.presenter.view.home.HomeVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeVM::class)
    abstract fun bindHomeViewModel(homeVM: HomeVM) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory

}