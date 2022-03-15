package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.brodyclark_l2.transpire.databinding.LocationDetailsBinding

class LocationDetailsFragment: Fragment() {

    private var _binding: LocationDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LocationDetailsBinding.inflate(inflater, container, false)

        return binding.root
    }
}