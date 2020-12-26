package com.sammidev.service

import com.sammidev.entity.Employee

interface EmployeeService {
    fun readEmployeeFile()
    fun findAllEmployees() : List<Employee>
    fun findByNomor(nomor: String): Employee?
    fun findByName(name: String): Employee?
}