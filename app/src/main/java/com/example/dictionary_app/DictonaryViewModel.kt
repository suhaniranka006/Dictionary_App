package com.example.dictionary_app

import android.util.Log.e
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DictonaryViewModel(private val repository: DictionaryRepository) : ViewModel()  {

    val wordData = MutableLiveData<List<DictionaryResponse>>()
    val error = MutableLiveData<String>()


    fun fetchMeaning(word: String) {
        viewModelScope.launch {
            try {
                val response = repository.getMeaning(word)
                wordData.value = response
            } catch (e: Exception) {
                error.value = "Failed: ${e.message}"
            }
        }
    }
}