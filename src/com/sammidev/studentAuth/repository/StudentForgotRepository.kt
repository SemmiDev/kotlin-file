package com.sammidev.studentAuth.repository

import com.sammidev.studentAuth.data.FakeDB
import com.sammidev.studentAuth.payload.request.StudentForgotPasswordRequest
import com.sammidev.studentAuth.payload.response.StudentForgotPasswordResponse
import com.sammidev.studentAuth.payload.response.StudentSignInResponse
import com.sammidev.studentAuth.validation.Validation

class StudentForgotRepository {
    private var databaseStudent = FakeDB.databaseStudent
    private var validation = Validation()

    fun forgotPassword(studentForgotPasswordRequest: StudentForgotPasswordRequest) : StudentForgotPasswordResponse {
        val isNimValid =  validation.nimValidator(studentForgotPasswordRequest.nim)
        val isPhoneNumberValid =  validation.phoneNumberValidator(studentForgotPasswordRequest.phoneNumber!!)

        if (isNimValid && isPhoneNumberValid) {
            val student = StudentForgotPasswordRequest(nim = studentForgotPasswordRequest.nim, phoneNumber = studentForgotPasswordRequest.phoneNumber)
            if (isNimValid && isPhoneNumberValid) {
                for (student in databaseStudent) {
                    for (value in student.values) {
                        if (studentForgotPasswordRequest.nim == value.nim && studentForgotPasswordRequest.phoneNumber == value.phoneNumber) {
                            println("Masukkan password baru : ")
                            val pass1 = readLine()

                            println("Masukkan password baru lagi : ")
                            val pass2 = readLine()

                            if (pass1 == pass2)  {
                                value.password = pass2!!
                                return StudentForgotPasswordResponse("OK")
                            }


                        }
                    }
                }
            }
        }
        return StudentForgotPasswordResponse("ERROR")
    }
}