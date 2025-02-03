package com.example.movieapp_with_kotlin.data.datasource

import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.room.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var fdao: FilmlerDao) {

    suspend fun filmleriYukle():List<Filmler> =
        withContext(Dispatchers.IO){

            return@withContext fdao.filmleriYukle()
        }
}