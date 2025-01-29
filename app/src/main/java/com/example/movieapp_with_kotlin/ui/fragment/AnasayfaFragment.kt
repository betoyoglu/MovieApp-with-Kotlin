package com.example.movieapp_with_kotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieapp_with_kotlin.R
import com.example.movieapp_with_kotlin.data.entity.Filmler
import com.example.movieapp_with_kotlin.databinding.FragmentAnasayfaBinding
import com.example.movieapp_with_kotlin.ui.adapter.FilmlerAdapter
import com.example.movieapp_with_kotlin.ui.viewModel.AnasayfaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container,false)

        binding.anasayfaToolbarBaslik = "filmler"

        viewModel.filmlerListesi.observe(viewLifecycleOwner){
            val filmlerAdapter = FilmlerAdapter(requireContext(), it)
            binding.filmlerAdapter= filmlerAdapter
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

    }
