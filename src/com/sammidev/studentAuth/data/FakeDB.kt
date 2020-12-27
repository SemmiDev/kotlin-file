package com.sammidev.studentAuth.data

import com.sammidev.studentAuth.entity.StudentSignUp
import com.sammidev.studentAuth.payload.request.StudentSignInRequest
import com.sammidev.studentAuth.payload.request.StudentSignUpRequest

class FakeDB {
    companion object {
        @JvmStatic
        var databaseStudent = mutableListOf(
                mutableMapOf(1 to StudentSignUpRequest("sammidev1","2003113941","sammidev1","sammidev1@gmail.com","0000000001")),
                mutableMapOf(2 to StudentSignUpRequest("sammidev2","2003113942","sammidev2","sammidev2@gmail.com","0000000002")),
                mutableMapOf(3 to StudentSignUpRequest("sammidev3","2003113943","sammidev3","sammidev3@gmail.com","0000000003")),
                mutableMapOf(4 to StudentSignUpRequest("sammidev4","2003113944","sammidev4","sammidev4@gmail.com","0000000004")),
                mutableMapOf(5 to StudentSignUpRequest("sammidev5","2003113945","sammidev5","sammidev5@gmail.com","0000000005"))
        )
    }
}