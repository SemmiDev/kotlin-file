package com.sammidev.studentAuth

import com.sammidev.studentAuth.payload.request.StudentForgotPasswordRequest
import com.sammidev.studentAuth.payload.request.StudentSignInRequest
import com.sammidev.studentAuth.payload.request.StudentSignUpRequest
import com.sammidev.studentAuth.service.serviceImplementation.StudentServiceImpl

class Application {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {
            var a = StudentServiceImpl().signIn(StudentSignInRequest("2003113941", "sammidev1"))
            val b = StudentServiceImpl().signIn(StudentSignInRequest("2003113942", "sammidev3"))

            val c = StudentServiceImpl().signUp(StudentSignUpRequest("sammidevUP","1111111111","1111111111","sammidevUP@gmail.com","0000000000"))
            val d = StudentServiceImpl().signUp(StudentSignUpRequest("sammidevUP","1111111112","1111111112","sammidevUP@gmail.com","0000000000"))
            val e = StudentServiceImpl().signUp(StudentSignUpRequest("sammidevUP","1111111113","1111111113","sammidevUP@gmail.com","0000000000"))

            val aa = StudentServiceImpl().signIn(StudentSignInRequest("1111111111", "1111111111"))
            val bb = StudentServiceImpl().signIn(StudentSignInRequest("1111111112", "1111111112"))
            val cc = StudentServiceImpl().signIn(StudentSignInRequest("1111111113", "1111111113"))


            val forgot = StudentServiceImpl().forgotPassword(StudentForgotPasswordRequest("2003113941","0000000001"))
            println(forgot)

            println("nim : ")
            val nim = readLine()
            println("pass : ")
            val pass = readLine()
            a = StudentServiceImpl().signIn(StudentSignInRequest(nim!!, pass!!))
            println(a)

            println(c)
            println(d)
            println(e)

            println(aa)
            println(bb)
            println(cc)






















        }
    }
}