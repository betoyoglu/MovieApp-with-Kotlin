package com.example.movieapp_with_kotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieapp_with_kotlin.R
import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.databinding.FragmentAnasayfaBinding
import com.example.movieapp_with_kotlin.ui.adapter.FilmlerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "filmler"

        binding.filmRv.layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Django", "django" ,24)
        val f2 = Filmler(2,"Interstellar", "interstellar" ,32)
        val f3 = Filmler(3,"Inception", "inception" ,28)
        val f4 = Filmler(4,"The Hateful Eight", "thehatefuleight" ,24)
        val f5 = Filmler(5,"The Pianist", "thepianist" ,18)
        val f6 = Filmler(6,"Anadoluda", "anadoluda" ,10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val filmlerAdapter = FilmlerAdapter(requireContext(), filmlerListesi)
        binding.filmRv.adapter= filmlerAdapter
        return binding.root
    }


    }
