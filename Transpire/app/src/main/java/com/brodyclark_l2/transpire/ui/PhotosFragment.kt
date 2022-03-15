package com.brodyclark_l2.transpire.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brodyclark_l2.transpire.databinding.PhotosPageBinding

class PhotosFragment: Fragment() {

    private var _binding: PhotosPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = PhotosPageBinding.inflate(inflater, container, false)

        val postPhotoButton = binding.postPhotoButton
        postPhotoButton.setOnClickListener {
            Toast.makeText(requireContext(), "This will access camera or camera roll", Toast.LENGTH_SHORT).show()
        }
        val postCommentButton = binding.postCommentButton
        postCommentButton.setOnClickListener {
            Toast.makeText(requireContext(), "Popup window for comment to be posted", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}