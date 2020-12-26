package com.sammidev

import com.sammidev.controller.AbsentServiceImpl
import com.sammidev.controller.EmployeeServiceImpl
import kotlin.test.assertNotNull

fun main() {
    val employeeServiceImpl =  EmployeeServiceImpl()
    employeeServiceImpl.readEmployeeFile()

    val absentServiceImpl =  AbsentServiceImpl()
    absentServiceImpl.readAbsentFile()

    val sammi = employeeServiceImpl.findByName("Sammi")
    val dataWithNo = employeeServiceImpl.findByNomor("1001")
    val datas = employeeServiceImpl.findAllEmployees()
    val samAbsent = absentServiceImpl.findAllAbsent()

    assertNotNull(sammi)
    assertNotNull(dataWithNo)
    assertNotNull(datas)
    assertNotNull(samAbsent)
}



