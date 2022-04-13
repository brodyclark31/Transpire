package com.brodyclark_l2.transpire.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brodyclark_l2.transpire.data.database.TranspireRepository


class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass
            .getConstructor(TranspireRepository::class.java, Context::class.java)
            .newInstance(TranspireRepository.getInstance(context), context)
    }
}