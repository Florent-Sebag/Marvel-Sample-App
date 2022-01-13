package com.sebag.florent.presenter.view.home

import androidx.lifecycle.Lifecycle
import com.sebag.florent.domain.usecases.CharacterListUseCase
import com.sebag.florent.presenter.view.base.BaseVM
import javax.inject.Inject

class HomeVM
@Inject constructor(
    private val characterListUseCase: CharacterListUseCase
): BaseVM() {

//    private val _characterList = MutableLiveData<String>()
//    val characterList : LiveData<String>
//        get() = _characterList

    fun launchPagingCharacterList(lifecycle: Lifecycle, characterAdapter: CharacterAdapter) {
        characterListUseCase.getPagingCharacterList().subscribe {
            characterAdapter.submitData(lifecycle, it)
        }.addToDisposable()
    }
}