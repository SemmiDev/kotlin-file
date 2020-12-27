package com.sammidev.studentAuth.payload.request

data class StudentSignInRequest(
        var nim: String,
        var password: String
)