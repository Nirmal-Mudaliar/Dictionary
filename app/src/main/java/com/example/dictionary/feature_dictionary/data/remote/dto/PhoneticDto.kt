package com.example.dictionary.feature_dictionary.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val license: LicenseXDto,
    val sourceUrl: String,
    val text: String
)