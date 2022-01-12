package com.sebag.florent.marvel_sample_app

import android.app.Application
import com.sebag.florent.marvel_sample_app.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MarvelApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    @Override
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}