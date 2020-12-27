package com.sammidev.studentAuth.payload.request

data class StudentForgotPasswordRequest(
        var nim: String,
        var email: String?,
        var phoneNumber: String?){

    constructor(nim: String,phoneNumber: String?) :
            this(nim, null, phoneNumber)
}