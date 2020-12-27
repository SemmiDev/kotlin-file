package com.sammidev.studentAuth.repository

import com.sammidev.studentAuth.data.FakeDB
import com.sammidev.studentAuth.payload.request.StudentSignInRequest
import com.sammidev.studentAuth.payload.response.StudentSignInResponse
import com.sammidev.studentAuth.validation.Validation

class StudentSignInRepository {
    private val databaseStudent = FakeDB.databaseStudent
    private var validation = Validation()

    fun signIn(studentSignInRequest: StudentSignInRequest): StudentSignInResponse {
            val isNimValid =  validation.nimValidator(studentSignInRequest.nim)
            val isPaswordValid =  validation.passwordValidator(studentSignInRequest.password)
            if (isNimValid && isPaswordValid) {
                for (student in databaseStudent) {
                    for (value in student.values) {
                        if (studentSignInRequest.nim == value.nim &&
                                studentSignInRequest.password == value.password) {
                            return StudentSignInResponse("OK")
                        }
                    }
                }
            }
        return StudentSignInResponse("ERROR")
    }
}