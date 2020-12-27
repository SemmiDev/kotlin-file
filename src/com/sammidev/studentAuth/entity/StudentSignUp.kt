package com.sammidev.studentAuth.entity

data class StudentSignUp(
        var id: Long,
        var name: String,
        var nim: String,
        var password: String,
        var email: String,
        var phoneNumber: String,
)