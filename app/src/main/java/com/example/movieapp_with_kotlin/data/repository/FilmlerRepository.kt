package com.example.movieapp_with_kotlin.data.repository

import com.example.movieapp_with_kotlin.data.datasource.FilmlerDataSource
import com.example.movieapp_with_kotlin.data.entity.Filmler

class FilmlerRepository (var fds: FilmlerDataSource) {
    suspend fun filmleriYukle():List<Filmler> = fds.filmleriYukle()
}