package com.example.dictionary_app

class DictionaryResponse (
    val word:String,
    val meanings: List<Meaning>
)


data class Meaning(
    val partOfSpeech : String,
    val definitions: List<Definition>
)

data class Definition(
    val definition: String
)