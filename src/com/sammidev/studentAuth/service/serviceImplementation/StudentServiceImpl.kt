package com.sammidev.studentAuth.service.serviceImplementation

import com.sammidev.studentAuth.payload.request.StudentForgotPasswordRequest
import com.sammidev.studentAuth.payload.request.StudentSignInRequest
import com.sammidev.studentAuth.payload.request.StudentSignUpRequest
import com.sammidev.studentAuth.payload.response.StudentForgotPasswordResponse
import com.sammidev.studentAuth.payload.response.StudentSignInResponse
import com.sammidev.studentAuth.payload.response.StudentSignUpResponse
import com.sammidev.studentAuth.repository.StudentForgotRepository
import com.sammidev.studentAuth.repository.StudentSignInRepository
import com.sammidev.studentAuth.repository.StudentSignUpRepository
import com.sammidev.studentAuth.service.StudentService

class StudentServiceImpl : StudentService {

    val studentSignInRepository = StudentSignInRepository()
    val studentSignUpRepository = StudentSignUpRepository()
    val studentForgotRepository = StudentForgotRepository()

    override fun signIn(studentSignInRequest: StudentSignInRequest): StudentSignInResponse {
        return this.studentSignInRepository.signIn(studentSignInRequest)
    }

    override fun signUp(studentSignUpRequest: StudentSignUpRequest): StudentSignUpResponse {
        return this.studentSignUpRepository.signUp(studentSignUpRequest)
    }

    override fun forgotPassword(studentForgotPasswordRequest: StudentForgotPasswordRequest): StudentForgotPasswordResponse {
        return this.studentForgotRepository.forgotPassword(studentForgotPasswordRequest)
    }
}