package com.example.movieapp_with_kotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.movieapp_with_kotlin.R
import com.example.movieapp_with_kotlin.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        binding =FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs()
        val film = bundle.film

        binding.toolbarDetay.title = film.ad

        binding.ivFilm.setImageResource(
            resources.getIdentifier(film.resim, "drawable", requireContext().packageName)
        )

        binding.tvFiyat.text = "${film.fiyat} TL"

        return binding.root
    }


}