package com.sammidev

import com.sammidev.employee.controller.AbsentServiceImpl
import com.sammidev.employee.controller.EmployeeServiceImpl

fun main() {
    val employeeServiceImpl =  EmployeeServiceImpl()
    employeeServiceImpl.readEmployeeFile()

    val absentServiceImpl =  AbsentServiceImpl()
    absentServiceImpl.readAbsentFile()

    val sammi = employeeServiceImpl.findByName("Sammi")
    val dataWithNo = employeeServiceImpl.findByNomor("1001")
    val datas = employeeServiceImpl.findAllEmployees()
    val samAbsent = absentServiceImpl.findAllAbsent()
}