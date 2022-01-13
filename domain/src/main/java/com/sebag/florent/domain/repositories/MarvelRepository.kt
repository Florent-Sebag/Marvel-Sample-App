package com.sebag.florent.domain.repositories

import androidx.paging.PagingData
import com.sebag.florent.domain.models.CharacterModel
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single

interface MarvelRepository {

    fun retrieveCharacterList() : Flowable<PagingData<CharacterModel>>

    fun retrieveCharacterDetails(id: Int) : Single<CharacterModel>
}