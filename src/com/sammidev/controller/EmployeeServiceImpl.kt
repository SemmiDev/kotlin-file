package com.sammidev.controller

import com.sammidev.entity.Employee
import com.sammidev.repository.EmployeeRepository
import com.sammidev.service.EmployeeService

class EmployeeServiceImpl : EmployeeService {
    private val employeeRepository = EmployeeRepository()

    override fun readEmployeeFile() = employeeRepository.readEmployeeFile()
    override fun findAllEmployees(): List<Employee> = employeeRepository.findAllEmployees()
    override fun findByNomor(nomor: String): Employee? = employeeRepository.findByNomor(nomor)
    override fun findByName(name: String): Employee? = employeeRepository.findByName(name)
}