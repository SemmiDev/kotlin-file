package com.sammidev.studentAuth.payload

data class Responses<T>(
        val status: String,
        val data: T
)