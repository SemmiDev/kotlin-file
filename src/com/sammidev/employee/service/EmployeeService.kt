package com.sammidev.employee.service

import com.sammidev.employee.entity.Employee

interface EmployeeService {
    fun readEmployeeFile()
    fun findAllEmployees() : List<Employee>
    fun findByNomor(nomor: String): Employee?
    fun findByName(name: String): Employee?
}