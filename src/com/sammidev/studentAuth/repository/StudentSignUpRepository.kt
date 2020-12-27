package com.sammidev.studentAuth.repository

import com.sammidev.studentAuth.data.FakeDB
import com.sammidev.studentAuth.payload.request.StudentSignUpRequest
import com.sammidev.studentAuth.payload.response.StudentSignUpResponse
import com.sammidev.studentAuth.validation.Validation

class StudentSignUpRepository {
    private var databaseStudent = FakeDB.databaseStudent
    private var validation = Validation()

    fun signUp(studentSignUpRequest: StudentSignUpRequest): StudentSignUpResponse {
        val isNameValid =  validation.nameValidator(studentSignUpRequest.name)
        val isNimValid =  validation.nimValidator(studentSignUpRequest.nim)
        val isEmailValid =  validation.emailValidator(studentSignUpRequest.email)
        val isPhoneNumberValid =  validation.phoneNumberValidator(studentSignUpRequest.phoneNumber)
        val isPaswordValid =  validation.passwordValidator(studentSignUpRequest.password)

        if (isNameValid && isNimValid && isEmailValid && isPhoneNumberValid && isPaswordValid) {
            var size = this.databaseStudent.size-1
            val size2 = size++
            this.databaseStudent.add(size, mutableMapOf(size2 to
                    StudentSignUpRequest(studentSignUpRequest.name,studentSignUpRequest.nim,
                            studentSignUpRequest.password, studentSignUpRequest.email, studentSignUpRequest.phoneNumber)))
            return StudentSignUpResponse("OK")
        }

        return StudentSignUpResponse("ERROR")
    }
}