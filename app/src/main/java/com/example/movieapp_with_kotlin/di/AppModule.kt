package com.example.movieapp_with_kotlin.di

import com.example.movieapp_with_kotlin.data.datasource.FilmlerDataSource
import com.example.movieapp_with_kotlin.data.repository.FilmlerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource() : FilmlerDataSource{
        return FilmlerDataSource()
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds: FilmlerDataSource) : FilmlerRepository{
        return FilmlerRepository(fds)
    }
}