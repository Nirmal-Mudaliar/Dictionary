package com.example.dictionary.feature_dictionary.domain.model

import com.example.dictionary.feature_dictionary.data.remote.dto.LicenseDto
import com.example.dictionary.feature_dictionary.data.remote.dto.MeaningDto
import com.example.dictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String?,
    val word: String
)
