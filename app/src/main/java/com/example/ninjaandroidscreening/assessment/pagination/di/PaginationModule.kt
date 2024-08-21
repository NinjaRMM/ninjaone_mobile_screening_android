package com.example.ninjaandroidscreening.assessment.pagination.di

import com.example.ninjaandroidscreening.assessment.pagination.CharacterListUseCase
import com.example.ninjaandroidscreening.assessment.pagination.CharacterService
import com.example.ninjaandroidscreening.assessment.pagination.network.getRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object PaginationViewModelModule {

    @ViewModelScoped
    @Provides
    fun providesCharacterListUseCase(
        service: CharacterService
    ) = CharacterListUseCase(service)

}

@Module
@InstallIn(SingletonComponent::class)
object PaginationModule {

    @Provides
    @Singleton
    fun providesCharacterService(): CharacterService = getRetrofit().create(CharacterService::class.java)

}
