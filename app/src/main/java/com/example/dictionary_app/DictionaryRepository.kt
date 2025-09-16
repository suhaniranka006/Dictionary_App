package com.example.dictionary_app

class DictionaryRepository {

    suspend fun getMeaning(word: String): List<DictionaryResponse> {
        return RetrofitInstance.api.getMeaning(word)
    }
}