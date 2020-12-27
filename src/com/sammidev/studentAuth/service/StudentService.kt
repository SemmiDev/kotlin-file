package com.sammidev.studentAuth.service

import com.sammidev.studentAuth.payload.request.StudentForgotPasswordRequest
import com.sammidev.studentAuth.payload.request.StudentSignInRequest
import com.sammidev.studentAuth.payload.request.StudentSignUpRequest
import com.sammidev.studentAuth.payload.response.StudentForgotPasswordResponse
import com.sammidev.studentAuth.payload.response.StudentSignInResponse
import com.sammidev.studentAuth.payload.response.StudentSignUpResponse

interface StudentService {

    fun signIn(studentSignInRequest: StudentSignInRequest): StudentSignInResponse
    fun signUp(studentSignUpRequest: StudentSignUpRequest): StudentSignUpResponse
    fun forgotPassword(studentForgotPasswordRequest: StudentForgotPasswordRequest): StudentForgotPasswordResponse
}