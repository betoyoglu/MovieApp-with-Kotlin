package com.example.movieapp_with_kotlin.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.data.repository.FilmlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel: ViewModel() {
    var frepo = FilmlerRepository()
    var filmlerListesi = MutableLiveData<List<Filmler>>()

    init {
        filmleriYukle()
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmlerListesi.value = frepo.filmleriYukle()
        }
    }
}