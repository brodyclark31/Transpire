package com.brodyclark_l2.transpire.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brodyclark_l2.transpire.data.database.TranspireRepository


class ViewModelFactory(private val transpireRepository: TranspireRepository) : ViewModelProvider.Factory {
    fun getViewModelClass() = TranspireRepository::class.java
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if( modelClass.isAssignableFrom(UserDataViewModel::class.java) ) {
            @Suppress("UNCHECKED_CAST")
            return UserDataViewModel(transpireRepository) as T
        }
//            return modelClass
//                .getConstructor(TranspireRepository::class.java)
//                .newInstance(transpireRepository)
        throw IllegalArgumentException("Unknown ViewModel")
    }
}

//class ViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return modelClass
//            .getConstructor(TranspireRepository::class.java, Context::class.java)
//            .newInstance(TranspireRepository.getInstance(context), context)
//    }
//}