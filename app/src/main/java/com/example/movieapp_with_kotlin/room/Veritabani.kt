package com.example.movieapp_with_kotlin.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp_with_kotlin.data.entity.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Veritabani : RoomDatabase(){
    abstract fun getFilmlerDao() : FilmlerDao
}