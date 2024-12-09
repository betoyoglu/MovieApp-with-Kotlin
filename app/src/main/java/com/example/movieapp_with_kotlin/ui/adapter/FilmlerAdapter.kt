package com.example.movieapp_with_kotlin.ui.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.databinding.CardTasarimBinding

class FilmlerAdapter (var mContext:Context, var filmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){

        inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}