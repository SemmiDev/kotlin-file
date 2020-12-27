package com.sammidev.studentAuth.payload.request

data class StudentSignUpRequest(
        var name: String,
        var nim: String,
        var password: String,
        var email: String,
        var phoneNumber: String,
)