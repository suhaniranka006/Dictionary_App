package com.example.dictionary_app


import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // {word} ko dynamically replace karenge user input se
    @GET("api/v2/entries/en/{word}")
    suspend fun getMeaning(@Path("word") word: String): List<DictionaryResponse>
}
