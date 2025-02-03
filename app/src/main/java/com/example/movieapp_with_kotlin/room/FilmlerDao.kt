package com.example.movieapp_with_kotlin.room

import androidx.room.Dao
import androidx.room.Query
import com.example.movieapp_with_kotlin.data.entity.Filmler

@Dao
interface FilmlerDao {
    @Query("SELECT * FROM filmler")
    suspend fun filmleriYukle() : List<Filmler>
}