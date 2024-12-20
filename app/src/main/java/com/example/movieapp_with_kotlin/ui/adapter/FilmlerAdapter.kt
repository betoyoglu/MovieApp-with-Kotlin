package com.example.movieapp_with_kotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.databinding.CardTasarimBinding
import com.example.movieapp_with_kotlin.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter (var mContext:Context, var filmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){

        inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film= filmlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim, "drawable",
                mContext.packageName))

        t.textViewFiyat.text = "${film.fiyat} TL"

        t.cardViewFilm.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(film)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.buttonSepet.setOnClickListener {
            Snackbar.make(it, "${film.ad} sepete eklendi", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}